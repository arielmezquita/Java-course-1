package com.intermediatbusiness.util;

import com.intermediatbusiness.entity.Profesor;

import java.util.Comparator;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public class ProfesorOrdering implements Comparator<Profesor> {
    @Override
    public int compare(Profesor o1, Profesor o2) {
        return o2.getNombre().compareTo(o1.getNombre());
    }
}
