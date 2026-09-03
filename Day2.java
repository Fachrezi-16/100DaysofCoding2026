public class BiodataDiri {
    public static void main(String[] args) {
        // Deklarasi variabel
        String nama = "Muh Adil Fachrezi";
        String alamat = "Kalukku, Mamuju, Sulawesi Barat";
        int usia = 18;
        double tinggiBadan = 168;
        char jenisKelamin = 'L';

        // Menggunakan print() - tidak membuat baris baru di akhir
        System.out.print("=== ");
        System.out.print("PROGRAM BIODATA DIRI ");
        System.out.print("===\n");

        // Menggunakan println() - membuat baris baru di akhir
        System.out.println("Nama Lengkap   : " + nama);
        System.out.println("Alamat Asal    : " + alamat);

        // Menggunakan printf() - untuk teks berformat
        System.out.printf("Usia           : %d tahun\n", usia);
        System.out.printf("Tinggi Badan   : %.1f cm\n", tinggiBadan);
        System.out.printf("Jenis Kelamin  : %c\n", jenisKelamin);
    }
}
