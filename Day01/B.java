import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩");
        int num=sc.nextInt();
        if(num<60){
            System.out.println("C");
        }else if(num<90){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
        
    }
    
}
