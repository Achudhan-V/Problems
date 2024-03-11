
public class PatternMatch {
    public static void main(String[] args) {
        String a="5x+2c+3x=0";
        String b="5y+2a+4y=0";

//        a="xbyx";
//        b="acca";
        if(a.length()!=b.length()) return;

        boolean flag=true;
        boolean[] k=new boolean[a.length()];

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='0' && a.charAt(i)<='9'){
                if(a.charAt(i)!=b.charAt(i)){
                    flag=false;
                    break;
                }
            }
            char x=b.charAt(i); //y

            for(int j=i+1;j<a.length();j++){

                if(a.charAt(j)==a.charAt(i) && !k[j]){
                    if(x!=b.charAt(j)){
                        flag=false;
                        break;
                    }
                    k[j]=true;
                }
            }
        }

        if(flag) System.out.print("yes");
        else System.out.print("no");
    }
}
