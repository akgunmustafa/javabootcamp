public class Main {
    public static void main(String[] args) {
        int sayi1=26;
        int sayi2=30;
        int sayi3=27;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayi :"+enBuyuk);
    }
}