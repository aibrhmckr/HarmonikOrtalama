package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        HarmonikOrt(numbers);
    }
    public static double HarmonikOrt(double[] array){
        int diziUzunlugu=array.length;
        double harmonikSeri = 0;
        for(double i:array){
            harmonikSeri+=1/(i);
        }
        System.out.println(harmonikSeri);
        double harmonikOrt=diziUzunlugu/harmonikSeri;
        System.out.println(harmonikOrt);
        return harmonikOrt;
    }
}
