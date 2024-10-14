package Praktikum.pert4;

import java.util.Scanner;

public class WarungSederhana {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner input = new Scanner(System.in);
        int pilihanMenu, jumlah, total = 0;
        boolean selesai = false;

        // Menu makanan dan harga
        String[] menu = {"Nasi Goreng", "Mie Ayam", "Sate Ayam"};
        int[] harga = {15000, 12000, 18000};

        System.out.println("Selamat Datang di Warung Sederhana!");
        System.out.println("Menu:");

        // Menampilkan menu menggunakan for loop
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        // Pemesanan makanan dengan do-while loop
        do {
            System.out.print("\nPilih nomor menu (1-3) atau 0 untuk selesai: ");
            pilihanMenu = input.nextInt();

            // Menggunakan switch-case untuk menangani pilihan menu
            switch (pilihanMenu) {
                case 1:
                    System.out.print("Masukkan jumlah Nasi Goreng: ");
                    jumlah = input.nextInt();
                    total += harga[0] * jumlah;
                    System.out.println("Anda memesan " + jumlah + " Nasi Goreng");
                    break;

                case 2:
                    System.out.print("Masukkan jumlah Mie Ayam: ");
                    jumlah = input.nextInt();
                    total += harga[1] * jumlah;
                    System.out.println("Anda memesan " + jumlah + " Mie Ayam");
                    break;

                case 3:
                    System.out.print("Masukkan jumlah Sate Ayam: ");
                    jumlah = input.nextInt();
                    total += harga[2] * jumlah;
                    System.out.println("Anda memesan " + jumlah + " Sate Ayam");
                    break;

                case 0:
                    selesai = true;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }

            // Menggunakan if-else untuk memberikan diskon jika total lebih dari Rp50,000
            if (total > 50000) {
                System.out.println("Anda mendapatkan diskon 10%!");
                total = total - (total * 10 / 100); // Menghitung diskon
            } else if (total == 0) {
                System.out.println("Anda belum memesan apapun.");
            }

        } while (!selesai);

        // Menampilkan total harga
        System.out.println("Total yang harus dibayar: Rp" + total);
        System.out.println("Terima kasih telah berbelanja di warung kami!");
        input.close();
    }
}
