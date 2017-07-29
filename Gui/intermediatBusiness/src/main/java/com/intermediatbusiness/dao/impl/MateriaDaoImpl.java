package com.intermediatbusiness.dao.impl;

import com.intermediatbusiness.dao.MateriaDao;
import com.intermediatbusiness.entity.Materia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public class MateriaDaoImpl implements MateriaDao {

    private List<Materia> materiaList=new ArrayList<>();

    @Override
    public void crear(Materia entity) {
        materiaList.add(entity);
    }

    @Override
    public void modificar(Materia entity) {
        int index=materiaList.indexOf(entity);
        materiaList.set(index,entity);
    }

    @Override
    public Materia findById(Long aLong) {
        return materiaList.get(aLong.intValue());
    }

    @Override
    public List<Materia> findAll() {
        return materiaList;
    }
}
