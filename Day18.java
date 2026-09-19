public class KonversiOtomatis {
    public static void main(String[] args) {

        byte dataAwal = 50;

        short dataShort = dataAwal;
        int dataInt = dataShort;
        long dataLong = dataInt;
        float dataFloat = dataLong;
        double dataDouble = dataFloat;

        System.out.println("Data awal (byte)   : " + dataAwal);
        System.out.println("Hasil ke short     : " + dataShort);
        System.out.println("Hasil ke int       : " + dataInt);
        System.out.println("Hasil ke long      : " + dataLong);
        System.out.println("Hasil ke float     : " + dataFloat);
        System.out.println("Hasil ke double    : " + dataDouble);
    }
}