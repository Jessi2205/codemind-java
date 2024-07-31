import java.util.Scanner;
public class loop{
    public static void main(String[] args){
        int a,res;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        res=a*(a+1)/2;
        System.out.println(res);
    }
}