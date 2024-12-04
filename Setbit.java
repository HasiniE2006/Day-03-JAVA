import java.util.*;
public class Setbit {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int pos=sc.nextInt();
    if(((a&1)<<pos)!=0)
    System.out.println("set bit");
    else
    System.out.println("not a set bit");
}
}
