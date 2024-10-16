package Praktikum.quiz;
import java.util.Scanner;


public class QuizWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        do{
           System.out.println("Masukkan sebuah angka: ");
           angka = input.nextInt(); 
        }while(angka != 0);

        input.close();
    }
}
