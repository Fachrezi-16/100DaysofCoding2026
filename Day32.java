public class KombinasiOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Operator Aritmatika
        System.out.println("Tambah: " + (a + b));       // Penjumlahan
        System.out.println("Kurang: " + (a - b));      // Pengurangan
        System.out.println("Kali: " + (a * b));        // Perkalian
        System.out.println("Bagi: " + (a / b));        // Pembagian

        // Operator Perbandingan
        System.out.println("Sama: " + (a == b));              // Sama dengan
        System.out.println("Tidak sama: " + (a != b));       // Tidak sama dengan
        System.out.println("Lebih besar: " + (a > b));       // Lebih dari
        System.out.println("Kurang dari: " + (a < b));       // Kurang dari
        System.out.println("Lebih atau sama: " + (a >= b));  // Lebih dari atau sama dengan
        System.out.println("Kurang atau sama: " + (a <= b)); // Kurang dari atau sama dengan

        // Operator Logika
        System.out.println("AND: " + (a > 5 && b > 3));      // AND
        System.out.println("OR: " + (a > 15 || b > 3));     // OR
        System.out.println("NOT: " + !(a > b));              // NOT

        // Operator Increment
        a++;
        System.out.println("Increment: " + a);              // Increment

        // Operator Decrement
        a--;
        System.out.println("Decrement: " + a);              // Decrement
    }
}