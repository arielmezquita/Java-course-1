package com.intermediatgui;

import java.util.*;

/**
 * Created by jpelegrino on 20/07/2017.
 */
public class MainMap {

    public static void main(String[] args) {

        Map<String,String> map=new TreeMap<>();

        map.put("R","RED");
        map.put("W","WHITE");
        map.put("G","GREEN");
        map.put("B","BROWN");
        map.put("Y","YELLOW");


        Set<String> keys=map.keySet();
        List<String> values=new ArrayList<>(map.values());
        Set<Map.Entry<String,String>> entrySet=map.entrySet();

        System.out.println("Keys:: "+keys);
        System.out.println("Values:: "+values);
        System.out.println("EntrySet:: "+ entrySet);

        for(Map.Entry<String,String> entry : entrySet) {
            System.out.println(entry.getKey()+ " - "+ entry.getValue());
        }





    }
}
