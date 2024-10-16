package Praktikum.quiz;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
            
        } else if (angka == 0) {
            System.out.println("Angka nol");
        }
        
        input.close();
    }
}
