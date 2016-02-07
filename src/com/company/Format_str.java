package com.company;

import java.util.Formatter;

/**
 * Created by uitschool JV on 2/7/2016.
 */
public class Format_str {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This %s is about %n%S%c", "book", "java",'8');
        System.out.println(f);
    }
}
