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
import com.intermediatbusiness.util.ProfesorOrdering;

import java.util.Collections;

/**
 *
 * @author jpelegrino
 */
public class MainList {
    
    public static void main(String[] args) {
        
        ProfesorDao profesorDao=(ProfesorDao) ApplicationContext.getDao(DaoEnum.PROFESOR_DAO);
        
        Profesor profesor=new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Martinez");
        profesor.setCorreo("juan.martinez@gmail.com");
        profesor.setEmpleadoId(1L);

        Profesor profesor2=new Profesor();
        profesor2.setNombre("Jorge");
        profesor2.setApellido("Polanco");
        profesor2.setCorreo("jpolanco@gmail.com");
        profesor2.setEmpleadoId(45L);
        

        Profesor profesor3=new Profesor();
        profesor3.setNombre("Pedro");
        profesor3.setApellido("Gonzalez");
        profesor3.setCorreo("pedro.gonzalez@gmail.com");
        profesor3.setEmpleadoId(454L);
        

        
        profesorDao.crear(profesor);
        profesorDao.crear(profesor3);
        profesorDao.crear(profesor2);

        Profesor profesor1=profesorDao.findById(0L);
        profesor1.setApellido("Luis Pelegrino");
        profesorDao.modificar(profesor1);

        System.out.println(profesorDao.findAll());

        Collections.sort(profesorDao.findAll(),Profesor.profesorNamesOrdering);
        System.out.println(profesorDao.findAll());

        Collections.sort(profesorDao.findAll(),new ProfesorOrdering());
        System.out.println(profesorDao.findAll());


        Collections.sort(profesorDao.findAll(),Profesor.BY_NAME);
        System.out.println(profesorDao.findAll());

        Collections.sort(profesorDao.findAll(),Profesor.profesorApellidosOrdering);
        System.out.println(profesorDao.findAll());





    }
    
}
