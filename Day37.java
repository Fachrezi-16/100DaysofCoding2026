import java.util.Scanner;

public class KodeAngka {
    public static void main(String[] args) {

        Scanner zhy = new Scanner(System.in);

        int angka = zhy.nextInt();

        String kode;

        if (angka == 0) {
            kode = "N";
        } else if (angka > 0 && angka % 2 == 0) {
            kode = "A";
        } else if (angka > 0 && angka % 2 != 0) {
            kode = "B";
        } else if (angka < 0 && angka % 2 == 0) {
            kode = "C";
        } else {
            kode = "D";
        }

        if (angka > 100) {
            kode = kode + "+";
        } else if (angka < -100) {
            kode = kode + "-";
        }

        System.out.println(kode);

        zhy.close();
    }
}
