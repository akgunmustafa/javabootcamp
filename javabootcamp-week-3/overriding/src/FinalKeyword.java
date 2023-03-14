public class FinalKeyword {

    //final anahtarı ile diğer classların overriding yapmasına engel olabiliriz.
    // Extends altında olan classlar overriding yapamaz.
    public final double hesapla(double tutar) {
        return tutar * 1.09;
    }
}
