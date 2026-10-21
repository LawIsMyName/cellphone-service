package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CellPhone phoneData;
        phoneData = new CellPhone(0," ", " ", " ", " ");

        System.out.println("what is the serial number: " );
        int serialNumber = scanner.nextInt();

        System.out.println("what model is the phone: ");
        String model = scanner.nextLine().trim();

        System.out.println("who is the carrier: ");
        String carrier = scanner.nextLine().trim();

        System.out.println("what is the phone number: ");
        String phoneNumber = scanner.nextLine().trim();

        System.out.println("who is the owner of the phone?: ");
        String owner = scanner.nextLine().trim();

        System.out.println("serial number is:" + " " + phoneData.getSerialNumber());
        System.out.println("phone model is:" + " " + phoneData.getModel());
        System.out.println("carrier is:" + " " + phoneData.getCarrier());
        System.out.println("phone number is" + " " + phoneData.getPhoneNumber());
        System.out.println("owner of the phone is:" + " " + phoneData.getOwner());
















    }
}
