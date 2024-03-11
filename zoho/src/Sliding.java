public class Sliding {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;

        for(int i=0;i<a.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k && j<a.length;j++){
                if(a[j]>max) max=a[j];
            }
            System.out.print(max+ " ");
        }
    }
}
