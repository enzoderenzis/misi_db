package ar.edu.misi.advancedDB.entities;

public class ZonaCalor {

    private int id;
    private String nombre;
    private String style;
    private Integer drawOrder;
    private String rawKmlData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getDrawOrder() {
        return drawOrder;
    }

    public void setDrawOrder(Integer drawOrder) {
        this.drawOrder = drawOrder;
    }

    public String getRawKmlData() {
        return rawKmlData;
    }

    public void setRawKmlData(String rawKmlData) {
        this.rawKmlData = rawKmlData;
    }

}
