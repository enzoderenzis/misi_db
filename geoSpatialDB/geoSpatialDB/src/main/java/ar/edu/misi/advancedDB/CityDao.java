package ar.edu.misi.advancedDB;

import java.util.Collection;

import ar.edu.misi.advancedDB.entities.Ciudad;

public interface CityDao {

    Collection<Ciudad> getAll();

    Ciudad getCiudad();

}
