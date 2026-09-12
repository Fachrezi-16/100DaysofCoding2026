import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;
        double tinggi;
        char jenisKelamin;

        System.out.print("Nama\t\t: ");
        nama = input.nextLine();

        System.out.print("Umur\t\t: ");
        umur = input.nextInt();

        System.out.print("Tinggi\t\t: ");
        tinggi = input.nextDouble();

        System.out.print("Jenis kelamin\t: ");
        jenisKelamin = input.next().charAt(0);

        System.out.println();
        System.out.println("=== BIODATA ===");
        System.out.printf("Nama\t\t: %s%n", nama);
        System.out.printf("Umur\t\t: %d tahun%n", umur);
        System.out.printf("Tinggi\t\t: %.1f cm%n", tinggi);
        System.out.printf("Jenis kelamin\t: %c%n", jenisKelamin);

        input.close();
    }
}