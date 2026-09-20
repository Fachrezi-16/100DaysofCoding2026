public class KonversiManualPaksa {
    public static void main(String[] args) {

        double nilaiDouble = 85.75;

        float nilaiFloat = (float) nilaiDouble;
        long nilaiLong = (long) nilaiFloat;
        int nilaiInt = (int) nilaiLong;
        short nilaiShort = (short) nilaiInt;
        byte nilaiByte = (byte) nilaiShort;

        System.out.println("Nilai double: " + nilaiDouble);
        System.out.println("Nilai float setelah konversi: " + nilaiFloat);
        System.out.println("Nilai long setelah konversi: " + nilaiLong);
        System.out.println("Nilai int setelah konversi: " + nilaiInt);
        System.out.println("Nilai short setelah konversi: " + nilaiShort);
        System.out.println("Nilai byte setelah konversi: " + nilaiByte);
    }
}