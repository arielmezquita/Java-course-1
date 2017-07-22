package com.intermediatgui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpelegrino on 22/07/2017.
 */
public class MainGeneric {

    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>();
        integerList.add(4);
        integerList.add(6);
        integerList.add(9);
        integerList.add(10);

        agregar(integerList);
    }

    public static  <T> void agregar(List<T> list) {
        for(T t : list) {
            System.out.println(t);
        }
    }



}
