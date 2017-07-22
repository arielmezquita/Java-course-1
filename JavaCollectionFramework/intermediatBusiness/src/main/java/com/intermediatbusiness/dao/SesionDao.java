package com.intermediatbusiness.dao;

import com.intermediatbusiness.entity.Materia;
import com.intermediatbusiness.entity.Profesor;
import com.intermediatbusiness.entity.Sesion;

import java.util.Map;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public interface SesionDao extends GenericDao<Sesion,Long> {
    Map<String,Integer> getCantidades(Profesor profesor, Materia materia);
}
