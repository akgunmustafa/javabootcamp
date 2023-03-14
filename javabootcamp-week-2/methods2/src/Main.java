public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava mükemmel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 11);
        System.out.println(sayi);
        int toplam = topla2(2, 4, 8, 7, 1, 10);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi2 + sayi1;
    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}