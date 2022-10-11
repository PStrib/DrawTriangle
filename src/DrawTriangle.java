import java.util.Scanner;
/**
 * Program to draw a triangle of height defined by the user.
 * @author Peter Stribblehill
 * @version 11/10/2022
 */
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (!scan.hasNextInt()){
            scan.next();
            System.out.println("Integers only. Please try again");
        }
        int height=scan.nextInt();
    }
}