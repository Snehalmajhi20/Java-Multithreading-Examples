import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'a' value: ");
        int a = sc.nextInt();
        System.out.println("Enter the 'b' value: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The c value is: "+c);
    }
}
