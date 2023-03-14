public class Main {
    public static void main(String[] args) {
        //OrenciKrediManager altındaki faiz oranı 1.10 şeklinde hesaplandı.
        //Bu oranı uygulayabilmek için class içinde overriding yaptık.
        //Yani extends ettiğimiz verinin üzerine yazdık.

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgremenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }


        //final anahtarı ile diğer classların overriding yapmasına engel olabiliriz.
        //FinalKeyword classına bakarsanız bunun örneği var.

        FinalKeyword[] finalKeywords = new FinalKeyword[]{new FinalKeywordKrediManager()};
        for (FinalKeyword finalKeyword : finalKeywords) {
            System.out.println("Final Key Örneği :" + finalKeyword.hesapla(999));
        }

    }
}