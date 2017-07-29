package com.intermediatbusiness.dao.impl;

import com.intermediatbusiness.dao.AulaDao;
import com.intermediatbusiness.entity.Aula;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public class AulaDaoImpl implements AulaDao {

    private List<Aula> aulaList=new ArrayList<>();

    @Override
    public void crear(Aula entity) {
        aulaList.add(entity);
    }

    @Override
    public void modificar(Aula entity) {
        int index=aulaList.indexOf(entity);
        aulaList.set(index,entity);
    }

    @Override
    public Aula findById(Long aLong) {
        return aulaList.get(aLong.intValue());
    }

    @Override
    public List<Aula> findAll() {
        return aulaList;
    }
}
