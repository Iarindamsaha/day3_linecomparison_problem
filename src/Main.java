import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("..............................................");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter x1");
        int x1 = sc.nextInt();
        System.out.println("Please Enter y1");
        int y1 =sc.nextInt();
        System.out.println("Please Enter x2");
        int x2 =sc.nextInt();
        System.out.println("Please Enter y2");
        int y2 =sc.nextInt();



        Double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Length="+length);


        System.out.println("Please Enter x3");
        int x3 = sc.nextInt();
        System.out.println("Please Enter y3");
        int y3 =sc.nextInt();
        System.out.println("Please Enter x4");
        int x4 =sc.nextInt();
        System.out.println("Please Enter y4");
        int y4 =sc.nextInt();

        Double length2=Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
        System.out.println("Length="+length);

        boolean res = length2.equals(length);

        if ( res == true ) {
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }
        sc.close();
    }
}