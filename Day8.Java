public class DeklarasiInisialisasiUpdateVariabel {
    public static void main(String[] args) {

        // Deklarasi variabel
        String nama_player;
        int level;

        // Inisialisasi nilai awal
        nama_player = "Jefri";
        level = 1;

        // Menampilkan nilai awal
        System.out.println("=== DATA AWAL ===");
        System.out.println("Nama: " + nama_player);
        System.out.println("Level: " + level);

        // Update nilai variabel
        nama_player = "Jefri Pro";
        level = 5;

        // Menampilkan nilai akhir
        System.out.println("\n=== DATA AKHIR ===");
        System.out.println("Nama: " + nama_player);
        System.out.println("Level: " + level);
    }
}