
import java.util.Scanner;
//import java.util.
public class circumference_And_area_of_the_circle {
    public static void main(String[] args) {
        cir_areaOfTheCircle(8);
    }

    static void cir_areaOfTheCircle(int a)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        int r = in.nextInt();
        int area=0;
        int circum = 0;
        area = (int) Math.PI*r*r;
        circum = (int) (2*Math.PI*r*r);
        System.out.println("Area of the circle is: "+area);
        System.out.println("circumference of the circle is: "+ circum);
    }
}
