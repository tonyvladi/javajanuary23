import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int  a = 0;
//        while(a <= 10){
//            System.out.println("a = "+ a);
//            a++;
//        }
//        int b = 15;
//        do{
//            System.out.println("b = " + b);
//            b++;
//        }while( b <= 10);
//        System.out.println("final value of b is " + b);

        // for loop
//        System.out.println("Please enter the value that you want to skip");
//        Scanner sc = new Scanner(System.in);
//        int skipValue = sc.nextInt();
        System.out.println("Starting loop");

        for(int i = 0 ; i <= 10 ; i++){
            if(i  >= 4){
                System.out.println("i = " + i);
                continue;
            }

        }
        System.out.println("exiting loop");
    }
}