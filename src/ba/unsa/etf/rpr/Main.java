package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj) {
        int suma = 0;
        int pomocna = broj;
        while (pomocna >= 1) {
            suma = suma + pomocna % 10;
            pomocna = pomocna / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();
        System.out.println("Brojevi od 1 do " + n + " djeljivi sa sumom svojih cifara su: ");
        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0)
                System.out.println(i);
        }
    }
}
