import java.util.ArrayList;

public class MatrixSearch {
    static int[] dx = { -1,  0, 0,  1};
    static int[] dy = { 0,  -1, 1,  0};

    public static void main(String[] args) {
        String s = "hallogooglfzohofacebook";

        int k = 0, r = 5, c = 5;

        char[][] a = new char[5][5];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (k < s.length()) a[i][j] = s.charAt(k++);
                else a[i][j] = '*';
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        String ans = "zoho";
        k = 0;

        ArrayList<String> ind = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == ans.charAt(0)) {
                    ind = new ArrayList<>();
                    ind.add("(" + i + "," + j + ")");
                    if (search(a, ans, i, j, 1, r, c, ind)) {
                        for (String x : ind) {
                            System.out.print(x + " ");
                        }
                        return;
                    }
                }
            }
        }
        System.out.print("Not there");
    }


    static boolean search(char[][] a, String ans, int x, int y, int k, int r, int c, ArrayList<String> ind) {


        for (int i=0;i<4; i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];

                while(nx>=0 && nx<r && ny>=0 && ny<c && a[nx][ny]==ans.charAt(k)) {
                    ind.add("(" + nx + "," + ny + ")");
                    nx+=dx[i];
                    ny+=dy[i];
                    k++;

                    if (k==ans.length()) {
                        return true;
                    }
                }
                ind.clear();
                ind.add("("+x+","+y+")");
                k=1;
        }
        return false;
    }
}




 /*      ind.clear();
          ind.add("("+i+","+j+")");

          int ro=i,co=j; k=1;

          while (k<ans.length()) {
              if(ro+1 < r && co+1 < c && a[ro+1][co+1]==ans.charAt(k)) {
                  ro++;
                  co++;
                  ind.add("("+ro+","+co+")");

              }
              else if(ro+1 < r && a[ro+1][co]==ans.charAt(k)) {
                  ro++;
                  ind.add("("+ro+","+ co+")");
              }
              else if(ro+1 < r && co-1 >= 0 && a[ro+1][co-1]==ans.charAt(k)) {
                  ro++;
                  co--;
                  ind.add("("+ro+","+co+")");
              }
              else if(co - 1 >= 0 && a[ro][co - 1] == ans.charAt(k)) {
                  co--;
                  ind.add("(" + ro + "," + co + ")");
              }
              else if(ro-1 >= 0 && co-1 >= 0 && a[ro-1][co-1]==ans.charAt(k)) {
                  ro--;
                  co--;
                  ind.add("("+ro+","+co+")");
              }
              else if (ro-1 >= 0 && a[ro-1][co]==ans.charAt(k)) {
                  ro--;
                  ind.add("("+ro+","+co+")");
              }
              else if(ro-1 >= 0 && co+1 < c && a[ro-1][co+1]== ans.charAt(k)) {
                  ro--;
                  co++;
                  ind.add("("+ro+","+co+")");
              }
              else if (co+1 < c && a[ro][co+1]==ans.charAt(k)) {
                  co++;
                  ind.add("("+ro+","+co+")");
              }
              else{
                  k=0;
                  ind.clear();
                  break;
              }
              k++;
          }

          if (k==ans.length()) {
              for (String x : ind) {
                  System.out.print(x + " ");
              }
              return;
          }
      }
  }
}
*/


/*
static boolean search(char[][] a, String ans, int x, int y, int k, int r, int c, ArrayList<String> ind) {
        if (k == ans.length()) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < r && ny >= 0 && ny < c && a[nx][ny] == ans.charAt(k)) {
                ind.add("(" + nx + "," + ny + ")");
                if (search(a, ans, nx, ny, k + 1, r, c, ind)) {
                    return true;
                }
                ind.remove(ind.size() - 1);
            }
        }
        return false;
    }
 */