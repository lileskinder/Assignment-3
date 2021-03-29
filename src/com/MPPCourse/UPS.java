package com.MPPCourse;

public class UPS extends Carrier {

    public UPS() {
        super(0.45);
    }

    @Override
    public String getCarrierName() {
        return "UPS";
    }

    @Override
    public double getPrice(Package p) {
        double price = this.getRate();

        price *= p.getPackageWeight();

        return price;
    }
}
