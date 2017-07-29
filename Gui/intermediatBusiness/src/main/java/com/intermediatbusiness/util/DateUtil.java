package com.intermediatbusiness.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jpelegrino on 19/07/2017.
 */
public class DateUtil {

    public static Date stringToDate(String date) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");

        try {
        return     simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
