/*
Program to ask the user to enter 2 integers a and b and output a^b (i.e. pow(a,b)) in O(lg n) time complexity.
*/

import java.util.Scanner;

public class Exponent {

    public static void main(String[] args){

        System.out.println("Enter first integer: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter second integer: ");
        //Scanner a2 = new Scanner(System.in);
        int y = sc.nextInt();
        sc.nextLine();

        int result = power(x,y);
        System.out.println(x + "^"+ y + " is: " + result);
        sc.close();
    }

    //function to return x power of y in O(log N) time complexity
    public static int power(int x, int y){
        //power division
        int temp = (int) Math.pow(x, y / 2);
        if(y == 0){
            return 1;
        }
        else{
            if(y % 2 == 0){
                return temp * temp;
            }
            else{
                return x * temp * temp;
            }
        }
    }

}
