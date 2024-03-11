public class CountOccurence {
        public static void main(String[] args) {
            int a[]={1,2,-1,4,-1,2,3,4,5};
            int hash[]=new int[getMax(a)];
            int negHash[]=new int[getMin(a)];
            for(int i=0;i<a.length;i++){
                if(a[i]>0) hash[a[i]]++;
                else if(a[i]<0) negHash[(a[i] * -1)]++;
            }

            for(int i=0;i<a.length;i++){
                if(a[i]>0 && hash[a[i]]>1){
                    System.out.println(a[i]+"-->"+hash[a[i]]);
                    hash[a[i]]=0;
                }
                else if(a[i]<0 && negHash[a[i]* -1] > 1){
                    System.out.println(a[i]+"-->"+negHash[a[i]* -1]);
                    negHash[a[i]* -1]=0;
                }
            }

        }
        static int getMax(int[] a){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++){
                if(a[i]>max) max=a[i];
            }
            return max+1;
        }

        static int getMin(int[] a){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++){
                if(a[i]<min) min=a[i];
            }
            return (min* -1) +1;
        }

}
/*

public class Main{
    public static void main (String[]args){
        int a[]={1,2,-1,4,-1,2,3,-1,4,5};
        boolean b[]=new boolean[a.length];
        int count;
        for(int i=0;i<a.length;i++){
            count=1;
            b[i]=true;
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j] && !b[j]){
                    count++;
                    b[j]=true;
                }
            }
            if(count>1){
                System.out.println(a[i]+"-->"+count);
            }
        }
    }
}*/
