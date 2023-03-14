//hesaplayı kullanıcak class lar kendi hesapla fonksiyonunu yazmalı.
public abstract class GameCalculator {
    public abstract void hesapla();

    //gamecalculator kullanan class lar gameover kullanmak zorunda.
    public final void gameOver(){
        System.out.println("Oyun sonu...");
    }
}
