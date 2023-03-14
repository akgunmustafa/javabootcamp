public class Main {
    public static void main(String[] args) {
        int number=32;
        boolean isPrime=true;
        if (number==1){
                System.out.println(number+" : Sayısı Asal Sayıdır.");
                return;
        }
        if (number<1){
                System.out.println(number+" : Sayı geçersizdir.");
                return;
        }

        for (int i=2;i<number;i++){
            if (number %i ==0){
                isPrime=false;
            }

        }
        if (isPrime){
        System.out.println(number+": Sayısı Asal Sayıdır");}
        else{
        System.out.println(number+" : Sayısı Asal Sayı değildir..");}
    }
}