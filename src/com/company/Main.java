package com.company;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	String s2 = String.join(":", "foobar", "foo", "bar");
        System.out.println(s2);
      s2 =  Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(s->s.contains("bar"))
                .sorted()
                .collect(Collectors.joining(":"));
        System.out.println(s2);

        Locale current = Locale.getDefault();
        System.out.println(current);
        System.out.println(current.getCountry());
        System.out.println(current.getDisplayCountry());
        System.out.println(current.getLanguage());
        System.out.println(current.getDisplayLanguage());
        System.out.println();

        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double iGe = 0, iUs =0, iFr=0;
        String str = "1.234,5";
        try {
            iGe = nfGe.parse(str).doubleValue();
            iUs = nfUs.parse(str).doubleValue();
            iFr = nfFr.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        System.out.printf("iGe = %f\niUs = %f\niFr = %f", iGe,iUs,iFr);
        String sUs = nfUs.format(iGe);
        String sFr = nfFr.format(iGe);
        System.out.println("\nUs" + sUs + "\nFr" + sFr);
    }
}
