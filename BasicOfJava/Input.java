import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        /*  System.out.println("enter number");

            int num = sc.nextInt();

            System.out.println("your number is"+num);
        */

        System.out.println("Enter First Number:");

        int num_1 = sc.nextInt();

        System.out.println("Enter Second Number:");

        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;

        System.out.println("Sum is:"+sum);
        
    }
}