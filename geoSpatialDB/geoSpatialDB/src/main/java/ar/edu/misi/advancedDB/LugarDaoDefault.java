package ar.edu.misi.advancedDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.edu.misi.advancedDB.entities.Lugar;

public class LugarDaoDefault extends BaseDao implements LugarDao {

    @Override
    public List<Lugar> getAll() {
        this.connect();
        /*
         * Create a statement and execute a select query.
         */
        Statement s = null;
        List<Lugar> lugares = null;
        try {
            s = this.conn.createStatement();

            ResultSet r = s.executeQuery("select id, ST_AsKML(geom, 8) as geom, nombre from lugar ORDER BY id");
            lugares = new ArrayList<Lugar>();
            Lugar lugar = null;
            while (r.next()) {
                lugar = new Lugar();
                lugar.setId(r.getInt("id"));
                lugar.setNombre(r.getString("nombre"));
                lugar.setRawKmlData(r.getString("geom"));
                lugares.add(lugar);
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
        return lugares;
    }

}
