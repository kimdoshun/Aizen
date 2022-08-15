import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("s");
        int num=sc.nextInt();
        System.out.println("s");
        int n=sc.nextInt();
        System.out.println(a(num,n));
        System.out.println(b(num,n));
        
    }
    private static int a(int num,int n){
        return num%n==0?n:a(n,num%n);

    }
    private static int b(int num,int n){
        return num*n/a(num,n);
    }
    
}
