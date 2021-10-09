import java.util.Scanner;

public class functionINjava {

    public static void main(String[] args) {

      sum1();
    }

    static void sum1()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= in.nextInt();
        int b = in.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}
