public class Main {
    public static void main(String[] args) {
        int number=28;
        int b=0;
        for (int a=1; a<number;a++){
            if (number%a==0){
                b= a+b;
            }
        }
        if (b==number){
            System.out.println(number+" : Sayısı mükemmel sayıdır.");
        }
        else {
            System.out.println("Sayı mükemmel sayı değildir.");
        }
    }
}