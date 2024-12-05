import java.util.*;
public class Multiples{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n&1)==0 && (n&3)==0 && (n&7)==0)
            System.out.println("multiple of 2,4,8");
        else
            System.out.println("not a multiple of 2,4,8");
    }
    
}
