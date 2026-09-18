import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int tambah = a;
        tambah += 5;

        int kurang = a;
        kurang -= 2;

        int kali = a;
        kali *= 2;

        int bagi = a;
        bagi /= 2;

        System.out.println("Nilai awal = " + a);
        System.out.println("Hasil += " + tambah);
        System.out.println("Hasil -= " + kurang);
        System.out.println("Hasil *= " + kali);
        System.out.println("Hasil /= " + bagi);

        input.close();
    }
}