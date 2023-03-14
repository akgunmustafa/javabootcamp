public class Main {
    public static void main(String[] args) {
        WomanGameCalculater womanGameCalculater =new WomanGameCalculater();
        womanGameCalculater.hesapla();
        womanGameCalculater.gameOver();

        /*Abstractlar base i gizlemek için de kullanılır.
        Abstract varsa new kullanmak için override yapmak zorunda kalırız. Normal kullanamayız.

        GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void hesapla() {

            }
        };
        */
    }
}