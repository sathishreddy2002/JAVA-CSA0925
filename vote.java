import java.util.*;

class Vote

{

public static void main(String arg[])

{

int age, years;

age=15;

if(age>=18)

{

System.out.println("Eligible for voting");

}

else

{

years=18-age;

System.out.println("Not Eligible for voting");

System.out.println("years are left to be eligible:"+years+"years");

}

}
}