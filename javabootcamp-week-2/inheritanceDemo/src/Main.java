public class Main {
    public static void main(String[] args) {
        KrediUserInterface krediUserInterface=new KrediUserInterface();
        krediUserInterface.KrediHesapla(new AslerKrediManager());
        krediUserInterface.KrediHesapla(new TarimKrediManager());
        krediUserInterface.KrediHesapla(new OgremenKrediManager());

    }
}