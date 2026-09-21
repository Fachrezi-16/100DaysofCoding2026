import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM          : ");
        int nim = input.nextInt();

        System.out.print("Masukkan umur         : ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan : ");
        double tinggiBadan = input.nextDouble();

        // Konversi menggunakan String.valueOf()
        String nimString = String.valueOf(nim);

        // Konversi menggunakan toString()
        String umurString = Integer.toString(umur);
        String tinggiString = Double.toString(tinggiBadan);

        // Konversi menggunakan operator +
        String gabungan = "" + umur + tinggiBadan;

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM                    : " + nimString);
        System.out.println("Umur                   : " + umurString + " tahun");
        System.out.println("Tinggi Badan           : " + tinggiString + " cm");
        System.out.println("Gabungan Umur + Tinggi : " + gabungan);

        input.close();
    }
}