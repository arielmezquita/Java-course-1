/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intermediatbusiness.dao.impl;

import com.intermediatbusiness.dao.ProfesorDao;
import com.intermediatbusiness.entity.Profesor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpelegrino
 */
public class ProfesorDaoImpl implements ProfesorDao {

    private List<Profesor> profesorList=new ArrayList<>();

    @Override
    public void crear(Profesor entity) {
        profesorList.add(entity);
    }

    @Override
    public void modificar(Profesor entity) {
        int index=profesorList.indexOf(entity);
        profesorList.set(index,entity);
    }

    @Override
    public Profesor findById(Long id) {
        return profesorList.get(id.intValue());
    }

    @Override
    public List<Profesor> findAll() {
        return profesorList;
    }

    
    
}
