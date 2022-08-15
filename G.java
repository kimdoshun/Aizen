import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1");
        int x=sc.nextInt();
        System.out.println("2");
        int y=sc.nextInt();
        System.out.println("3");
        int z=sc.nextInt();
        if(x<y){
            
            
            if(y<z){
                System.out.println(x+y+z);
                
            }else{
                if(x<z){
                    System.out.println(x+z+y);
                }else{
                    System.out.println(z+x+y);
                }
            }

        }else{
            if(x>z){
                if(z>y){
                    System.out.println(y+z+x);
                }else{
                System.out.println(y+x+z);
            }
        }else{
            System.out.println(z+y+x);

            }
        }
        
    }
    
}
