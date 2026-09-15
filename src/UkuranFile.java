import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String namaFile;
        long ukuranByte;

        System.out.print("Nama file     : ");
        namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte) : ");
        ukuranByte = scanner.nextLong();
    }
}
import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double SATU_KB = 1024.0;

        String namaFile;
        long ukuranByte;

        double ukuranKB;
        double ukuranMB;
        double ukuranGB;

        int ukuranMBBulat;
        double selisihPembulatan;

        System.out.print("Nama file     : ");
        namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte) : ");
        ukuranByte = scanner.nextLong();

        ukuranKB = ukuranByte / SATU_KB;
        ukuranMB = ukuranKB / SATU_KB;
        ukuranGB = ukuranMB / SATU_KB;

        ukuranMBBulat = (int) ukuranMB;
        selisihPembulatan = ukuranMB - ukuranMBBulat;
    }
}