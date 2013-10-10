package ar.edu.misi.advancedDB.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import ar.edu.misi.advancedDB.CityDao;
import ar.edu.misi.advancedDB.LugarDao;
import ar.edu.misi.advancedDB.ZonasCalorDao;
import ar.edu.misi.advancedDB.entities.Ciudad;
import ar.edu.misi.advancedDB.entities.Lugar;
import ar.edu.misi.advancedDB.entities.ZonaCalor;

public class HomeController extends AbstractController {

    private CityDao cityDao;
    private LugarDao lugarDao;
    private ZonasCalorDao zonasCalorDao;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse arg1) throws Exception {
        ModelAndView mview = new ModelAndView("cordoba");
        List<Ciudad> ciudades = (List<Ciudad>) this.cityDao.getAll();
        mview.addObject("ciudades", ciudades);

        List<Lugar> lugares = this.lugarDao.getAll();
        mview.addObject("lugares", lugares);
        List<ZonaCalor> zonaCalors = null;
        if (request.getParameter("anio") != null) {
            Integer anio = Integer.valueOf(request.getParameter("anio"));
            zonaCalors = this.zonasCalorDao.getAllByAnio(anio);
        } else {
            zonaCalors = this.zonasCalorDao.getAll();
        }
        String order = null;
        for (ZonaCalor zc : zonaCalors) {
            order = String.format("<gx:drawOrder>%d</gx:drawOrder>", zc.getDrawOrder());
            zc.setRawKmlData(zc.getRawKmlData().replace("<outerBoundaryIs>", order + "<outerBoundaryIs>"));
        }

        mview.addObject("zonasCalor", zonaCalors);
        return mview;
    }

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public void setLugarDao(LugarDao lugarDao) {
        this.lugarDao = lugarDao;
    }

    public void setZonasCalorDao(ZonasCalorDao zonasCalorDao) {
        this.zonasCalorDao = zonasCalorDao;
    }

}
