## Penjelasan Program `Sepeda` Menggunakan OOP

### 1. Class `Sepeda`
   - **Class** adalah cetak biru atau template untuk membuat objek.
   - Pada program ini, `Sepeda` adalah *class* yang memiliki tiga atribut:
     - `String aktifitas`: Menyimpan informasi aktivitas sepeda (misalnya "berhenti", "melaju pelan", "melaju cepat").
     - `String warna`: Menyimpan warna sepeda.
     - `int kecepatan`: Menyimpan kecepatan sepeda dalam km/jam.
   - Berikut deklarasi *class* `Sepeda`:
     ```java
     class Sepeda {
         String aktifitas;
         String warna;
         int kecepatan;
     }
     ```

### 2. Konstruktor `Sepeda`
   - **Konstruktor** adalah metode khusus yang digunakan untuk menginisialisasi objek.
   - Konstruktor `Sepeda` menerima tiga parameter untuk menginisialisasi `aktifitas`, `warna`, dan `kecepatan`.
   - Contoh deklarasi konstruktor:
     ```java
     public Sepeda(String aktifitas, String warna, int kecepatan) {
         this.aktifitas = aktifitas;
         this.warna = warna;
         this.kecepatan = kecepatan;
     }
     ```
   - `this` digunakan untuk membedakan antara atribut dari *class* dengan parameter konstruktor.

### 3. Method `cekKecepatan`
   - **Method** adalah fungsi yang didefinisikan dalam sebuah *class* untuk menentukan perilaku dari objek.
   - Method `cekKecepatan()` mengecek nilai `kecepatan` dan menentukan `aktifitas` berdasarkan kecepatan sepeda:
     - Jika `kecepatan` = 0, `aktifitas` diatur menjadi "berhenti".
     - Jika `kecepatan` > 0 dan ≤ 10, `aktifitas` diatur menjadi "melaju pelan".
     - Jika `kecepatan` > 10, `aktifitas` diatur menjadi "melaju cepat".
   - Deklarasi method `cekKecepatan`:
     ```java
     void cekKecepatan() {
         if (kecepatan == 0) {
             aktifitas = "berhenti";
         } else if (kecepatan > 0 && kecepatan <= 10) {
             aktifitas = "melaju pelan";
         } else {
             aktifitas = "melaju cepat";
         }
     }
     ```

### 4. Method `cetakAtribut`
   - Method ini digunakan untuk mencetak atribut `aktifitas`, `warna`, dan `kecepatan` dari objek sepeda ke layar.
   - Deklarasi method `cetakAtribut`:
     ```java
     void cetakAtribut() {
         System.out.println("Aktifitas: " + aktifitas);
         System.out.println("Warna: " + warna);
         System.out.println("Kecepatan: " + kecepatan + " km/jam");
     }
     ```

### 5. Objek `sepedaKu` dalam `main` Method
   - **Object** adalah instance dari sebuah *class*.
   - Objek `sepedaKu` dibuat dari *class* `Sepeda` dalam *main* method.
   - Objek ini diinisialisasi dengan nilai "berhenti", "biru", dan `kecepatan` 0, lalu diubah kecepatannya menjadi 8 dan `cekKecepatan()` dipanggil.
   - Deklarasi `main` method:
     ```java
     public class ClassSepeda {
         public static void main(String[] args) {
             Sepeda sepedaKu = new Sepeda("berhenti", "biru", 0);
             sepedaKu.kecepatan = 8;
             sepedaKu.cekKecepatan();
             sepedaKu.cetakAtribut();
         }
     }
     ```

### 6. Output Program
   - Saat program dijalankan, informasi tentang `aktifitas`, `warna`, dan `kecepatan` objek `sepedaKu` akan dicetak:
     ```
     Aktifitas: melaju pelan
     Warna: biru
     Kecepatan: 8 km/jam
     ```

### Kesimpulan
   - Program ini menunjukkan bagaimana OOP membantu dalam:
     - **Mengorganisir Kode**: Semua atribut dan metode terkait sepeda berada dalam satu *class*, membuat kode lebih terstruktur.
     - **Mengelola Data**: Data dapat diubah melalui metode tertentu tanpa mengakses atribut secara langsung.
     - **Reusability**: Kita dapat membuat banyak objek sepeda lain dengan mudah tanpa harus mendefinisikan ulang atribut dan metode.
     - **Modularisasi**: Kode dapat diperbarui atau diperluas dengan mudah, cukup dengan menambahkan atau memodifikasi metode dalam *class* `Sepeda`.

