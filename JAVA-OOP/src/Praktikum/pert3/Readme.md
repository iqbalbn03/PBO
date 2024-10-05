

# Laporan Praktikum: Operator Logika, Aritmatika, dan Relasional di Java

## 1. Tujuan
Praktikum ini bertujuan untuk memahami penggunaan operator logika, aritmatika, dan relasional di dalam bahasa pemrograman Java, serta mempelajari bagaimana cara operator-operator ini bekerja dalam konteks kondisi dan operasi perhitungan.

## 2. Teori Dasar
Java memiliki berbagai jenis operator yang digunakan untuk melakukan operasi dasar pada variabel. Tiga jenis operator yang digunakan dalam praktikum ini adalah:

- **Operator Logika**: Digunakan untuk mengoperasikan nilai boolean, seperti `&&`, `||`, `!`, dan `&`.
- **Operator Aritmatika**: Digunakan untuk melakukan operasi matematika dasar seperti penambahan (`+`), pengurangan (`-`), perkalian (`*`), pembagian (`/`), dan modulus (`%`).
- **Operator Relasional**: Digunakan untuk membandingkan dua nilai dan menghasilkan nilai boolean. Contohnya adalah `==`, `!=`, `>`, `<`, `>=`, dan `<=`.

## 3. Alat dan Bahan
- Laptop atau komputer
- Java Development Kit (JDK)
- IDE (Integrated Development Environment) seperti IntelliJ IDEA atau Eclipse

## 4. Langkah-Langkah Percobaan

### A. Operator Logika
1. Buat program Java untuk mendemonstrasikan penggunaan operator logika `&&` dan `&`.
2. Gunakan dua variabel `i` dan `j` dengan nilai awal yang berbeda.
3. Lakukan operasi menggunakan operator `&&` dan `&` serta perhatikan hasil yang ditampilkan.

### B. Operator Aritmatika
1. Buat program Java yang menggunakan operator aritmatika `+`, `-`, `*`, `/`, dan `%`.
2. Tentukan dua variabel angka (misalnya `a = 10` dan `b = 5`).
3. Lakukan operasi aritmatika dengan variabel tersebut dan tampilkan hasilnya di konsol.

### C. Operator Relasional
1. Buat program Java untuk membandingkan dua variabel angka menggunakan operator relasional seperti `==`, `!=`, `>`, `<`, `>=`, `<=`.
2. Tentukan dua variabel angka (misalnya `x = 15` dan `y = 20`).
3. Bandingkan kedua variabel tersebut dengan berbagai operator relasional dan tampilkan hasilnya di konsol.

## 5. Kode Program

### A. Operator Logika

```java
public class OperatorLogika {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = false;

        // Demonstrasi penggunaan operator &&
        test = (i > 10) && (j++ > 9);
        System.out.println("Setelah &&: ");
        System.out.println("Nilai i: " + i);
        System.out.println("Nilai j: " + j);
        System.out.println("Nilai test: " + test);

        // Demonstrasi penggunaan operator &
        test = (i > 10) & (j++ > 9);
        System.out.println("\nSetelah &:");
        System.out.println("Nilai i: " + i);
        System.out.println("Nilai j: " + j);
        System.out.println("Nilai test: " + test);
    }
}
```

### B. Operator Aritmatika

```java
public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Penjumlahan (a + b): " + (a + b));
        System.out.println("Pengurangan (a - b): " + (a - b));
        System.out.println("Perkalian (a * b): " + (a * b));
        System.out.println("Pembagian (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));
    }
}
```

### C. Operator Relasional

```java
public class OperatorRelasional {
    public static void main(String[] args) {
        int x = 15;
        int y = 20;

        System.out.println("x == y: " + (x == y));  // false
        System.out.println("x != y: " + (x != y));  // true
        System.out.println("x > y: " + (x > y));    // false
        System.out.println("x < y: " + (x < y));    // true
        System.out.println("x >= y: " + (x >= y));  // false
        System.out.println("x <= y: " + (x <= y));  // true
    }
}
```

## 6. Hasil Percobaan

### A. Operator Logika
- **&& (Logical AND)**: Menghasilkan `false` karena kondisi pertama (`i > 10`) salah, sehingga kondisi kedua (`j++ > 9`) tidak dievaluasi.
- **& (Bitwise AND)**: Kondisi pertama salah, tetapi kondisi kedua tetap dievaluasi, sehingga `j` bertambah menjadi 11.

### B. Operator Aritmatika
- Hasil dari berbagai operasi aritmatika menghasilkan:
  - Penjumlahan: `15`
  - Pengurangan: `5`
  - Perkalian: `50`
  - Pembagian: `2`
  - Modulus: `0`

### C. Operator Relasional
- Perbandingan antara `x` dan `y` menghasilkan:
  - `x == y`: `false`
  - `x != y`: `true`
  - `x > y`: `false`
  - `x < y`: `true`
  - `x >= y`: `false`
  - `x <= y`: `true`

## 7. Pembahasan
- **Operator Logika**: Operator `&&` tidak akan mengevaluasi kondisi kedua jika kondisi pertama salah, sedangkan `&` akan mengevaluasi kedua kondisi terlepas dari hasil kondisi pertama.
- **Operator Aritmatika**: Operator ini berfungsi sesuai dengan aturan matematika dasar dan digunakan untuk operasi perhitungan numerik.
- **Operator Relasional**: Digunakan untuk membandingkan dua nilai, menghasilkan hasil berupa nilai boolean (`true` atau `false`).

## 8. Kesimpulan
Dari praktikum ini, dapat disimpulkan bahwa operator logika, aritmatika, dan relasional di Java memiliki peran penting dalam menentukan alur logika program serta melakukan perhitungan dan perbandingan nilai. Memahami penggunaan operator ini penting dalam mengembangkan program yang efisien dan logis.

