package ar.edu.misi.advancedDB.entities;

import org.postgresql.geometric.PGpolygon;

public class Lugar {

    private Integer id;
    private String nombre;
    private PGpolygon polygon;
    private String rawKmlData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PGpolygon getPolygon() {
        return polygon;
    }

    public void setPolygon(PGpolygon polygon) {
        this.polygon = polygon;
    }

    public String getRawKmlData() {
        return rawKmlData;
    }

    public void setRawKmlData(String rawKmlData) {
        this.rawKmlData = rawKmlData;
    }

}
