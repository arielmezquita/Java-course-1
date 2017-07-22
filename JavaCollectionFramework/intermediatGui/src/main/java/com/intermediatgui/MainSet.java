package com.intermediatgui;

import com.intermediatbusiness.dao.ProfesorDao;
import com.intermediatbusiness.entity.Profesor;
import com.intermediatbusiness.enums.DaoEnum;
import com.intermediatbusiness.factory.ApplicationContext;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public class MainSet {

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

        Profesor profesor4=new Profesor();
        profesor4.setNombre("Pedro");
        profesor4.setApellido("Gonzalez");
        profesor4.setCorreo("pedro.gonzalez@gmail.com");
        profesor4.setEmpleadoId(454L);

        profesorDao.crear(profesor);
        profesorDao.crear(profesor3);
        profesorDao.crear(profesor2);
        profesorDao.crear(profesor4);

        Set<Profesor> profesorSet=new TreeSet<>();
        profesorSet.add(profesor);
        profesorSet.add(profesor2);
        profesorSet.add(profesor3);
        profesorSet.add(profesor4);

        System.out.println(profesorSet);
        System.out.println(profesor3.equals(profesor4));

    }
}
