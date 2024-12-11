
# Penjelasan Polimorfisme dan Konsep OOP

---

## **1. Polimorfisme Statis**
Polimorfisme statis terjadi ketika metode atau konstruktor dalam suatu kelas memiliki nama yang sama, tetapi berbeda parameter atau tipe data. Hal ini disebut juga **method overloading**. 

**Karakteristik:**
- Metode memiliki nama yang sama.
- Parameter atau tipe data berbeda.
- Tidak memerlukan pewarisan.

**Contoh Kasus:**
Metode `tambah` digunakan untuk menjumlahkan angka atau menggabungkan teks. Contoh:
```java
class Polymorph {
    public int tambah(int x, int y) {
        return x + y;
    }

    public String tambah(String x, String y) {
        return x + " " + y;
    }
}
```

**Hasil Eksekusi:**
```
2 + 3 = 5
"2" + "3" = 2 3
```

---

## **2. Polimorfisme Dinamis**
Polimorfisme dinamis terjadi saat metode yang sama di kelas induk (superclass) ditimpa (overridden) di kelas anak (subclass). Hal ini sering melibatkan pewarisan dan antarmuka (interface).

**Karakteristik:**
- Menggunakan pewarisan atau antarmuka.
- Metode di kelas anak dapat menggantikan metode di kelas induk.
- Diterapkan menggunakan **method overriding**.

**Contoh Kasus:**
Kelas `Bentuk` memiliki metode `gambar`. Kelas `Lingkaran` menggantikan implementasi metode tersebut.
```java
class Bentuk {
    public void gambar() {
        System.out.println("Menggambar bentuk");
    }
}

class Lingkaran extends Bentuk {
    @Override
    public void gambar() {
        System.out.println("Menggambar lingkaran");
    }
}
```

**Hasil Eksekusi:**
```
Menggambar lingkaran
```

---

## **3. Abstract Class**
Abstract class adalah kelas dasar yang tidak bisa diinstansiasi secara langsung. Abstract class biasanya digunakan untuk mendefinisikan struktur dasar, sedangkan implementasinya dilakukan oleh subclass.

**Karakteristik:**
- Tidak dapat diinstansiasi.
- Dapat memiliki metode abstrak (tanpa implementasi).
- Dapat memiliki metode yang sudah diimplementasikan.

**Contoh Kasus:**
Kelas `Pegawai` adalah abstract class, sementara `Staff` mengimplementasikan metode abstraknya.
```java
abstract class Pegawai {
    private String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tugas();
}

class Staff extends Pegawai {
    public Staff(String nama) {
        super(nama);
    }

    @Override
    public void tugas() {
        System.out.println(getNama() + " bertugas sebagai Staff.");
    }
}
```

**Hasil Eksekusi:**
```
Rani bertugas sebagai Staff.
```

---

## **4. Interface**
Interface adalah kontrak yang mendefinisikan metode yang wajib diimplementasikan oleh kelas. Semua metode di dalam interface bersifat abstrak.

**Karakteristik:**
- Semua metode bersifat abstrak secara default.
- Sebuah kelas dapat mengimplementasikan beberapa interface (multiple inheritance).
- Tidak dapat memiliki atribut kecuali `static final`.

**Contoh Kasus:**
Menghitung luas dan keliling bidang dua dimensi menggunakan interface `Bidang2D`.
```java
interface Bidang2D {
    double getKeliling();
    double getLuas();
}

class Lingkaran implements Bidang2D {
    public double radius;

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceTester {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.radius = 10;
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());
    }
}
```

**Hasil Eksekusi:**
```
Luas Lingkaran: 314.1592653589793
Keliling Lingkaran: 62.83185307179586
```

---

## **5. Keyword `final`**
Kata kunci `final` digunakan untuk memastikan bahwa elemen yang dideklarasikan tidak dapat diubah.

**Penggunaan:**
- **Atribut `final`:** Nilainya tidak dapat diubah.
- **Metode `final`:** Tidak dapat di-override.
- **Kelas `final`:** Tidak dapat diwarisi.

**Contoh Kasus:**
Atribut dan metode di dalam kelas `MyMath` tidak dapat diubah atau di-override.
```java
final class MyMath {
    public final double PI = 3.1416;

    public final double luasLingkaran(double radius) {
        return PI * radius * radius;
    }
}
```

---

## **6. Keyword `static`**
Kata kunci `static` digunakan untuk menyatakan bahwa atribut atau metode adalah milik kelas, bukan objek.

**Karakteristik:**
- Dapat diakses tanpa membuat objek.
- Bersifat global dalam konteks kelas.

**Contoh Kasus:**
Menggunakan atribut dan metode statis di kelas `MyMath`.
```java
class MyMath {
    public static final double PI = 3.1416;

    public static double luasLingkaran(double radius) {
        return PI * radius * radius;
    }
}

public class StaticTester {
    public static void main(String[] args) {
        System.out.println("Luas Lingkaran: " + MyMath.luasLingkaran(10));
    }
}
```

**Hasil Eksekusi:**
```
Luas Lingkaran: 314.16
```

---

## **7. Jenis-Jenis Variabel**
Di Java, terdapat tiga jenis variabel:
1. **Local Variable:**
   - Dideklarasikan di dalam metode atau blok.
   - Hanya dapat diakses dalam blok tempat variabel itu dideklarasikan.

2. **Instance Variable:**
   - Dideklarasikan di dalam kelas tetapi di luar metode.
   - Dimiliki oleh setiap objek (setiap objek memiliki salinan variabelnya sendiri).

3. **Static/Class Variable:**
   - Dideklarasikan dengan kata kunci `static`.
   - Dimiliki oleh kelas dan berbagi nilai di antara semua objek.

**Contoh Kasus:**
```java
class MyVar {
    public static int myStatic; // Static Variable
    public int myInstance; // Instance Variable

    public void test() {
        int localVar = 10; // Local Variable
        System.out.println("Local Variable: " + localVar);
    }
}
```
```