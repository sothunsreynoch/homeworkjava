import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = input.nextLine();
         int sum=0;
        for(int i=0; i < username.length();i++) {
            int result = switch (username.charAt(i)) {
                case 'a', 'j', 's' -> 1;
                case 'b', 'k', 't' -> 2;
                case 'c', 'l', 'u' -> 3;
                case 'd', 'm', 'v' -> 4;
                case 'e', 'n', 'w' -> 5;
                case 'f', 'o', 'x' -> 6;
                case 'g', 'p', 'y' -> 7;
                case 'h', 'q', 'z' -> 8;
                case 'i', 'r' -> 9;
                default -> 0;

//                System.out.println(""+username.charAt(i))
            };


            sum = sum + result;
        }

        System.out.println(" result is :" + sum);
        while (sum>9){
         sum = (sum%10)+ (sum/10);
        }
        System.out.println("total :"+sum);
    }


}
