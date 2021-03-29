package com.MPPCourse;

public class FedEx extends Carrier {
    public FedEx() {
        super(0.43);
    }

    @Override
    public String getCarrierName() {
        return "FedEx";
    }

    public double getPrice(Package p) {
        if (p.getZone().equalsIgnoreCase("IA") || p.getZone().equalsIgnoreCase("MT") ||
            p.getZone().equalsIgnoreCase("OR") || p.getZone().equalsIgnoreCase("CA")) {
            return 0.35 * p.getPackageWeight();
        } else if (p.getZone().equalsIgnoreCase("TX") || p.getZone().equalsIgnoreCase("UT")) {
            return  0.3 * p.getPackageWeight();
        } else if (p.getZone().equalsIgnoreCase("FL") || p.getZone().equalsIgnoreCase("MA") ||
                p.getZone().equalsIgnoreCase("OH")) {
            return 0.55 * p.getPackageWeight();
        } else {
            return this.getRate() * p.getPackageWeight();
        }
    }
}
