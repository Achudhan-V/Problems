public class RotateMatrix {
    public static void main (String[]args){
        int a[][]={
// 	  {1,2,3,4,5,6},
// 	  {20,21,22,23,24,7},
// 	  {19,32,33,34,25,8},
// 	  {18,31,36,35,26,9},
// 	  {17,30,29,28,27,10},
// 	  {16,15,14,13,12,11}
                {1,2,3,4,5},
                {16,17,18,19,6},
                {15,24,25,20,7},
                {14,23,22,21,8},
                {13,12,11,10,9},
        };

        int l=0,r=a[0].length-1,t=0,b=a[0].length-1;
        int count=0;
        int times=5;
        while(count<times){

            while (l<r && t<b){

                int temp=a[t][r];

                for (int i=r;i>l;i--){
                    a[t][i] = a[t][i-1];
                }

                t++;
                int temp1=a[b][r];

                for (int i=b; i>t; i--){
                    a[i][r] = a[i-1][r];
                }

                a[t][r]=temp;
                r--;
                int temp2=a[b][l];
                //System.out.println(temp2+"##");

                for (int i=l;i<r; i++){
                    a[b][i] = a[b][i+1];
                }


                a[b][r]=temp1;
                b--;

                for (int i=t-1; i<b;i++){
                    a[i][l] = a[i+1][l];
                }

                a[b][l]=temp2;
                l++;
            }


            for(int i=((a.length%2 !=0)? a.length/2 : (a.length/2)-1 )  ;i>0 ;i--){
                a[i][i]= a[i-1][i-1];
            }
            a[0][0]=0;

            count++;
            l=0;r=a[0].length-1;t=0;b=a[0].length-1;
        }

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length;j++){
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }

}
