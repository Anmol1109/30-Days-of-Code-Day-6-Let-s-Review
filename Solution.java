import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            char inputString[] = sc.next().toCharArray();
            for(int j = 0;j < inputString.length;j += 2)
                System.out.print(inputString[j]);
            System.out.print(" ");
            for(int j = 1;j < inputString.length;j += 2)
                System.out.print(inputString[j]);
            System.out.println();
            }
    }
}
