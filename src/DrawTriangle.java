import java.util.Scanner;
/**
 * Program to draw a triangle of height defined by the user.
 * @author Peter Stribblehill
 * @version 11/10/2022
 */
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the height of your triangle");
        while (!scan.hasNextInt()){
            scan.next();
            System.out.println("Integers only. Please try again");
        }
        int height=scan.nextInt();
        System.out.println(height);

        String spaces=" ";
        String exes="X";

        for (int i=height; i>=0; i--){
            for (int j=1; j<=height+1; j+=2){
                System.out.print(spaces.repeat(i));
                System.out.print(exes.repeat(j)+"\n");
            }
        }
    }
}

