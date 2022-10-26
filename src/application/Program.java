package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("185252544458569585225452552465465498765432154687643221");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();

        ConcreteScanner s = new ConcreteScanner("129387129085731490587134901389457139804349857320958743590374509843573982405748903");
        s.processDoc("My E-mail");
        System.out.println("Scan Result: " + s.scan());

        System.out.println();

        ComboDevice c = new ComboDevice("12334567654345654356754567543");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan Result: " + c.scan());

    }
}