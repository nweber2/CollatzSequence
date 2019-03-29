/*
 * Nicholas Weber
 *takes positive integer from user
 *prints that integer in the collatz sequence
 *10 elements per line 
 */
package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollatzSequence {
    public static ArrayList m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The positive integer? ");
        int n = scanner.nextInt();
        m = new ArrayList<Integer>();
        m.add(n);
        evenOrOdd(n);
        printTen(m);
        System.out.println("");
    }
    //tests the integer if it is even or odd than follows the Collatz Sequence 
    private static void evenOrOdd(int n) {
        while ( n != 1 ) {
            if ( n % 2 == 0 ) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            m.add(n);
        }
    }
    //adds the integer to arraylist than prints the sequence 10 per line 
    private static void printTen(ArrayList<Integer> m) {
        int counter = 0;
        for ( int i : m ){
            System.out.print(i + " ");
            counter++;
            if( counter >= 10 ){
                System.out.println();
                counter = 0;
            }
        }
    }
}
