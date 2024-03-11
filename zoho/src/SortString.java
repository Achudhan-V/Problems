
public class SortString
{
    public static void main(String[] args) {
        String s="thi0s is3 s2ample 1test";

        String a[]=s.split("\\s+");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(num(a[i]) > num(a[j])){
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length();j++){
                if(!(a[i].charAt(j) >='0' && a[i].charAt(j) <= '9')){
                    System.out.print(a[i].charAt(j));
                }
            }
            System.out.print(" ");
        }
    }
    static int num(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >='0' && s.charAt(i) <= '9'){
                return (int)(s.charAt(i) - '0');
            }
        }
        return 0;
    }
}

/*
public class SortString
{
    public static void main(String[] args) {
        String s="thi0s is3 s2ample 1test";

        String a[]=new String[s.length()];
        int k=0,strt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                a[k++]= s.substring(strt,i);
                strt=i+1;
            }
        }
        a[k++]=s.substring(strt,s.length());
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(num(a[i]) > num(a[j])){
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0;i<k;i++){
            for(int j=0;j<a[i].length();j++){
                if(!(a[i].charAt(j) >='0' && a[i].charAt(j) <= '9')){
                    System.out.print(a[i].charAt(j));
                }
            }
            System.out.print(" ");
        }
    }
    static int num(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >='0' && s.charAt(i) <= '9'){
                return (int)(s.charAt(i) - '0');
            }
        }
        return 0;
    }
}
*/

/*

public class SortString
{
    public static void main(String[] args) {
        String s="thi0s is3 s2ample 1test";

        String a[]=new String[s.length()];
        int k=0,strt=0,i=0,number=0; String x="";
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || i==s.length()-1){
                x="";
                number=0;
                for(int p=strt;p<(i!=s.length()-1  ? i : s.length());p++){
                    if(s.charAt(p)>='0' && s.charAt(p)<='9'){
                        number=(int)(s.charAt(p)-'0');
                    }
                    else x+=s.charAt(p);
                }
                a[number]=x;
                strt=i+1;
            }
        }

        for(i=0;i<a.length;i++){
            if(a[i]!=null)
                System.out.print(a[i]+" ");
        }
    }
}
*/
