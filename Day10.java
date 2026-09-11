public class Day10 {
    public static void main(String[] args) {
        // 1 & 2. Deklarasi dan nilai awal karakter
        byte level = 10;
        short jumlah_item = 50;
        int exp = 1000;
        long gold = 50000;

        // 3. Batas maksimal tipe data
        System.out.println("=== BATAS MAKSIMAL TIPE DATA ===");
        System.out.println("Maks Byte: " + Byte.MAX_VALUE);
        System.out.println("Maks Short: " + Short.MAX_VALUE);
        System.out.println("Maks Int: " + Integer.MAX_VALUE);
        System.out.println("Maks Long: " + Long.MAX_VALUE);
        System.out.println();

        // 5. Data awal karakter
        System.out.println("=== DATA AWAL KARAKTER ===");
        System.out.println("Level: " + level);
        System.out.println("Item: " + jumlah_item);
        System.out.println("EXP: " + exp);
        System.out.println("Gold: " + gold);
        System.out.println();

        // 4. Update data setelah misi
        level += 2;
        jumlah_item += 5;
        exp += 250;
        gold += 10000;

        // 5. Data setelah misi
        System.out.println("=== DATA SETELAH MISI ===");
        System.out.println("Level: " + level);
        System.out.println("Item: " + jumlah_item);
        System.out.println("EXP: " + exp);
        System.out.println("Gold: " + gold);
    }
}