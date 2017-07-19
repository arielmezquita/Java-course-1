/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intermediatbusiness.factory;

import com.intermediatbusiness.dao.GenericDao;
import com.intermediatbusiness.dao.ProfesorDao;
import com.intermediatbusiness.dao.impl.ProfesorDaoImpl;
import com.intermediatbusiness.enums.DaoEnum;

/**
 *
 * @author jpelegrino
 */
public class ApplicationContext {
    
    public static GenericDao getDao(DaoEnum daoEnum) {
        switch(daoEnum) {
            case PROFESOR_DAO:
                return new ProfesorDaoImpl();
               
        }
        
        return null;
    } 
    
}
