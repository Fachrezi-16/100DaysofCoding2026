public class OperatorLogika {
    public static void main(String[] args) {

        int angka1 = 10;
        int angka2 = 20;

        System.out.println("AND (&&): " + (angka1 > 5 && angka2 > 5));
        System.out.println("OR (||): " + (angka1 > 5 || angka2 > 5));
        System.out.println("NOT (!): " + !(angka1 > 5));
    }
}