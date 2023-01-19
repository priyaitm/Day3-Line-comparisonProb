package java_program;
import java.util.Scanner;
public class LineComparisonDay3Prob {public static void main(String[] args ) {
    System.out.println("Welcome to line Comparison");
    Scanner sc = new Scanner(System.in);
// calculate length of line
    System.out.println("Enter first line co-ordinate, first point (x1 y1) and End point (x2 y2) :");
    int x1 = sc.nextInt();         //3
    int y1 = sc.nextInt();         //5
    int x2 = sc.nextInt();         //9
    int y2 = sc.nextInt();         //10
    Float l1=(float)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.println(" length of first line:" + l1);
    System.out.println("Enter second line co-ordinate, first point (X3,y3) and end point(x4,y4):");
    int x3=sc.nextInt();           //10
    int y3=sc.nextInt();           //9
    int x4=sc.nextInt();            //5
    int y4=sc.nextInt();            //3
    Float l2= (float)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3) );
    System.out.println("length of second line:" +l2);
}
}
