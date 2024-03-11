
public class CharCount
{
    public static void main(String[] args) {
        String s="hell!!o w$elc^ome";
        boolean b[]=new boolean[s.length()];
        int count;
        for(int i=0;i<s.length();i++){
            count=1;
            if(b[i]) continue;
            b[i]=true;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && !b[j]){
                    count++;
                    b[j]=true;
                }
            }
            if(count>0){
                System.out.println(s.charAt(i)+"-->"+count);
            }
        }

    }
}
