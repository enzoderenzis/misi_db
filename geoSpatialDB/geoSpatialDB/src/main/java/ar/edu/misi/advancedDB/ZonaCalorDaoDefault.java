package ar.edu.misi.advancedDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.edu.misi.advancedDB.entities.ZonaCalor;

public class ZonaCalorDaoDefault extends BaseDao implements ZonasCalorDao {

    @Override
    public List<ZonaCalor> getAll() {
        this.connect();
        /*
         * Create a statement and execute a select query.
         */
        Statement s = null;
        List<ZonaCalor> zonasCalor = null;
        try {
            s = this.conn.createStatement();

            ResultSet r = s.executeQuery("SELECT id, ST_AsKML(geom, 8) as geom, nombre, drawOrder, style from zonas_calor ORDER BY id");
            zonasCalor = new ArrayList<ZonaCalor>();
            ZonaCalor zona = null;
            while (r.next()) {
                zona = new ZonaCalor();
                zona.setId(r.getInt("id"));
                zona.setNombre(r.getString("nombre"));
                zona.setDrawOrder(r.getInt("drawOrder"));
                zona.setStyle(r.getString("style"));
                zona.setRawKmlData(r.getString("geom"));
                zonasCalor.add(zona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null) {
                    s.close();
                    this.close();
                }
            } catch (SQLException e) {
            }
        }
        return zonasCalor;
    }

    @Override
    public List<ZonaCalor> getAllByAnio(Integer anio) {
        this.connect();
        /*
         * Create a statement and execute a select query.
         */
        Statement s = null;
        List<ZonaCalor> zonasCalor = null;
        try {
            s = this.conn.createStatement();

            StringBuilder sb = new StringBuilder("SELECT zc.id, ST_AsKML(zc.geom, 8) as geom, zc.nombre, zc.drawOrder, zc.style ");
            sb.append("FROM zonas_calor zc inner join mediciones m ON  zc.id_medicion = m.id ");
            sb.append("WHERE m.anio = ");
            sb.append(anio);
            sb.append(" ORDER BY id ");

            ResultSet r = s.executeQuery(sb.toString());
            zonasCalor = new ArrayList<ZonaCalor>();
            ZonaCalor zona = null;
            while (r.next()) {
                zona = new ZonaCalor();
                zona.setId(r.getInt("id"));
                zona.setNombre(r.getString("nombre"));
                zona.setDrawOrder(r.getInt("drawOrder"));
                zona.setStyle(r.getString("style"));
                zona.setRawKmlData(r.getString("geom"));
                zonasCalor.add(zona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null) {
                    s.close();
                    this.close();
                }
            } catch (SQLException e) {
            }
        }
        return zonasCalor;
    }

}
