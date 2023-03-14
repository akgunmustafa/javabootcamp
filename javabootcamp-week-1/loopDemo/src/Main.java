public class Main {
    public static void main(String[] args) {
        int i;
        for (i=0;i<11;i+=2){
            System.out.println(i);
        }
        System.out.println(" For Döngüsü Bitti ");
        int a=1;
        while (a<10){
            System.out.println(a);
            a+=2;
        }
        System.out.println("while döngüsü bitti");

        int b=100;
        do{
            System.out.println(b);
            b+=2;
        }while (b<10);
        System.out.println("do-while döngüsü bitti");
    }
}