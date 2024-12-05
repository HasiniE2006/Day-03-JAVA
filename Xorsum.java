import java.util.*;
class Xorsum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=100;i++)
        {
        int b=(int)Math.pow(a,i);
         if((b&(b-1))==0)
         {
            System.out.println("equal");
         }
         else
         {
            System.out.println("not equal");
         }
        }
    
    }
}