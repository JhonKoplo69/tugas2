public class KonversiBilangan {


    public static int binerKeDesimal(String biner) {
        //  int hasil = 0;
        // int hasil = 0;
        int hasil = 0;
        // for (int i = biner.length() - 1; i >= 0; i--)
        for (int i = biner.length() - 1; i >= 0; i--){
            // hasil += (int) biner.charAt(i) * Math.pow(2, biner.length() - 1 - i);
            hasil += (int) biner.charAt(i) * Math.pow(2, biner.length() - 1 - i);
        }
        // return hasil;
        return hasil;
    }

    public static void main(String[] args) {
        //System.out.println(binerKeDesimal("1010")); // 10
        System.out.println(binerKeDesimal("1010")); // 10
        System.out.println(binerKeDesimal("1011")); // 11
        System.out.println(binerKeDesimal("1100")); // 12
        System.out.println(binerKeDesimal("1111")); // 15
        System.out.println(binerKeDesimal("-1010")); // -10
    }
}
