package PYTHON_LIFE_CHANNEL;

public class different_type_of_variables {

   void printName(){
    String a="sathvi";//local variable
    System.out.println("my name is "+a+".");


}
//for these variable declaration access specifiers(public,protected,private) is optional .
    int I=10;//instance variable
    static int s=20;//static variable//initialization is not mandatory
    // because it has a default value of null

    public static void main(String[] args) {
          different_type_of_variables obj=new different_type_of_variables();
          different_type_of_variables f1=new different_type_of_variables();
         obj.printName();//method calling ==mem allocates

        System.out.println(" "+f1.I);
        System.out.println(" "+s);//object creation is not necessary for static variable
//WE CAN USE STATIC VARIABLE AS BY USING DIRECTLY AND WITH CLASS NAME AND WITH OBJECT NAME
        System.out.println(" "+s);//directly
        System.out.println(" "+different_type_of_variables.s);//with class name
        System.out.println(" "+f1.s);//with object name


        //# DIFFERANCE BETWEEN INSTANCE NAD STATIC VARIABLE
        f1.I=100; f1.s=200;
        System.out.println(" "+f1.I);
        System.out.println(" "+f1.s);//200
        System.out.println("----------");
        System.out.println(" "+obj.I);
        System.out.println(" "+obj.s);//200
        //in this we only initialize f1.s and f1.I but f1.s and obj.s also
        // prints same value because it is a static variable
        // this is the difference between static and instance variable
        // static variable takes same value for n no.of objects also
    }
}
