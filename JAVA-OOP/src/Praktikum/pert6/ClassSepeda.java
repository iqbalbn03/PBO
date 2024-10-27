package Praktikum.pert6;

class Sepeda {
    String aktifitas;
    String warna;
    int kecepatan;

    // Konstruktor untuk menginisialisasi objek sepeda
    public Sepeda(String aktifitas, String warna, int kecepatan) {
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // Method untuk mengecek kecepatan sepeda
    void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "berhenti";
        } else if (kecepatan > 0 && kecepatan <= 10) {
            aktifitas = "melaju pelan";
        } else {
            aktifitas = "melaju cepat";
        }
    }

    // Method untuk mencetak atribut sepeda
    void cetakAtribut() {
        System.out.println("Aktifitas: " + aktifitas);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

public class ClassSepeda {
    public static void main(String[] args) {
        // Membuat objek sepeda dengan atribut awal
        Sepeda sepedaKu = new Sepeda("berhenti", "biru", 0);
        
        // Mengatur nilai kecepatan dan mengecek aktifitas
        sepedaKu.kecepatan = 8;
        sepedaKu.cekKecepatan();
        
        // Mencetak informasi sepeda
        sepedaKu.cetakAtribut();
    }
}

