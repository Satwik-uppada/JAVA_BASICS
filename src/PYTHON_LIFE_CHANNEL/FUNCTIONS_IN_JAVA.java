package PYTHON_LIFE_CHANNEL;

public class FUNCTIONS_IN_JAVA {

    /*
    public//# modifier int// #return type  max// # method name (int x,int y)// # parameters
   {
    if(x>y)
    return;
          //body of the method
    else
    return y;
    }
     */

    //methods are used to code reuse-ability ,code length reduction.

static int printAdd(int x,int y){
    System.out.println("Sum of two numbers: "+(x+y));
    return x+y;
}
    public static void main(String[] args) {
    int a=10;
    int b=30;
    printAdd(a,b);
    }
}
