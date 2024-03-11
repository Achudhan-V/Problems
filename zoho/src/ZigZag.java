/*      1   3   4  10  11
        2   5   9  12  19
        6   8  13  18  20
        7  14  17  21  24
        15  16  22  23  25*/
public class ZigZag
{
    public static void main(String[] args){
        int n=5,num=1,x,flag,strt=1,inc=1;
        int num_=1,x_,flag_,strt_=1,inc_=2;
        for(int i=0;i<n;i++){

            //upward
            num=strt;
            x=i+2;
            if(i==n-1) x=n;
            flag=0;

            //downward
            num_=strt_;
            x_=i+1;
            if(i==n-1) x_=n-1;
            flag_=0;

            for(int j=0;j<n;j++){
                if(i%2==0 && (j%2)!=0){
                    System.out.printf("%3d ",num);
                }
                else if((i%2)!=0 && j%2==0){
                    System.out.printf("%3d ",num);
                }
                else if(i==j){
                    System.out.printf("%3d ",num);
                }
                else{
                    System.out.printf("%3d ",num_);

                }
               //upward
                num+=x;
                if(flag==1) x--;
                else x++;

                if(i==n-1 && flag==0){ //last row
                    x-=2;
                    flag=1;
                }
                else if(x>n){
                    x--;
                    flag=1;
                }

                // downward
                num_+=x_;
                if(flag_==1) x_--;
                else x_++;

                if(i==n-1 && flag_==0){ //last row
                    x_-=2;
                    flag_=1;
                }
                else if(x_>n-1){
                    x_--;
                    flag_=1;
                }
            }
            System.out.println();

            strt+=inc;
            inc++;

            strt_+=inc_;
            inc_++;
        }
    }
}
