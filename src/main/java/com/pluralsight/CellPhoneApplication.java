package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("what is the serial number: " );
        int serialNumber = scanner.nextInt();

        String newLine = scanner.nextLine(); ///eat the new line

        System.out.println("what model is the phone: ");
        String model = scanner.nextLine().trim();

        System.out.println("who is the carrier: ");
        String carrier = scanner.nextLine().trim();

        System.out.println("what is the phone number: ");
        String phoneNumber = scanner.nextLine().trim();

        System.out.println("who is the owner of the phone?: ");
        String owner = scanner.nextLine().trim();

        CellPhone cellphone;
        cellphone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        System.out.println("serial number is:" + " " + cellphone.getSerialNumber());
        System.out.println("phone model is:" + " " + cellphone.getModel());
        System.out.println("carrier is:" + " " + cellphone.getCarrier());
        System.out.println("phone number is:" + " " + cellphone.getPhoneNumber());
        System.out.println("owner of the phone is:" + " " + cellphone.getOwner());
















    }
}
