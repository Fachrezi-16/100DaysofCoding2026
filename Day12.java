import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama\t: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan umur\t: ");
        int umur = sc.nextInt();

        System.out.print("Masukkan tinggi badan\t: ");
        double tinggi = sc.nextDouble();
        sc.nextLine(); // buang newline sisa

        System.out.print("Masukkan jenis kelamin (L/P)\t: ");
        char jk = sc.nextLine().charAt(0);

        System.out.println("\n=== BIODATA ===");
        System.out.printf("Nama\t\t: %s%n", nama);
        System.out.printf("Umur\t\t: %d tahun%n", umur);
        System.out.printf("Tinggi\t\t: %.1f cm%n", tinggi);
        System.out.printf("Jenis kelamin\t: %c%n", jk);

        sc.close();
    }
}