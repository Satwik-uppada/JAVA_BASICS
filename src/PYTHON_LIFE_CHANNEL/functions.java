package PYTHON_LIFE_CHANNEL;
//methods

// methods are two types:
/*

1.Instance method(non-static):-- used to implement behaviours of each instance of class
syntax:-
void print(){
//method body
}

2.Static Method(class method):-- implements the behaviour of the class

syntax:-
static void print()
{
//method body
}*/

public class functions {
    static  int multiple(int a)
    //if u use static we don't need to create object
    {
        System.out.println(5*a);
        return 5*a;
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            multiple(i);
        }
    }
}


