import java.time.Duration;
import java.time.Instant;

public class Queen{
    public static void main(String[] args){

        int n=4;
        boolean[][] b=new boolean[n][n];

        //Instant start= Instant.now();

        int count=0,max=Integer.MIN_VALUE;
        int[][] arr=new int[n][n];
        int x=0,y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b=new boolean[n][n];
                count=queen(b,i,j,n,1,arr);

                if(count>max){
                    max=count;
                    x=i; y=j;
                }
               // System.out.println();
            }
        }
        System.out.println(max);

//System.out.print(x+","+y);
arr=new int[n][n];
b=new boolean[n][n];

max=queen(b,x,y,n,1,arr);    //8-5,0

for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
      //Instant end= Instant.now();
      //System.out.println("  time : "+ (Duration.between(start,end).toMillis())+"ms");

    }

    static int queen(boolean[][] b ,int i, int j , int n, int count , int[][] arr){


        b[i][j]=true;
        // System.out.print("("+i+","+j+")");
        arr[i][j]=1;

        for(int k=0;k<n;k++) {
            b[i][k]= true;
            b[k][j]= true;
            if(i-k>=0 && j-k>=0) b[i-k][j-k]=true;
            if (i+k<n && j+k < n) b[i+k][j+k]=true;
            if (i+k<n && j-k >= 0) b[i+k][j-k]=true;
            if (i-k>=0 && j+k < n) b[i-k][j+k]=true;
        }


        for(int m=0;m<i;m++){
            for(int k=0; k<n; k++) {
                if (!b[m][k]) {
                    count=queen(b,m,k,n,count+1,arr);
                }
            }
        }


        for(int m=i+1;m<n;m++){
            for(int k=0; k<n; k++) {
                if (!b[i+1][k]) {
                    count=queen(b,m,k,n,count+1,arr);
                }
            }
        }
        return count;
    }
}
