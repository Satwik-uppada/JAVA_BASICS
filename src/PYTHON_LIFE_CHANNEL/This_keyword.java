package PYTHON_LIFE_CHANNEL;
/*
this is a reference variable that refers to the current object.
 */


public class This_keyword {
    String n;

    This_keyword(String n){

       this.n/* instance variable */=n;/*local variable *///only refer instance variable

    }


    void display(){
        System.out.println("this keyword is used to invoke current class method(implicitly)");
        this.display1();
        System.out.println("..............................................................");
        System.out.println("we can call it without this keyword also\n" +
                "by default computer takes this keyword\n");
        display1();
        System.out.println("..............................................................");
        System.out.println("i'm studying b.tech cse: "+n);
    }


    void display1()
    {
        System.out.println("hi");
    }



    This_keyword(){

        System.out.println("hi this is no argument method");
        System.out.println("...............................................................");
    }

    This_keyword(int x)
    {
        this();
        System.out.println("this keyword is used to invoke current constructor");
        System.out.println(x);
        System.out.println(".................................................................");
    }

    void m(This_keyword obj){
        System.out.println("HERE THIS CAN BE PASSED AS AN ARGUMENT IN THE METHOD CALL");
        System.out.println("invoked");
        System.out.println("...................................................................");
    }
    void s()//METHOD
     {
        m(this);
    }

    public static void main(String[] args)
    {
        This_keyword t=new This_keyword("satwik");
        t.display();
        This_keyword t1=new This_keyword(45);
        This_keyword t2=new This_keyword();
        t2.s();

    }

}
