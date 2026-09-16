import java.util.Scanner;

public class PembagianBiayaBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahBuku = input.nextInt();
        int hargaPerBuku = input.nextInt();
        int jumlahOrang = input.nextInt();

        int totalHarga = jumlahBuku * hargaPerBuku;
        int biayaPerOrang = totalHarga / jumlahOrang;

        System.out.println("Jumlah buku = " + jumlahBuku);
        System.out.println("Harga per buku = Rp" + hargaPerBuku);
        System.out.println("Total harga = Rp" + totalHarga);
        System.out.println("Jumlah orang = " + jumlahOrang);
        System.out.println("Biaya per orang = Rp" + biayaPerOrang);

        input.close();
    }
}