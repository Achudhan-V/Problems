public class Anagram
{
    public static void main(String[] args) {
        String a="race";
        String b="care";
        boolean x[]=new boolean[b.length()];
        int c=0;

        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j) && !x[j]){
                    x[j]=true;
                    c++;
                    break;
                }
            }
        }
        if(c==b.length()){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}