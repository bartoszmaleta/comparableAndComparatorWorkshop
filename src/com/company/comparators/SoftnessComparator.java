package com.company.comparators;

import com.company.Pillow;

import java.util.Comparator;

public class SoftnessComparator implements Comparator<Pillow> {

    @Override
    public int compare(Pillow o1, Pillow o2) {
        return o1.getSoftness() - o2.getSoftness();
    }
}
