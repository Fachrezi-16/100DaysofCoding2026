import java.util.Scanner;

public class OperatorModulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int hasilModulus = a % b;

        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Hasil modulus = " + hasilModulus);

        input.close();
    }
}