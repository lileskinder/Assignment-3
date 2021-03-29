package com.MPPCourse;

import java.util.*;

public class Main {

    public static Carrier getCarrierWithMinPrice(Package p, List<Carrier> carriers) {
        double minPrice = Double.MAX_VALUE;
        Carrier minCarrier = null;
        for (Carrier c : carriers) {
            if (minPrice > c.getPrice(p)) {
                minPrice = c.getPrice(p);
                minCarrier = c;
            }
        }
        return minCarrier;
    }

    public static void main(String[] args) {


        List<Package> packageList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        int intInput;

        while(true) {
            try {
                System.out.print("How many packages to send? ");
                String input = scanner.nextLine();
                intInput = Integer.parseInt(input);
                break;
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Incorrect format, please reenter a number!!!".toUpperCase());
            }
        }


        for(int i = 1 ; i <= intInput ; i++){
            System.out.println("Please input package " + i + " details");

            System.out.print("Package Description: ");
            String packageDescription = scanner.nextLine();


            double packageWeight;
            while(true) {
                try {
                    System.out.print("Package Weight: ");
                    String packageWeightString = scanner.nextLine();
                    packageWeight = Double.parseDouble(packageWeightString);
                    break;
                }
                catch(InputMismatchException | NumberFormatException ex ) {
                    System.out.println("Incorrect format, please reenter a number!!!".toUpperCase());
                }
            }

            System.out.print("Package zone: ");
            String packageZone = scanner.nextLine();

            Package aPackage = new Package(packageDescription, packageWeight, packageZone);
            packageList.add(aPackage);

            System.out.println();

        }
        scanner.close();



        List<Carrier> carrierList = new ArrayList<>();
        carrierList.add(new FedEx());
        carrierList.add(new UPS());
        carrierList.add(new UsMail());



        for (Package aPackage : packageList) {
            System.out.println(getCarrierWithMinPrice(aPackage, carrierList).getPackageDescription(aPackage) +
                    "   " + "$" + getCarrierWithMinPrice(aPackage, carrierList).getPrice(aPackage) + "   " +
                    getCarrierWithMinPrice(aPackage, carrierList).getCarrierName());
        }
    }

}
