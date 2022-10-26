package application;

import devices.Printer;
import devices.Scanner;

public class Program {
    public static void main(String[] args) {
        Printer p = new Printer("185252544458569585225452552465465498765432154687643221");
        p.processDoc("My Letter");
        p.print("My Letter");


        Scanner s = new Scanner("129387129085731490587134901389457139804349857320958743590374509843573982405748903");
        s.processDoc("My E-mail");
        System.out.println("Scan Result: " + s.scan());

    }
}