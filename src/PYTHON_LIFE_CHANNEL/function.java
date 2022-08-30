package PYTHON_LIFE_CHANNEL;

import java.util.Scanner;

public class function {
    int i;
    int s;
    static void min(int a,int b)//parameters (formal parameters)
    {
        if(a>b){
            System.out.println(+a+" is max");
        }
        else
        {
            System.out.println(+b+" is max");
        }
    }

    public static void main(String[] args) {
        function mini =new function();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        min(c,d);//arguments(actual parameters)
    }
}
