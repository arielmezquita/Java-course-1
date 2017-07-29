package com.intermediatbusiness.dao.impl;

import com.intermediatbusiness.dao.SesionDao;
import com.intermediatbusiness.entity.Materia;
import com.intermediatbusiness.entity.Profesor;
import com.intermediatbusiness.entity.Sesion;

import java.util.*;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public class SesionDaoImpl implements SesionDao {

    private List<Sesion> sesionList=new ArrayList<>();

    @Override
    public void crear(Sesion entity) {
        sesionList.add(entity);
    }

    @Override
    public void modificar(Sesion entity) {
        int index=sesionList.indexOf(entity);
        sesionList.set(index,entity);
    }

    @Override
    public Sesion findById(Long aLong) {
        return sesionList.get(aLong.intValue());
    }

    @Override
    public List<Sesion> findAll() {
        return sesionList;
    }

    @Override
    public Map<String, Integer> getCantidades(Profesor profesor, Materia materia) {
        Map<String, Integer> map=new HashMap<>();
        if(Objects.nonNull(sesionList) &&
                !sesionList.isEmpty()) {
            int cantidadProfesor=getCantidadProfesor(sesionList,profesor);
            int cantidadMateria=getCantidadMateria(sesionList,materia);

            map.put("cantProfesor",cantidadProfesor);
            map.put("cantMateria",cantidadMateria);


        }
        return map;
    }

    private int getCantidadMateria(List<Sesion> sesionList, Materia materia) {
        int cantidad=0;
        for(Sesion sesion : sesionList) {
            if(sesion.getMateria().equals(materia)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    private int getCantidadProfesor(List<Sesion> sesionList,Profesor profesor) {
        int cantidad=0;
        for(Sesion sesion : sesionList) {
            if(sesion.getProfesor().equals(profesor)) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
