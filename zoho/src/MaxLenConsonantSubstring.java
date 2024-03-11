public class MaxLenConsonantSubstring
{
    public static void main(String[] args) {
        String s="achudffhan";
        int count=0,maxlen=0, st=-1,en=-1,  maxi=0,maxj=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){

                en=i;
                if(st==-1) st=i;

                if(en-st-1 > maxlen){
                    maxlen= en-st-1;
                    maxi=st+1;
                    maxj=en;
                }
                st=en;
            }
        }
        System.out.print(s.substring(maxi,maxj));
    }
    static boolean isVowel(char c){
        return c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' ||c=='o' || c=='O' || c=='u' || c=='U';
    }
}