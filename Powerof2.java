import java.util.*;
public class Powerof2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a&(a-1))==0)
        {
            System.out.println("power of two");
        }
        else{
            System.out.println("not a power of two");
        }
    }
    
}
