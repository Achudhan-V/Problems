public class Palindrome {
    public static void main(String args[]){
        String s="welcome madam  to zoho malayalam corproc";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' ') continue;

            for(int j=i;j<s.length();j++){
                if(s.charAt(j)==' ') break;

                if(j-i!=0 && s.charAt(i)==s.charAt(j) && isPal(i,j,s)){
                    System.out.print(s.substring(i,j+1)+" ");
                }
            }
        }
    }
    static boolean isPal(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}