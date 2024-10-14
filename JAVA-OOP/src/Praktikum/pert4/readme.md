Berikut adalah penjelasan dari program Java **`WarungSederhana`** yang telah di buat:

```java
package Praktikum.pert4;
```
- Mendeklarasikan **package** tempat program ini berada, dalam hal ini adalah package `Praktikum.pert4`. Package membantu mengorganisir kode menjadi kelompok-kelompok.

```java
import java.util.Scanner;
```
- Mengimpor kelas **`Scanner`** dari pustaka Java. Scanner digunakan untuk membaca input dari pengguna (input keyboard).

```java
public class WarungSederhana {
```
- Mendeklarasikan kelas utama **`WarungSederhana`**. Dalam Java, setiap program harus berada di dalam sebuah kelas.

```java
public static void main(String[] args) {
```
- Mendeklarasikan **method utama** `main` yang akan dieksekusi saat program dijalankan.

```java
Scanner input = new Scanner(System.in);
```
- Membuat objek **`Scanner`** yang dinamakan `input`, yang digunakan untuk menerima input dari pengguna melalui terminal/keyboard.

```java
int pilihanMenu, jumlah, total = 0;
boolean selesai = false;
```
- Mendeklarasikan variabel:
  - **`pilihanMenu`**: Menyimpan pilihan menu yang dipilih pengguna.
  - **`jumlah`**: Menyimpan jumlah pesanan dari menu yang dipilih.
  - **`total`**: Menyimpan total biaya yang harus dibayar.
  - **`selesai`**: Menyimpan status apakah pemesanan sudah selesai atau belum.

```java
String[] menu = {"Nasi Goreng", "Mie Ayam", "Sate Ayam"};
int[] harga = {15000, 12000, 18000};
```
- Mendeklarasikan dua array:
  - **`menu`**: Menyimpan nama-nama menu makanan.
  - **`harga`**: Menyimpan harga dari masing-masing menu makanan.

```java
System.out.println("Selamat Datang di Warung Sederhana!");
System.out.println("Menu:");
```
- Menampilkan pesan selamat datang dan judul daftar menu di terminal.

```java
for (int i = 0; i < menu.length; i++) {
    System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
}
```
- **For loop** untuk menampilkan daftar menu dan harga secara berurutan. Setiap iterasi menampilkan satu item menu beserta harganya.

```java
do {
    System.out.print("\nPilih nomor menu (1-3) atau 0 untuk selesai: ");
    pilihanMenu = input.nextInt();
```
- **Do-while loop** untuk memulai proses pemesanan yang terus berulang sampai pengguna memilih untuk selesai. Meminta input dari pengguna untuk memilih menu, yang disimpan dalam variabel **`pilihanMenu`**.

```java
switch (pilihanMenu) {
```
- **Switch-case** digunakan untuk menangani pilihan menu pengguna berdasarkan input **`pilihanMenu`**.

```java
case 1:
    System.out.print("Masukkan jumlah Nasi Goreng: ");
    jumlah = input.nextInt();
    total += harga[0] * jumlah;
    System.out.println("Anda memesan " + jumlah + " Nasi Goreng");
    break;
```
- **Case 1**: Jika pengguna memilih menu pertama (Nasi Goreng), program akan meminta input jumlah pesanan, kemudian menambahkan biaya Nasi Goreng ke total biaya. 

```java
case 2:
    System.out.print("Masukkan jumlah Mie Ayam: ");
    jumlah = input.nextInt();
    total += harga[1] * jumlah;
    System.out.println("Anda memesan " + jumlah + " Mie Ayam");
    break;
```
- **Case 2**: Jika pengguna memilih menu kedua (Mie Ayam), prosesnya sama seperti pada `case 1` tapi untuk Mie Ayam.

```java
case 3:
    System.out.print("Masukkan jumlah Sate Ayam: ");
    jumlah = input.nextInt();
    total += harga[2] * jumlah;
    System.out.println("Anda memesan " + jumlah + " Sate Ayam");
    break;
```
- **Case 3**: Jika pengguna memilih menu ketiga (Sate Ayam), prosesnya sama seperti pada `case 1` tapi untuk Sate Ayam.

```java
case 0:
    selesai = true;
    break;
```
- **Case 0**: Jika pengguna memasukkan angka 0, program mengubah variabel **`selesai`** menjadi `true` untuk keluar dari loop dan menyelesaikan pemesanan.

```java
default:
    System.out.println("Pilihan tidak valid. Coba lagi.");
```
- **Default case**: Jika pengguna memasukkan input selain 1, 2, 3, atau 0, maka akan muncul pesan bahwa pilihan tidak valid.

```java
if (total > 50000) {
    System.out.println("Anda mendapatkan diskon 10%!");
    total = total - (total * 10 / 100);
} else if (total == 0) {
    System.out.println("Anda belum memesan apapun.");
}
```
- **If-else**:
  - Jika total belanja lebih dari 50.000, pengguna mendapatkan diskon 10%, dan total biaya diperbarui setelah dikurangi diskon.
  - Jika total pesanan adalah 0, artinya pengguna belum memesan apapun.

```java
} while (!selesai);
```
- **Do-while loop**: Loop terus berjalan sampai variabel **`selesai`** bernilai `true`, artinya pengguna memilih untuk keluar (memasukkan 0).

```java
System.out.println("Total yang harus dibayar: Rp" + total);
System.out.println("Terima kasih telah berbelanja di warung kami!");
input.close();
```
- Menampilkan total biaya yang harus dibayar pengguna, serta pesan terima kasih. Kemudian, objek **`Scanner`** ditutup menggunakan **`input.close()`** untuk membersihkan sumber daya yang digunakan.

### Ringkasan
- Program ini adalah simulasi sederhana pemesanan makanan di warung.
- Menggunakan **`switch-case`** untuk menangani pilihan menu, serta **`if-else`** untuk menghitung diskon dan memvalidasi pesanan.
- Penggunaan **`do-while`** loop memungkinkan proses pemesanan berulang hingga pengguna selesai.
