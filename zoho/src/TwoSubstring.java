public class TwoSubstring {
    public static void main(String[] args) {
        String a="azbxy";
        String b="azxyz";
        a="abggbya";
        b="abzya";
        char x='a'; int k=0;
        boolean charFlag=false,f;
        for(int i=0;i<a.length();i++){
                f=false;
                if(k<b.length() && a.charAt(i)==b.charAt(k)){
                    System.out.print(a.charAt(i));
                    k++;
                    f=true;
                    x=a.charAt(i);
                    charFlag=true;
                }
                else{
                   // System.out.println("here"+k+" / "+i);
                    while(charFlag && k+1<b.length() && b.charAt(k+1)!=x){
                        System.out.print(b.charAt(k++));
                    }
                }

            //   if((k-1>=0 && b.charAt(k-1)!=a.charAt(i))) continue;
               if(!f) System.out.print(a.charAt(i));
  }

    }
}


/*
      String com="",ans="";
        boolean flag=false;
        int count,strt=-1,end=-1,strt1=-1,end1=-1,i,j;

        for (i=0;i<str1.length();i++) {
            for (j=0;j<str2.length();j++) {
                count=0;
                int k=i,r=j;
                while(k<str1.length() && r<str2.length() && str1.charAt(k)==str2.charAt(r)){
                    count++;
                    k++;
                    r++;
                }
                if (count>1) {
                    com=str1.substring(i,k);
                    strt=i; end=k-1;

                    strt1=j ; end1=r-1;
                    flag=true;
                    break;
                }
            }
            if(flag) break;
        }
   //System.out.print(com);
        if(strt==-1 || end==-1){
         System.out.print(str1+str2);
         return;
        }

        ans+=str1.substring(0,strt);
        //System.out.print(ans);
        j=0;
        while(j<strt1) {
            flag=true;
            for(i=0;i<strt;i++){
                if(str2.charAt(j)==str1.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag) ans+=str2.charAt(j);
            j++;
        }

        ans+=com;


        ans+=str2.substring(end1+1);

        j=end+1;
        while(j<str1.length()) {   //6 7 8
            flag=true;
            for(i=end1+1;i<str2.length();i++){
                if(str1.charAt(j)==str2.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag) ans+=str1.charAt(j);
            j++;
        }
        System.out.print(ans);*/
