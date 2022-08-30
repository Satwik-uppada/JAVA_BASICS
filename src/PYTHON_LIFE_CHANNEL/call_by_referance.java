package PYTHON_LIFE_CHANNEL;

public class call_by_referance {
    int a;
    int b;
    private static void add(call_by_referance op,call_by_referance op1){
       op.a=10;
        System.out.println("Result in method: "+(op.a+op.b));
    }

    public static void main(String[] args) {
        call_by_referance op=new call_by_referance();
        call_by_referance op1=new call_by_referance();
        op.a=2;op.b=3;
        System.out.println("before passing: "+(op.a+op.b));
        add(op,op);//call method
        System.out.println("After passing: "+(op.a+op.b));
    }
}
