import java.util.Scanner;

public class Perbandingan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka 1: ");
        int angka1 = input.nextInt();

        System.out.print("Angka 2: ");
        int angka2 = input.nextInt();

        System.out.println("Angka 1 < Angka 2: " + (angka1 < angka2));
        System.out.println("Angka 1 > Angka 2: " + (angka1 > angka2));

        input.close();
    }
}