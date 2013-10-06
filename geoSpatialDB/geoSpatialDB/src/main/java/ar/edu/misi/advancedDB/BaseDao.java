package ar.edu.misi.advancedDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDao {
    protected Connection conn;
    private final String userDB = "postgres";
    private final String passDB = "enzo";
    private final String host = "localhost";
    private final String port = "5433";
    private final String dbName = "tp_db";
    private final String url = String.format("jdbc:postgresql://%s:%s/%s", this.host, this.port, this.dbName);

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

            this.conn = DriverManager.getConnection(this.url, this.userDB, this.passDB);
            /*
             * Add the geometry types to the connection. Note that you must cast the connection to the pgsql-specific connection implementation before
             * calling the addDataType() method.
             */
            org.postgresql.jdbc4.Jdbc4Connection posConnection = ((org.postgresql.jdbc4.Jdbc4Connection) this.conn);
            posConnection.addDataType("geometry", "org.postgis.PGgeometry");
            posConnection.addDataType("box3d", "org.postgis.PGbox3d");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
