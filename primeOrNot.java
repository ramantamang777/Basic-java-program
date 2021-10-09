import java.util.Scanner;
public class primeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans=isprime(n);
        System.out.println(ans);
    }
    static boolean isprime(int n)
    {
        int c=2;
        boolean  isprime= false;
        while (n<=1)
        {
            if(n%c==0)
            return false;
        }
       if(n%c==1)
       {
           return true;
       }
       return false;
    }
}
