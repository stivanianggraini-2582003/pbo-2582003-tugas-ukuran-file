import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Konstanta 1 KB = 1024 byte, bertipe double.
        final double SATU_KB = 1024.0;

        String namaFile;

        // Ukuran file wajib long karena angka byte bisa melebihi batas int.
        long ukuranByte;

        double ukuranKB;
        double ukuranMB;
        double ukuranGB;

        int ukuranMBBulat;
        double selisihPembulatan;

        // Percobaan int dengan angka 3221225472:
        // error: integer number too large.
        // Angka tersebut tidak muat dalam tipe data int.

        System.out.print("Nama file     : ");
        namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte) : ");
        ukuranByte = scanner.nextLong();

        // Menggunakan 1024.0 agar pembagian menghasilkan double
        // dan pecahan tidak hilang seperti pada pembagian int.
        ukuranKB = ukuranByte / SATU_KB;

        ukuranMB = ukuranKB / SATU_KB;
        ukuranGB = ukuranMB / SATU_KB;

        // Casting eksplisit double ke int menghilangkan angka
        // pecahan di belakang koma.
        ukuranMBBulat = (int) ukuranMB;

        selisihPembulatan = ukuranMB - ukuranMBBulat;

        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println("  " + ukuranByte + " byte");
        System.out.println("  " + ukuranKB + " KB");
        System.out.println("  " + ukuranMB + " MB");
        System.out.println("  " + ukuranGB + " GB");

        System.out.println();
        System.out.println("Dibulatkan ke MB  : " + ukuranMBBulat);
        System.out.println("Selisih pembulatan: " + selisihPembulatan);

        scanner.close();
    }
}