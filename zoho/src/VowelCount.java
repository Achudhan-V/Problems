
public class VowelCount
{
    public static void main(String[] args) {
        String s="apaple";
        int count=0;
        boolean b[]=new boolean[s.length()];

        for(int i=0;i<s.length();i++){
            count=1;
            if(!isVowel(s.charAt(i)) || b[i]) continue;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && !b[j] && isVowel(s.charAt(j))){
                    b[j]=true;
                    count++;
                }
            }
            if(count>0){
                System.out.println(s.charAt(i)+"-->"+count);
            }
        }
    }
    static boolean isVowel(char c){
        return c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' ||c=='o' || c=='O' || c=='u' || c=='U';
    }
}