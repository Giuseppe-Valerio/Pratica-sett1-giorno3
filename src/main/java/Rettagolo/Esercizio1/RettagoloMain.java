package Rettagolo.Esercizio1;

import java.util.Scanner;

public class RettagoloMain {
    public static void main(String[] args) {
        Rettagolo rett = new Rettagolo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un base");
        rett.setBase(scanner.nextInt());
        System.out.println("inserisci un altezza");
        rett.setAltezza(scanner.nextInt());
        System.out.println("stampa perimetro rettagolo 1");

        int perimetro1 = rett.perimetro(rett.getBase(), rett.getAltezza());
        System.out.println("stampa area rettagolo 1");
       int area1 =  rett.area(rett.getBase(), rett.getAltezza());

        Rettagolo rett2 = new Rettagolo();

        System.out.println("inserisci un base");
        rett2.setBase(scanner.nextInt());
        System.out.println("inserisci un altezza");
        rett2.setAltezza(scanner.nextInt());
        System.out.println("stampa perimetro rettagolo 2");
        int perimentro2 = rett2.perimetro(rett2.getBase(), rett2.getAltezza());
        System.out.println("stampa area rettagolo 2");
        int area2 = rett2.area(rett2.getBase(), rett2.getAltezza());

        // stampa somma delle due aree dei due rettagoli
        // Stampa somma delle due aree

        int sommArea = area2 + area1;
        System.out.println("Somma delle due aree: " + sommArea);
        int sommaPerimetro = perimetro1 + perimentro2;
        System.out.println("somma due perimetri: " + sommaPerimetro);
    }
}
