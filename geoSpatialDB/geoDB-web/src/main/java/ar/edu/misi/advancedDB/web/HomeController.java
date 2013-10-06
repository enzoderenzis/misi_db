package ar.edu.misi.advancedDB.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import ar.edu.misi.advancedDB.CityDao;
import ar.edu.misi.advancedDB.entities.Ciudad;

public class HomeController extends AbstractController {

    private CityDao cityDao;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mview = new ModelAndView("cordoba");
        List<Ciudad> ciudades = (List<Ciudad>) this.cityDao.getAll();
        mview.addObject("ciudades", ciudades);
        
        return mview;
    }

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

}
