package com.intermediatgui;

import com.intermediatbusiness.dao.AulaDao;
import com.intermediatbusiness.dao.MateriaDao;
import com.intermediatbusiness.dao.ProfesorDao;
import com.intermediatbusiness.dao.SesionDao;
import com.intermediatbusiness.entity.*;
import com.intermediatbusiness.enums.DaoEnum;
import com.intermediatbusiness.factory.ApplicationContext;
import com.intermediatbusiness.util.DateUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public class MainSesion {

    public static void main(String[] args) {

        SesionDao sesionDao=(SesionDao) ApplicationContext.getDao(DaoEnum.SESION_DAO);
        List<Horario> horarioList=getHorarios();
        List<Profesor> profesorList=getProfesores();
        List<Materia> materiaList=getMaterias();
        List<Aula> aulaList=getAulaList();

        Sesion sesion1=new Sesion();
        sesion1.setAula(aulaList.get(0));
        sesion1.setMateria(materiaList.get(1));
        sesion1.setProfesor(profesorList.get(2));
        sesion1.setHorario(horarioList.get(0));
        sesion1.setFechaInicio(DateUtil.stringToDate("12/10/2017"));
        sesion1.setFechaFin(DateUtil.stringToDate("17/12/2017"));

        Sesion sesion2=new Sesion();
        sesion2.setAula(aulaList.get(1));
        sesion2.setMateria(materiaList.get(0));
        sesion2.setProfesor(profesorList.get(1));
        sesion2.setHorario(horarioList.get(0));
        sesion2.setFechaInicio(DateUtil.stringToDate("12/10/2017"));
        sesion2.setFechaFin(DateUtil.stringToDate("17/12/2017"));


        Sesion sesion3=new Sesion();
        sesion3.setAula(aulaList.get(1));
        sesion3.setMateria(materiaList.get(0));
        sesion3.setProfesor(profesorList.get(2));
        sesion3.setHorario(horarioList.get(1));
        sesion3.setFechaInicio(DateUtil.stringToDate("12/10/2017"));
        sesion3.setFechaFin(DateUtil.stringToDate("17/12/2017"));



        sesionDao.crear(sesion1);
        sesionDao.crear(sesion2);
        sesionDao.crear(sesion3);

        Map<String,Integer> sesionMap=sesionDao.getCantidades(profesorList.get(0),materiaList.get(0));

        System.out.println(sesionMap);


        Map<Profesor,List<Sesion>> listMap=sesionDao.findAll().stream().collect(Collectors.groupingBy(Sesion ::getProfesor));

        System.out.println(listMap);





    }

    private static List<Aula> getAulaList() {
        AulaDao aulaDao=(AulaDao) ApplicationContext.getDao(DaoEnum.AULA_DAO);

        Aula a1=new Aula();
        a1.setDescripcion("1b");

        Aula a2=new Aula();
        a2.setDescripcion("1c");

        aulaDao.crear(a1);
        aulaDao.crear(a2);

        return aulaDao.findAll();

    }

    private static List<Materia> getMaterias() {
        MateriaDao materiaDao=(MateriaDao) ApplicationContext.getDao(DaoEnum.MATERIA_DAO);

        Materia m1=new Materia();
        m1.setDescripcion("Matematica");
        m1.setCodigo("Mat-001");

        Materia m2=new Materia();
        m2.setDescripcion("Lengua Espanola");
        m2.setCodigo("Esp-001");

        materiaDao.crear(m1);
        materiaDao.crear(m2);

        return materiaDao.findAll();


    }

    private static List<Profesor> getProfesores() {
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

        return profesorDao.findAll();
    }

    private static List<Horario> getHorarios() {
        List<Horario> horarios=new ArrayList<>();
        Horario h1=new Horario();
        h1.setId(1L);
        h1.setDescripcion("Lun-Mie 9-1");

        Horario h2=new Horario();
        h2.setId(2L);
        h2.setDescripcion("Lun-Mie 2-6");

        Horario h3=new Horario();
        h3.setId(3L);
        h3.setDescripcion("Lun-Mie 6-10");

        horarios.add(h1);
        horarios.add(h2);
        horarios.add(h3);

        return horarios;


    }
}
