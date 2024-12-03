import java.util.*;
class swap{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int g=s.nextInt();
        int c=b;
        b=g;
        g=c;
        String reg=String.format("after swapping \n boys=%d \n girls=%d",b,g);
    System.out.println(reg);
    }
}