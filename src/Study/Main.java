package Study;
import java.util.Scanner;


public class Main {

    static int negative(int x){
        if (x<=0){
            return 0;
        }else {
            System.out.print(x+ " " );
            return negative(x-5);
        }
    }

   static int positive (int x,int y){
        if (x>y){
            return x;
        }else {
            System.out.print(x+ " ");
            return positive(x+5,y);
        }
    }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Lutfen Bir Sayi Giriniz : ");
        int n = number.nextInt();

        positive(negative(n),n);

    }
}















