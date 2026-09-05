public class DataNumerikBilanganBulat {
    public static void main(String[] args) {

        // byte digunakan untuk menyimpan bilangan bulat kecil
        // Ukuran 8 bit, nilai -128 sampai 127
        byte jumlahKelas = 10;

        // short digunakan untuk menyimpan bilangan bulat yang lebih besar dari byte
        // Ukuran 16 bit, nilai -32.768 sampai 32.767
        short jumlahMahasiswa = 300;

        // int digunakan untuk menyimpan bilangan bulat yang lebih besar
        // Ukuran 32 bit, nilai -2.147.483.648 sampai 2.147.483.647
        int jumlahKomputer = 5000;

        // long digunakan untuk menyimpan bilangan bulat yang sangat besar
        // Ukuran 64 bit, nilai -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807
        long jumlahData = 1000000000L;

        System.out.println("Jumlah Kelas       : " + jumlahKelas);
        System.out.println("Jumlah Mahasiswa   : " + jumlahMahasiswa);
        System.out.println("Jumlah Komputer    : " + jumlahKomputer);
        System.out.println("Jumlah Data        : " + jumlahData);
    }
}
