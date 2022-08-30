package PYTHON_LIFE_CHANNEL;

import com.sun.jdi.event.StepEvent;

public class applying_class_and_objects {
    /*
    class contains
     fields
     constructors
     blocks
     nested class
     interference

     */
    static int wheels=2;
    String color="";//instance variable:-if differ from obj to obj

    static  void braking()//we use static for ...it is common for all bikes
    {
        System.out.println("bike halts when brake apply");
    }
    void mileage(int m){
        System.out.println("mileage is "+m+"kmph");
    }
    public static void main(String[] args) {
        applying_class_and_objects obj1=new applying_class_and_objects();
        applying_class_and_objects obj2=new applying_class_and_objects();
        applying_class_and_objects obj3=new applying_class_and_objects();

        obj1.color="black";
        obj2.color="blue";
        obj3.color="orange";

        System.out.println(" "+obj1.wheels);

        System.out.println(""+obj1.color);

        obj1.braking();//method calling

        obj1.mileage(40);



        System.out.println(" "+obj2.wheels);

        System.out.println(""+obj2.color);

        obj2.braking();

        obj1.mileage(35);


        System.out.println(" "+obj3.wheels);

        System.out.println(""+obj3.color);

        obj2.braking();

        obj1.mileage(25);










    }
}
