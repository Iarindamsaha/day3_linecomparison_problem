import java.util.Scanner;

public class Main {

    public void equalChecking(Double firstLine, Double secondLine){

        if ( firstLine.equals(secondLine)){
            System.out.println("Both Lines Are Equal");
        }
        else {
            System.out.println("Both Lines Are Not Equal");
        }

    }

    public void lineCompare(Double firstLine, Double secondLine){

        int check = firstLine.compareTo(secondLine);

        if(check < 0){
            System.out.println(secondLine + " is greater than " + firstLine);
        } else if (check == 0) {
            System.out.println(secondLine + " is equal with " + firstLine);
        }
        else{
            System.out.println(secondLine + " is less than " + firstLine);
        }

    }

    public static double length (int x1, int y1 , int x2, int y2){

        return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));

    }


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


        Double firstLine = length(x1,y1,x2,y2);
        System.out.println("Length of First Line = "+firstLine);


        System.out.println("Please Enter x3");
        int x3 = sc.nextInt();
        System.out.println("Please Enter y3");
        int y3 =sc.nextInt();
        System.out.println("Please Enter x4");
        int x4 =sc.nextInt();
        System.out.println("Please Enter y4");
        int y4 =sc.nextInt();

        Double secondLine = length(x3,y3,x4,y4);
        System.out.println("Length of Second Line = "+secondLine);

        Main obj = new Main();
        obj.equalChecking ( firstLine , secondLine );
        obj.lineCompare ( firstLine , secondLine );

        sc.close();
    }
}