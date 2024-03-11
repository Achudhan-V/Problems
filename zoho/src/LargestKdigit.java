public class LargestKdigit {
        public static void main (String[]args){
            int a[]={914,937,1,4,25}; //967 For k=3
            int k=3;
            int sum,max=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++){
                sum=0;
                for(int j=i;j<a.length;j++){
                    sum+=a[j];

                    if(sum>max && isKdigit(k,sum)){
                        max=sum;
                    }
                }
            }
            System.out.print(max);
        }
        static boolean isKdigit(int k,int sum) {
            int len = 0;
            while (sum != 0) {
                len++;
                sum /= 10;
            }
            return len == k;
        }
}
