import java.util.*;
class assign{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value");
        int a=s.nextInt();
        System.out.println("assign addition"+(a+=29));
        System.out.println("assign subtrsction"+(a-=2));
        System.out.println("assign multiplication"+(a*=3));
        System.out.println("assign division"+(a%=7));

    }
}