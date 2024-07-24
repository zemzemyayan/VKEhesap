package VicutKitleEndeksHesap;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen boyunuzu metre cinsinden giriniz:");
        float boy = sc.nextFloat();
        System.out.println("lütfen kilonuzu girin:");
        float kilo = sc.nextFloat();
        System.out.println("Vicut Kitle endeksiniz: " + kilo / (boy * boy));
        sc.close();
    }

}
