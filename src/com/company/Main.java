package com.company;

import com.company.comparators.PriceComparator;
import com.company.comparators.SoftnessComparator;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pillow> pillows = new ArrayList<>();

        Pillow pillow1 = new Pillow(80, 9, 0.5);
        Pillow pillow2 = new Pillow(200, 2, 2.5);
        Pillow pillow3 = new Pillow(30, 6, 0.3);
        Pillow pillow4 = new Pillow(60, 5, 0.2);

        pillows.add(pillow1);
        pillows.add(pillow2);
        pillows.add(pillow3);
        pillows.add(pillow4);


        System.out.println(pillows.toString());
        // Sort
        System.out.println();
        Collections.sort(pillows);
        System.out.println("Sort:\n" + pillows.toString());
        System.out.println("-------------------------------------------------------");

        // Compare weight pillow1 to pillow2
        System.out.println();
        System.out.println("\n\nCompare weight pillow1 to pillow2:\n" + pillow1.compareTo(pillow2));
        System.out.println("-------------------------------------------------------");

        // Sort by softness with usage of Softness Comparator
        Collections.sort(pillows, new SoftnessComparator());
        System.out.println("\n\nSort by softness with usage of SoftnessComparator:\n" + pillows.toString());
        System.out.println("-------------------------------------------------------");

        // Sort by price with usage of Softness Comparator
        Collections.sort(pillows, new PriceComparator());
        System.out.println("\n\nSort by price with usage of PriceComparator:\n" + pillows.toString());
        System.out.println("-------------------------------------------------------");

        // Compare weight Compare pillow1 with pillow2
        System.out.println(pillow1.compareTo(pillow2) == 1 ? "Pillow 1 weighs more!" : "Pillow 2 weighs more!");
        System.out.println("-------------------------------------------------------");

    }

}
