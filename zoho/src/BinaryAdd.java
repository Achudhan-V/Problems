public class BinaryAdd {
    public static void main(String[] args) {


       /* String n="3245440";
        int len=n.length()-1;

        int[] a=new int[(int)Math.pow(2,n.length()-1)];

        nums(a,n.length());

        int num=Integer.parseInt(n);

        int ans=0;
        while(ans<=num){

            for(int i=a.length-1;i>=0;i--){
                while(ans<=num){
                    if(ans+a[i] <= num) {
                        ans+=a[i];
                        System.out.print(a[i] + " ");
                    }
                    else break;
                }
            }
            if(ans==num) break;
            else{
                len--;
                a=new int[(int)Math.pow(2,len)];
                nums(a,len+1);
            }
        }

    }

    static void nums(int[] a,int l){
        int st=(int)Math.pow(10,l-1);

        String x="";
        int k=1;
        for(int i=0;i<l;i++) x+="1";

        int end=Integer.parseInt(x);

        a[0]=st;
        a[a.length-1]=end;

       while(st<=end){
           st++;
           if(contains(st)) a[k++]=st;
       }
    }
    static boolean contains(int n){
        String x=n+"";
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)>'1'){
                return false;
            }
        }
        return true;
    }*/
        int n=321;
        while(n!=0){
            int temp=n, ans=0,p=1;
            while(temp!=0){
                int rem=temp%10;
                temp=temp/10;

                if(rem!=0) ans+=p;

                p*=10;
           }
          System.out.print(ans+" ");
          n-=ans;
        }
    }
}

