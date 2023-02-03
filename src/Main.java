import java.util.Scanner;

public class Main {
    static double length;
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("..............................................");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter x1");
        double x1 = sc.nextDouble();
        System.out.println("Please Enter y1");
        double y1 =sc.nextDouble();
        System.out.println("Please Enter x2");
        double x2 =sc.nextDouble();
        System.out.println("Please Enter y2");
        double y2 =sc.nextDouble();

        length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Length="+length);



    }
}