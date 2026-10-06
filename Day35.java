import java.util.Scanner;

public class MesinTiket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode tiket: ");
        int kode = input.nextInt();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan saldo: ");
        int saldo = input.nextInt();

        int pemeriksaan = kode * umur % 100;
        boolean valid = false;

        if (pemeriksaan >= 20 && pemeriksaan <= 80) {
        if (umur < 17) {
           if (saldo >= 100000) {
                    valid = true;
                }
            } else {
                if (saldo >= 50000) {
                    valid = true;
              }
          }
        }

        System.out.println("Nilai Pemeriksaan: " + pemeriksaan);

        if (valid) {
            System.out.println("Status Tiket: VALID");
        } else {
            System.out.println("Status Tiket: TIDAK VALID");
        }

        input.close();
    }
}