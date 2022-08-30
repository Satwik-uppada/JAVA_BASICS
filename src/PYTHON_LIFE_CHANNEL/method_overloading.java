package PYTHON_LIFE_CHANNEL;

public class method_overloading {
    static int addition(int a ,int b){
      return a+b;

 }
    static int addition(int a ,int b,int c){
        return a+b+c;

    }
    static double addition(double  a ,double b,int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        System.out.println(addition(12,13,15));
        System.out.println(addition(12,13));
        System.out.println(addition(12.5,13.5,15));
    }
}
