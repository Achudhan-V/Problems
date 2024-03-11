public class Wall {
    public static void main(String[] args) {
        int a[]={10,9,5,8,6,11,8};
        System.out.print(0+" ");
        for(int i=1;i<a.length;i++){
            int count=1;
            for(int j=i-1;j>=0;j--){
                if(a[j]<a[i] && j!=0) count++;
                else break;
            }
            System.out.print(count+ " ");
        }

  //--------------------------------//

        System.out.println();
        System.out.print(0+" ");
        int max=a[0] , st=0;
        for(int i=1;i<a.length;i++){
            if(a[i-1] > a[i]){
                System.out.print(1+" ");
            }
            else if(a[i-1]<a[i] && a[i]<max){
              System.out.print((i-st)+" ");
            }
            else{
                System.out.print((i)+" ");
            }

            if(a[i]>max){
                  max=a[i];
                  st=i;
            }
        }
    }
}

