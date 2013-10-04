package ar.edu.misi.advancedDB.entities;

import org.postgis.Point;

public class Ciudad {

    private String name;
    private Point geoPoint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(Point geoPoint) {
        this.geoPoint = geoPoint;
    }

}
