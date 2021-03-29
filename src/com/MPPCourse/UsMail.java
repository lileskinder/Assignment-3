package com.MPPCourse;

public class UsMail extends Carrier{
    public UsMail() {
        super(0.55);
    }

    @Override
    public String getCarrierName() {
        return "US Mail";
    }

    @Override
    public double getPrice(Package p) {
        if (p.getPackageWeight() < 3) {
           return 1;
        } else {
            return this.getRate() * p.getPackageWeight();
        }
    }
}
