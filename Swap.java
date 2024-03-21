import java.util.*;
class Swap
{
public static void main(String[] args)
{
 float first=2.67f, second = 5.67f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);


        float temporary = first;

        
        first = second;


        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}