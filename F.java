public class F {
    public static void main(String[] args) {
        boolean[] flag=new boolean[2];
        int i=100;
        for(int k=168;k<100000;++k){
            for(;i<100000;++i){
                for(int j=0;j<i;++j){
                    if(j*j==i){
                        flag[0]=true;
                    }
                    for(int n=0;n<k;++n){
                        if(n*n==k){
                            flag[1]=true;
                        }
                    }
                }
                
            }
            if(flag[0]==true&&flag[1]==true){
                System.out.println(100-i);
                return;
            }
        }
        
        
    }
    
}
