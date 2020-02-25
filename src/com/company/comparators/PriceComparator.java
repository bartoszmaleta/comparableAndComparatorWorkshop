package com.company.comparators;


import com.company.Pillow;

import java.util.Comparator;

public class PriceComparator implements Comparator<Pillow> {

    @Override
    public int compare(Pillow o1, Pillow o2) {
        return o1.getPrice() - o2.getPrice();
    }
}