public class CtrlF {
    public static void main(String[] args) {
        String s = "Given paragraph seseaarch substrseaingsea";
        String x = "sea";
        int j = 0, k = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.length()-i < x.length()) break;
            if (s.charAt(i) == x.charAt(0)) {
                int strt = i;
                k = i;
                while (k < s.length() && j < x.length()) {
                    if (s.charAt(k) == x.charAt(j)) {
                        k++;
                        j++;
                    }

                    if (j == x.length()) {
                        System.out.println(strt + " --> " + (k - 1));
                        j = 0;
                        break;
                    } else if (j >= 0 && j < x.length() && s.charAt(k) != x.charAt(j)) {
                        j = 0;
                        break;
                    }
                }
            }
        }
    }
}