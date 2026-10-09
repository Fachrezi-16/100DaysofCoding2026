import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng - Rp15000");
        System.out.println("2. Mie Goreng  - Rp12000");
        System.out.println("3. Bakso       - Rp10000");

        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();

        System.out.print("Jumlah pesanan: ");
        int jumlah = input.nextInt();

        int harga = 0;

        if (pilihan == 1) {
            harga = 15000;
            System.out.println("Menu: Nasi Goreng");
        } else if (pilihan == 2) {
            harga = 12000;
            System.out.println("Menu: Mie Goreng");
        } else if (pilihan == 3) {
            harga = 10000;
            System.out.println("Menu: Bakso");
        } else {
            System.out.println("Menu tidak tersedia");
        }

        if (pilihan >= 1 && pilihan <= 3) {
            int total = harga * jumlah;
            System.out.println("Harga satuan: Rp" + harga);
            System.out.println("Total harga: Rp" + total);
        }

        input.close();
    }
}