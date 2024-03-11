public class PalindromeString {
    public static void main(String[] args) {
        String s = "malayalam";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && isPal(i, j, s)) {
                    System.out.print(s.substring(i, j + 1) + " ");
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


