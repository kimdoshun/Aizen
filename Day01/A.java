import java.util.Scanner;

public class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num=sc.nextInt();
        int n=2;
        System.out.print(num+"=");
        print(num,n);
        
       
        
    }
    private static void print(int num,int n){
        if(n>=num||n==0) {
            System.out.println(n);
            return;
        }
        
        n=2;
        
        while(num%n!=0){
            ++n;
        }
        num/=n;
        System.out.print(n+"*");
        print(num,n);
        
    }
}