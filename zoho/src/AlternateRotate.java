public class AlternateRotate
{
    public static void main (String[]args)
    {
        int a[][]={
                {1,2,3,4,5},
                {16,17,18,19,6},
                {15,24,25,20,7},
                {14,23,22,21,8},
                {13,12,11,10,9},
        };
      //right rotate, left rotate alternatively

        int l=0,r=a[0].length-1,t=0,b=a[0].length-1;

        while (l<r && t<b){
            if(t%2==0){	//right side
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

            else{//left rotate
                int temp=a[t][l];
                for (int i=l; i<r; i++) {
                    a[t][i] = a[t][i+1];
                }

                t++;
                int temp1=a[b][l];

                for (int i=b; i>t; i--) {
                    a[i][l]=a[i - 1][l];
                }

                a[t][l]=temp;
                l++;
                int temp2=a[b][r];	//21

                for (int i=r;i>l; i--) {
                    a[b][i] = a[b][i-1];
                }

                a[b][l]=temp1;
                b--;

                for(int i=t-1;i<b; i++){
                    a[i][r] = a[i+1][r];
                }

                a[b][r]=temp2;
                r--;
            }
        }

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length;j++){
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println ();
        }
    }
}
