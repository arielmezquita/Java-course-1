/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intermediatgui;

import com.intermediatbusiness.dao.ProfesorDao;
import com.intermediatbusiness.entity.Profesor;
import com.intermediatbusiness.enums.DaoEnum;
import com.intermediatbusiness.factory.ApplicationContext;

/**
 *
 * @author jpelegrino
 */
public class Main {
    
    public static void main(String[] args) {
        
        ProfesorDao profesorDao=(ProfesorDao) ApplicationContext.getDao(DaoEnum.PROFESOR_DAO);
        
        Profesor profesor=new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Martinez");
        profesor.setCorreo("juan.martinez@gmail.com");
        profesor.setEmpleadoId(1L);
        
        Profesor profesor2=profesor;
        Profesor profesor3=new Profesor();
        profesor3.setNombre("Juan");
        profesor3.setApellido("Martinez");
        profesor3.setCorreo("juan.martinez@gmail.com");
        profesor3.setEmpleadoId(1L);
        
        System.out.println(profesor.equals(profesor3));
        
        profesorDao.crear(profesor);
        
    }
    
}
