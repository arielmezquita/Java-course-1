/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intermediatbusiness.entity;

import java.util.Comparator;

/**
 *
 * @author jpelegrino
 */
public class Profesor extends Persona
        implements Comparable<Profesor>{

    public static Comparator<Profesor> BY_NAME=Comparator.comparing(Profesor::getNombre);
    
    private Long empleadoId;

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return nombre + " "+apellido;
    }


    @Override
    public int compareTo(Profesor o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    public static Comparator<Profesor> profesorNamesOrdering=new Comparator<Profesor>() {
        @Override
        public int compare(Profesor profesor1, Profesor profesor2) {
            return profesor1.getNombre().compareTo(profesor2.getNombre());
        }
    };

    public static Comparator<Profesor> profesorApellidosOrdering=(p1,p2)-> p1.getApellido().compareTo(p2.getApellido())  ;





    @Override
    public boolean equals(Object object) {
        if(object instanceof  Persona) {
            Profesor profesor=(Profesor) object;
            if(this.nombre.equals(profesor.getNombre()) &&
                    this.apellido.equals(profesor.getApellido()) &&
                    this.empleadoId.intValue()==profesor.getEmpleadoId().intValue()) {
                return true;
            }
        }

        return false;
    }


    @Override
    public int hashCode() {
     int size=0;
        if(this.nombre!=null &&
                this.apellido!=null &&
                this.empleadoId!=null) {
            size=this.nombre.length()+this.apellido.length()+this.empleadoId.intValue();
        }

        return (int) Math.sqrt(size);
    }

    
}
