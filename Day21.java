import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA ANGGOTA ===");

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        int umur = Integer.parseInt(input.nextLine());

        System.out.print("Tinggi Badan: ");
        double tinggi = Double.parseDouble(input.nextLine());

        System.out.print("Berat Badan: ");
        double berat = Double.parseDouble(input.nextLine());

        System.out.print("Semester: ");
        short semester = Short.parseShort(input.nextLine());

        System.out.print("IPK: ");
        double ipk = Double.parseDouble(input.nextLine());

        System.out.print("NIM: ");
        long nim = Long.parseLong(input.nextLine());

        System.out.print("Jumlah Penghargaan: ");
        byte penghargaan = Byte.parseByte(input.nextLine());

        System.out.print("Kode Kelas: ");
        char kelas = input.nextLine().charAt(0);

        int tahunLahir = 2026 - umur;
        int totalPoin = penghargaan * 10 + semester * 5;
        double tinggiMeter = tinggi / 100;

        System.out.println();
        System.out.println("=== DATA ANGGOTA UKM MULTIMEDIA ===");
        System.out.println("Nama: " + nama + " (Inisial: " + nama.charAt(0) + ")");
        System.out.println("Umur: " + umur + " tahun, Perkiraan Lahir: " + tahunLahir);
        System.out.println("Tinggi: " + tinggi + " cm (" + tinggiMeter + " m), Berat: " + berat + " kg");
        System.out.println("Semester: " + semester + ", IPK: " + ipk + ", NIM: " + nim);
        System.out.println("Kode Kelas: " + kelas + ", Jumlah Penghargaan: " + penghargaan);
        System.out.println("Total Poin Prestasi: " + totalPoin);

        input.close();
    }
}