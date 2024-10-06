Penjelasan dan pembahasan dari setiap baris kode pada program `AritmatikaDemo`:

```java
package Praktikum.pert3;
```
- **Baris 1:** Deklarasi package bernama `Praktikum.pert3`. Package adalah kumpulan class yang digunakan untuk mengelompokkan class dengan tujuan menghindari konflik nama dan mempermudah pengorganisasian kode.

```java
public class AritmatikaDemo {
```
- **Baris 2:** Mendefinisikan class bernama `AritmatikaDemo`. Dalam Java, semua kode harus ditulis di dalam class. Class ini bersifat `public` sehingga dapat diakses dari luar package.

```java
    public static void main(String[] args) {
```
- **Baris 3:** Deklarasi method `main`. Method ini adalah titik awal eksekusi program Java. `public` menandakan bahwa method ini dapat diakses dari luar class. `static` menandakan method ini milik class, bukan objek. `void` berarti method ini tidak mengembalikan nilai. `String[] args` digunakan untuk menerima argumen dari command line.

```java
        int i = 8;
        int j = 2;
        double x = 47.475;
        double y = 7.22;
```
- **Baris 4-7:** Mendeklarasikan dan menginisialisasi variabel:
  - `i` dan `j` adalah tipe data `int` (bilangan bulat), masing-masing bernilai 8 dan 2.
  - `x` dan `y` adalah tipe data `double` (bilangan desimal), masing-masing bernilai 47.475 dan 7.22.

```java
        System.out.println("Variable values...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
```
- **Baris 9-13:** Menampilkan nilai dari variabel `i`, `j`, `x`, dan `y` ke layar menggunakan method `System.out.println`. Tanda `+` digunakan untuk menggabungkan string dengan nilai variabel.

```java
        System.out.println("Adding...");
        System.out.println(" i + j = " + (i + j));
        System.out.println(" x + y = " + (x + y));
```
- **Baris 15-17:** Menampilkan hasil penjumlahan variabel `i` dan `j`, serta `x` dan `y`. Operator `+` digunakan untuk operasi penjumlahan.

```java
        System.out.println("Subtracting...");
        System.out.println(" i - j = " + (i - j));
        System.out.println(" x - y = " + (x - y));
```
- **Baris 19-21:** Menampilkan hasil pengurangan variabel `i` dan `j`, serta `x` dan `y`. Operator `-` digunakan untuk operasi pengurangan.

```java
        System.out.println("Multiplying...");
        System.out.println(" i * j = " + (i * j));
        System.out.println(" x * y = " + (x * y));
```
- **Baris 23-25:** Menampilkan hasil perkalian variabel `i` dan `j`, serta `x` dan `y`. Operator `*` digunakan untuk operasi perkalian.

```java
        System.out.println("Dividing...");
        System.out.println(" i / j = " + (i / j));
        System.out.println(" x / y = " + (x / y));
```
- **Baris 27-29:** Menampilkan hasil pembagian variabel `i` dan `j`, serta `x` dan `y`. Operator `/` digunakan untuk operasi pembagian.

```java
        System.out.println("Computing the remainder...");
        System.out.println(" i % j = " + (i % j));
        System.out.println(" x % y = " + (x % y));
```
- **Baris 31-33:** Menampilkan hasil operasi modulus atau sisa bagi variabel `i` dan `j`, serta `x` dan `y`. Operator `%` digunakan untuk menghitung sisa pembagian.

```java
        System.out.println("Mixing tipes...");
        System.out.println(" i + j = " + (j + y));
        System.out.println(" i * x = " + (i * x));
```
- **Baris 35-37:** Menampilkan hasil dari operasi dengan tipe data yang berbeda. Pada baris pertama, variabel `j` (int) dijumlahkan dengan `y` (double). Pada baris kedua, variabel `i` (int) dikalikan dengan `x` (double). Dalam kedua kasus, hasil akan bertipe `double` karena tipe `double` lebih presisi.

### Kesimpulan
Program ini menunjukkan bagaimana melakukan operasi aritmatika dasar (penjumlahan, pengurangan, perkalian, pembagian, dan modulus) pada tipe data `int` dan `double`, serta bagaimana Java menangani operasi antara dua tipe data yang berbeda.