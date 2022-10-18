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

        // This nest does the right number of exes but not the right number of spaces
/*        for (int i=height; i>=0; i--){
            for (int j=1; j<=height+2; j+=2){
                System.out.print(spaces.repeat(i));
                System.out.print(exes.repeat(j)+"\n");
            }
        }*/

        // This nest makes very pretty italic ascii art.
/*        for (int j=1; j<=height; j+=2){
            for (int i=height; i>=0; i--){
                System.out.print(spaces.repeat(i));
                System.out.print(exes.repeat(j)+"\n");
            }
        }*/

        int i=height;
        int j=1;
        while (i>=0){
            System.out.print(spaces.repeat(i));
            System.out.print(exes.repeat(j)+"\n");
            i--;
            j+=2;
        }
    }
}

