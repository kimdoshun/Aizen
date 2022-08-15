import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("s");
        String s=sc.nextLine();
        for(int i=0;i<4;++i){
            System.out.println(count(s)[i]);
        }
        
    }
    
    private static int[] count(String s){
        int i=0;
        int ce=0;
        int cb=0;
        int cn=0;
        int a=0;
        while(s.charAt(i)!='\n'){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                ++ce;

            }else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                ++cn;
            }else if(s.charAt(i)==' '){
                ++cb;
            }else{
                ++a;
            }
            ++i;

        }
        int[] arr=new int[]{ce,cn,cb,a};
        return arr;
    }
    
}
