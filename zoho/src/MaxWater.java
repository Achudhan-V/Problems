public class MaxWater {
    public static void main(String[] args) {
        int a[]={1,0,0,7,0,0,6};

        int ans=0;
        int lm=Integer.MIN_VALUE;
        int rm=Integer.MIN_VALUE;

        int i=0,j=a.length-1;

        while(i<j){
         if(a[i]<a[j]){
             if(a[i]>=lm){
                 lm=a[i];
             }
             else{
                 ans+=lm-a[i];
             }
             i++;
         }
        else{
             if(a[j]>=rm){
                 rm=a[j];
             }
             else{
                 ans+=rm-a[j];
             }
         j--;
         }

        }
        System.out.print(ans);
    }
}
