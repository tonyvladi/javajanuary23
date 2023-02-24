import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for English");
        System.out.println("2 for Spanish");
        System.out.println("3 for French");
        int input = sc.nextInt();

        switch (input){
            case 1:
                System.out.println("English");
                break;

            case 2:
                System.out.println("Spanish");
                break;

            case 3:
                System.out.println("French");
                break   ;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}