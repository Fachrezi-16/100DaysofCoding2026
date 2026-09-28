import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        angka--;
        System.out.println("Setelah Decrement: " + angka);

        angka++;
        System.out.println("Setelah Increment: " + angka);

        input.close();
    }
}