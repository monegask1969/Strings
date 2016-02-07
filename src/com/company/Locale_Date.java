package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by uitschool JV on 2/7/2016.
 */
public class Locale_Date {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date d = null;
        String str = "April 9, 2012";
        try {
            d = df.parse(str);
            System.out.println(d);
        }
        catch (ParseException e )
        {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(df.format(d));
    }
}
