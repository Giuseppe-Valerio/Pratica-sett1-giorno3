package Rettagolo.Esercizio1;

public class Rettagolo {
    private int base;
    private int altezza;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int perimetro(int base, int altezza) {
        int risultatoPerimetro = 2 * (base + altezza);
        System.out.println(risultatoPerimetro);
        return risultatoPerimetro;
    }

    public int area(int base, int altezza) {
        int risultatoArea = base * altezza;

        System.out.println(risultatoArea);
        return risultatoArea;
    }

}

