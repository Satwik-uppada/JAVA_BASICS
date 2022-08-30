package PYTHON_LIFE_CHANNEL;

public class constructors {
    int a;
    String b;
    constructors(int c,String d)//parameterized constructor
    {
       a=c;
       b=d;

    }
    constructors()//default constructor
    {
        a=50;
        b="pardhi";
    }
    public static void main(String[] args) {
        constructors c=new constructors(45,"satwik");
        //creating  parameterized constructor
        constructors c2=new constructors();
        //default constructor
        System.out.println("print :"+c.a+" "+c.b);
        System.out.println("print :"+c2.a+" "+c2.b);

        /*
constructors are two types: -

Default constructor:-
(no-argument constructor)
syntax:-
<class_name>()
{
.....
}

parameterized constructor: -
(argument constructor)
person(String name,int age)
{
//constructor code.
}


 */
    }
}
