import java.util.Scanner;
public class secondfunction {
    public static void main(String[] args) {
        String ans=sum();
        //int ans= sum();
        System.out.println(ans +" ");
    }
    static String sum()
    {
        Scanner in= new Scanner(System.in);

        //int a=in.next();

        String a=in.next();

        //int b=in.next();

        String b=in.next();

        String sum=a+b;

        return sum;
    }
}
