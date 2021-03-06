package ar.edu.misi.advancedDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.postgis.PGgeometry;

import ar.edu.misi.advancedDB.entities.Ciudad;

public class CityDaoDefault extends BaseDao implements CityDao {

    @Override
    public Collection<Ciudad> getAll() {
        this.connect();
        /*
         * Create a statement and execute a select query.
         */
        Statement s = null;
        List<Ciudad> ciudades = null;
        try {
            s = this.conn.createStatement();

            PGgeometry geom = null;
            ResultSet r = s.executeQuery("select geom, nombre from ciudades ORDER BY idciudad");
            ciudades = new ArrayList<Ciudad>();
            Ciudad ciudad = null;
            while (r.next()) {
                /*
                 * Retrieve the geometry as an object then cast it to the geometry type. Print things out.
                 */
                geom = (PGgeometry) r.getObject("geom");
                ciudad = new Ciudad();
                ciudad.setName(r.getString("nombre"));
                if (geom != null) {
                    ciudad.setGeoPoint(geom.getGeometry().getFirstPoint());
                }
                ciudades.add(ciudad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (SQLException e) {
            }
        }
        this.close();
        return ciudades;
    }

    @Override
    public Ciudad getCiudad() {
        // TODO Auto-generated method stub
        return null;
    }

}
