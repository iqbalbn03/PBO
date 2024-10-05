package Praktikum.pert3;

public class OperatorLogika {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = false;

        // Demonstrasi penggunaan operator &&
        // Operator && melakukan short-circuit, artinya jika kondisi pertama salah, kondisi kedua tidak akan dievaluasi
        test = (i > 10) && (j++ > 9); 
        System.out.println("Setelah &&: ");
        System.out.println("Nilai i: " + i);    // i tetap 0, karena tidak diubah
        System.out.println("Nilai j: " + j);    // j tetap 10, karena j++ tidak dieksekusi
        System.out.println("Nilai test: " + test); // false, karena (i > 10) adalah false

        // Demonstrasi penggunaan operator &
        // Operator & selalu mengevaluasi kedua kondisi, tidak peduli hasil kondisi pertama
        test = (i > 10) & (j++ > 9); 
        System.out.println("\nSetelah &:");
        System.out.println("Nilai i: " + i);    // i tetap 0, karena tidak diubah
        System.out.println("Nilai j: " + j);    // j sekarang 11, karena j++ dieksekusi
        System.out.println("Nilai test: " + test); // false, karena (i > 10) adalah false, meskipun j++ dieksekusi
    }
}
