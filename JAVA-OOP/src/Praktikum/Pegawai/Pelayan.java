package Praktikum.Pegawai;

public class Pelayan extends Pegawai {
    @Override
    public void menampilkan()
    {
        System.err.println("Nama : "+nama);
        System.out.println("Id Pegawai :"+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }

    public void tugas(){
        System.out.println("Tugas : Melayani dan menyajikan pesanan pembeli");
        System.out.println("----------------------------------------------");
    }
    
}