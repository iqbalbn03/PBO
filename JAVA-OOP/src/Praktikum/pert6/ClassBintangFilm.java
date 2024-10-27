package Praktikum.pert6;

class BintangFilm {
    // atributnya
    private String nama;
    private Boolean pria;

    // konstruktor : fungsi yang di jalankan ketika objek diciptakan
    BintangFilm(String nama, Boolean pria) {
        this.nama = nama; 
        this.pria = pria;
    }

    //method tanpa return dengan param
    //private void isikan(String nama, Boolean pria){
        //this.nama = nama; // this adalah objek sekarang
        //this.pria = pria;}

    //method dengan return tanpa param
    String perolehNama(){
        return (nama);
    }

    //memperoleh jenis kelamin
    String perolehJenisKelamin(){
        if (pria)
            return "pria";
        else
            return "wanita";
    }
}

    public class ClassBintangFilm {
        public static void main(String[] args) {
            //buat dua objek BintangFilm siA dan siB
            BintangFilm siA = new BintangFilm("Budi", true);
            BintangFilm siB = new BintangFilm("Siti", false);
        

            //menampilkan nama siA dan siB
            System.out.println("siA => "+siA.perolehNama() + "," + siA.perolehJenisKelamin());
            System.out.println("siB => "+siB.perolehNama() + "," + siB.perolehJenisKelamin());
        }
    
}
