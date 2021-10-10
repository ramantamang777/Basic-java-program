import java.util.Scanner;
public class Prime_Or_not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Isprime(n));
    }

   static boolean Isprime(int n) {
        boolean Isprime = true;
        int c =2;
        while(n>0)
        {
            if(n<=1)
            {
                return false;
            }
            if(n%c==0)
            {
                return false;
            }
            return n%c==1;
        }
        return false;

    }
}
