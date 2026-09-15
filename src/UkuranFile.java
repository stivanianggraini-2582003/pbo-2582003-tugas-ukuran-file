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