import java.util.Scanner;
public class Vote_orNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(vote(a));
    }
    static int vote(int x)
    {
        if(x<=18)
        {
            System.out.println("Not Ready to vote...");
        }
        else
        {
            System.out.println("Ready to give his/her first vote..");
        }
        return x;
    }
}
