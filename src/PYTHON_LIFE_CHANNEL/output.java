package PYTHON_LIFE_CHANNEL;
/*class X
{
    int a;
    double b;

}
class Y extends X{
    int c;
}*/

import java.util.Locale;
import java.lang.reflect.*;

public class output {
    public static void main(String[] args) {
        /*long start,end;
        start=System.currentTimeMillis();
        for(int i=0;i<10000000;i++);
        end=System.currentTimeMillis();
        System.out.print(end-start);*/

      /*  double x=3.14;
        int y=(int)Math.toRadians(x);
        System.out.print(y);*/

        /*Double i=new Double(275.5);
        Double x=i.MIN_VALUE;
        System.out.println(x);*/
     /*   X a=new X();
        Y b =new Y();
        Class obj;
        obj=b.getClass();
        System.out.println(obj.getSuperclass());*/

      /*  if(args.length>0){
            System.out.println(args.length);
        }*/
      //  Locale obj=new Locale("INDIA");
      //  System.out.println(obj.getCountry());

       /* try{
            System.out.print("Hello world");
        }
        finally{
            System.out.println("Finally executing");
        }
*/
        /*
        Double y=new Double(257.57812);
        Double i=new Double(257.578123456789);

        try{
            int x=i.compareTo(y);
            System.out.print(x);
        }
        catch(ClassCastException e){
            System.out.println("Exception");
        }*
        */
       /* int g=3;
        System.out.println(++g*8);*/

        try{
            Class c=Class.forName("java.awt.Dimension");
            Constructor constructors[]=c.getConstructors();
            for(int i=0;i<constructors.length;i++)
                System.out.println(constructors[i]);

        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }

    }
}