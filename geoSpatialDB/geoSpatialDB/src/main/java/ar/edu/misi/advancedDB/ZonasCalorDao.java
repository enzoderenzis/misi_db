package ar.edu.misi.advancedDB;

import java.util.List;

import ar.edu.misi.advancedDB.entities.ZonaCalor;

public interface ZonasCalorDao {

    List<ZonaCalor> getAll();

    List<ZonaCalor> getAllByAnio(Integer anio);

}
