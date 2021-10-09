public class Max_min {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);

        System.out.println(maxcheck(19,10,7));

    }
    static boolean maxcheck(int a, int b, int c)
    {
        if ((a > b) && (a > c)) {
            System.out.println(" number A is the greatest..");
        } else {
            if((b>a) && (b>c))
            {
                System.out.println("Number B is the greatest..");
            }
            else
            {
                System.out.println("Number c is the greatest..");
            }
        }
        return true;
    }
}
