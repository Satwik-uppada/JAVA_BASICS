package PYTHON_LIFE_CHANNEL;

import java.util.Scanner;

public class Strings_in_java {
    public static void main(String[] args) {
       /* String s;
        System.out.println("Enter any sentence: ");
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any sentence: ");
        int n=scan.nextInt();
          s=scan.nextLine();

        System.out.println(n);
        System.out.println(s);
*/

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); //Taking the number of testcases
        while(t-->0) {
            int a;
            String x;
            a = sc.nextInt();
           // sc.nextLine();

            x = sc.nextLine();

            //Your code here

            System.out.println(a);
            System.out.println(x);
        }
    }
}
