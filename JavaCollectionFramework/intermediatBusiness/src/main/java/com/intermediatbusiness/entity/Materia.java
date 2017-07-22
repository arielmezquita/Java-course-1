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
public class Materia extends Catalogo{

    @Override
    public boolean equals(Object object) {
        if(object instanceof  Materia) {
            Materia materia=(Materia) object;

            if(this.descripcion.equals(materia.getDescripcion())) {
                return true;
            }
        }

        return false;
    }


    @Override
    public int hashCode() {
        int size=this.descripcion.length();
        return size *9;
    }

}
