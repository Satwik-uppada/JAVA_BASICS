package PYTHON_LIFE_CHANNEL;

public class call_by_value {
    //call by value means if we change the values in copy, it doesn't change the values in original copy
int a;
int b;
//definition="args values passed and send to the parameters
private static void add(int s , int t)//parameters
{
    s=10;
    System.out.println("Result from method : "+(s+t));
}

    public static void main(String[] args) {
        call_by_value op=new call_by_value();
        op.a=2; op.b=3;
        System.out.println("before passing: "+(op.a+op.b));
        add(op.a,op.b);//args
        System.out.println("after passing: "+(op.a+op.b));
        ///it also takes a and b value only after assign 'a' as s in function
    }
}
