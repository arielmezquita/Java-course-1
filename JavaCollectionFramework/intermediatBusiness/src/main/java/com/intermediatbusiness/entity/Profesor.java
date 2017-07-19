/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intermediatbusiness.entity;

/**
 *
 * @author jpelegrino
 */
public class Profesor extends Persona{
    
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
    
    
}
