import java.util.*;
public class Multiplesof4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(((a)&3)==0)
            System.out.println("multiple of 4");
        else
            System.out.println("not a multiple of 4 ");

    }
    
}
