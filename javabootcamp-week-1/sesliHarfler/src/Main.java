public class Main {
    public static void main(String[] args) {
        char harf = 'P';

        if (harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U') {
            System.out.println(harf + ": KALIN SESLİDİR.");
        } else if (harf == 'E' || harf == 'İ' || harf == 'Ö' || harf == 'Ü'){
            System.out.println(harf + ": İNCE SESLİDİR");
        }

        else {
            System.out.println("ÜNLÜ BİR HARF DEĞİLDİR");
        }
    }
}