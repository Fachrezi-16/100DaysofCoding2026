import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();

        double luas = PI * jariJari * jariJari;

        System.out.println(luas);

        input.close();
    }
}