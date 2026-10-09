import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Bakso");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Pilihan: Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Pilihan: Mie Goreng");
        } else if (pilihan == 3) {
            System.out.println("Pilihan: Bakso");
        } else {
            System.out.println("Menu tidak tersedia");
        }

        input.close();
    }
}