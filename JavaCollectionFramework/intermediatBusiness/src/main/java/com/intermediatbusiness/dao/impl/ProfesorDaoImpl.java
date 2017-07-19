/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intermediatbusiness.dao.impl;

import com.intermediatbusiness.dao.ProfesorDao;
import com.intermediatbusiness.entity.Profesor;
import java.util.List;

/**
 *
 * @author jpelegrino
 */
public class ProfesorDaoImpl implements ProfesorDao {

    @Override
    public void crear(Profesor entity) {
        System.out.println("Profesor "+ entity.toString()+ " has sido creado exitosamente");
    }

    @Override
    public void modificar(Profesor entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profesor> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
