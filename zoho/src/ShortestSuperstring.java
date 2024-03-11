import java.util.Arrays;

public class ShortestSuperstring {
    public static void main(String[] args) {
        String a="aggbya";
        String b="bzya";
        int n=a.length();
        int m=b.length();

        int[][] dp=new int[n+1][m+1];

        for (int i=0;i<=n;i++){

               for (int j=0;j<=m;j++) {
                if(i==0 || j==0) {
                    dp[i][j]=i+j;
                }
                else if(a.charAt(i-1)==b.charAt(j-1)) {
                    dp[i][j]= dp[i-1][j-1]+1;
                }
                  else{
                    dp[i][j]= Math.max(dp[i-1][j]+1,dp[i][j-1]+1);
                }
            }
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        String s="";

        int i=n,j=m;
        while (i>0 && j>0) {
            if (a.charAt(i-1)==b.charAt(j-1)) {
                s+=a.charAt(i-1);
                i--;
                j--;
            }
            else if(dp[i-1][j]<dp[i][j-1]) {
                s+=a.charAt(i-1);
                i--;
            }
            else{
                s+=b.charAt(j-1);
                j--;
            }
        }

        while (i>0) {
            s+=a.charAt(i-1);
            i--;
        }
        while (j > 0) {
            s+=b.charAt(j-1);
            j--;
        }

        for(i=s.length()-1 ; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
