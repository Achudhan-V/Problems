public class CommonPrefix {
    public static void main(String[] args) {
        String[] strings={"zoho" , "zohm"  , "zohu"};
        String ans="";
        int k=0;
        boolean flag;

        while(k<strings[0].length()){
            flag=true;
            char ch=strings[0].charAt(k);
            for(int i = 1; i < strings.length; i++) {
                if (strings[i].charAt(k)!=ch || k >= strings[i].length()) {
                    flag = false;
                    break;
                }
            }

            if(!flag) break;
            else ans+=ch;

            k++;
        }
        System.out.println(ans);
    }
}