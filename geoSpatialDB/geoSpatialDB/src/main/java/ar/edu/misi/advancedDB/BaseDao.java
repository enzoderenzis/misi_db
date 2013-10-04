package ar.edu.misi.advancedDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class BaseDao {
    protected Connection conn;

    public Collection<Object> query() {
        this.connect();
        Collection<Object> result = null;
        this.close();
        return result;
    }

    protected void close() {
        try {
            this.conn.close();
            this.conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void connect() {

        try {
            /*
             * Load the JDBC driver and establish a connection.
             */
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/database";
            this.conn = DriverManager.getConnection(url, "postgres", "");
            /*
             * Add the geometry types to the connection. Note that you must cast the connection to the pgsql-specific connection implementation before
             * calling the addDataType() method.
             */
            org.postgresql.Connection posConnection = ((org.postgresql.Connection) this.conn);
            posConnection.addDataType("geometry", "org.postgis.PGgeometry");
            posConnection.addDataType("box3d", "org.postgis.PGbox3d");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
