import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("s");
        int n=sc.nextInt();
        System.out.println("s");
        int m=sc.nextInt();
        int res=helper(n,m);
        System.out.println(res);
        
    }
    private static int helper(int n,int m){
        int res=0;
        for(int i=0;i<m;++i){
            res+=n*10*i+n;

        }
        return res;
    }
    
}
