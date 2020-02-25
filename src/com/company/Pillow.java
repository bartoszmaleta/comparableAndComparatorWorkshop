package com.company;

public class Pillow implements Comparable<Pillow> {
    private int price;
    private int softness;
    private double weight;

    public Pillow(int price, int softness, double weight) {
        this.price = price;
        this.softness = softness;
        this.weight = weight;
    }

    public String toString() {
        return "\n\nPillow\np = " + this.price + "\ns = " + this.softness + "\nw = " + this.weight;
    }

//    @Override
//    public int compareTo(Object o) {
//        Pillow oPillow = (Pillow) o;
//        return this.price - oPillow.getPrice();
//    }

//    @Override
//    public int compareTo(Pillow pillow) {
//        double index = this.weight * 100 - pillow.getWeight() * 100;
//        return (int) index / 100;
//    }


    @Override
    public int compareTo(Pillow pillow) {
        return this.weight > pillow.getWeight() ? 1 : -1;
    }

    public int getPrice() {
        return price;
    }

    public int getSoftness() {
        return softness;
    }

    public double getWeight() {
        return weight;
    }
}
