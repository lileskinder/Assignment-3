package com.MPPCourse;

public abstract class Carrier {

    private double rate;

    public Carrier(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public String getPackageDescription(Package p) {
        return p.getPackageDescription();
    }

    public  abstract double getPrice(Package p);
    public  abstract String getCarrierName();

}
