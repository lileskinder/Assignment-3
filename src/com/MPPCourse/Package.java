package com.MPPCourse;

public class Package {
    private String packageDescription;
    private double packageWeight;
    private String zone;

    public Package(String packageDescription, double packageWeight, String zone) {
        this.packageDescription = packageDescription;
        this.packageWeight = packageWeight;
        this.zone = zone;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public String getZone() {
        return zone;
    }

}
