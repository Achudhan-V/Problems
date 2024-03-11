
public class PushZero{
    public static void main(String[] args){
        int a[]={1,0,2,0,3,4,5,0};
        int k=0,j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                if(i==j) {
                    j++;
                    continue;
                }
                int temp=a[i]; //2
                a[i]=a[j];
                a[j]=temp;

                j++;
            }
        }
        for(int i :a){
            System.out.print(i+" ");
        }
    }
}
//left push zeros
/*public class PushZero{
    public static void main(String[] args){
        int a[]={7,0,2,0,3,4,5,0, 7, 8,9, 0};
        int k=0,j=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                int temp=a[i]; /
                a[i]=a[j];
                a[j]=temp;
                j--;
            }

        }
        for(int i :a){
            System.out.print(i+" ");
        }
    }
}*/

/*
while(n!=0){
        int temp = n, m = 0, p = 1;

        while(temp!=0){
        int rem=temp % 10;
        temp=temp / 10;

        if(rem!=0) m+=p;

        p*=10;
        }

        System.out.print(m+" ");
        n=n-m;
}
*/

/*


int k=0; boolean bo=false;
        for(int i=0;i<a.length();i++){
bo=false;
        for(int j=k;j<b.length();j++){
        if(a.charAt(i)==b.charAt(j)){
        if(j==k) {
        System.out.print(a.charAt(i));
k++;
bo = true;
        break;
        }
        else {
        while (k < j) {
        System.out.print(b.charAt(k));
k++;
        }
k++;
        break;
        }
        }
        }
        if(!bo) System.out.print(a.charAt(i));
        }
        while(k<b.length()) System.out.print(b.charAt(k++));
 */

/*
Instant start= Instant.now();
Instant end= Instant.now();
        System.out.println("  time : "+ (Duration.between(start,end).toMillis())+"ms");
 */

/*

public class MatrixSearch {
    static int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public static void main(String[] args) {
        String s = "hellogooglezohofacebook";
        int l = s.length();

        char[][] a = new char[5][5];
        int r = 5;
        int c = 5;
        int k = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(k<s.length()) a[i][j]=s.charAt(k++);
                else a[i][j]='*';
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        String ans = "zoe";
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ArrayList<String> subResult = dfs(a, i, j, ans, 0);
                if (!subResult.isEmpty() && a[i][j] == ans.charAt(0)) {
                    result.add("(" + i + "," + j + ")");
                }
            }
        }


        if (!result.isEmpty()) {
            for (String str : result) {
                System.out.print(str + " ");
            }
        } else {
            System.out.println("Not there");
        }
    }

    static ArrayList<String> dfs(char[][] a, int row, int col, String ans, int index) {
        ArrayList<String> result = new ArrayList<>();
        if (index == ans.length()) {
            result.add("(" + row + "," + col + ")");
            return result;
        }

        if (row < 0 || row >= a.length || col < 0 || col >= a[0].length || a[row][col] != ans.charAt(index)) {
            return result;
        }

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            ArrayList<String> subResult = dfs(a, newRow, newCol, ans, index + 1);
            for (String subStr : subResult) {
                result.add("(" + row + "," + col + ") " + subStr);
            }
        }

        // If no paths found, return the current position as a single path
        if (result.isEmpty()) {
            result.add("(" + row + "," + col + ")");
        }

        return result;
    }


}
*/
