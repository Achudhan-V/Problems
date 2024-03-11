import java.util.*;
class ReverseSpecial {
    public static void main(String args[]) {
        String a="welcome! zoho# corpo@ration";
        int i=0, j=a.length()-1;
        while (j>=0 && i<a.length()) {
            if(!isAlpha(a.charAt(i))){
                System.out.print(a.charAt(i));
                i++;
                continue;
            }
            if(!isAlpha(a.charAt(j))) {
                j--;
                continue;
            }
            System.out.print(a.charAt(j));
            j--;
            i++;
        }
    }
    public static boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

}