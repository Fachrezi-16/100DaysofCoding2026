public class App {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Sebelum ditukar:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        int sementara = a;
        a = b;
        b = sementara;

        System.out.println("\nSetelah ditukar:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}