public class AlternateSort {
    public static void main(String[] args) {
        int a[] = {3, 1, 7, 5, 6, 2, 4};  // 4 2 1 3 5


        int r = a.length / 2, l = r - 1;
        int min, ind = -1;

        int i = 0, j = a.length - 1;
        boolean flag = false;
        while (i < j) {
            System.out.print(i + "," + j + " --> ");

            for (int k = ((flag) ? (i + 1) : (j - 1)); ((flag) ? (k <= j) : (k > i)); k += ((flag) ? 1 : -1)) {

                if (flag) {
                    if (a[i] < a[k]) {
                        int temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                    }
                } else {
                    if (a[k] > a[j]) {
                        int temp = a[k];
                        a[k] = a[j];
                        a[j] = temp;
                    }
                }
            }

            if (flag) i++;
            else j--;

            for (int n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
            flag = !flag;
        }


        for (int n : a) {
            System.out.print(n + " ");
        }

    }}






/*
 if(flag){
           for(int k =i+1; k <= j; k++) {
                    if (a[i] < a[k]) {
                        int temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                    }
                }
                i++;
            }
            else{
                for(int k=j-1; k>i; k--) {
                    if (a[k] > a[j]) {
                        int temp = a[k];
                        a[k] = a[j];
                        a[j] = temp;
                    }
                }
                j--;

            }
 */


//approach 3
 /*for(int i=0;i<a.length;i++){
            min=Integer.MAX_VALUE;
           for(int j=0;j<a.length;j++) {
                if(j<=l && a[j]<min){
                    min=a[j];
                    ind=j;
                }
                if(j>=r && j<a.length && a[j]<min){
                    min=a[j];
                    ind=j;
                }
            }
            if(i%2==0) {
                int temp=a[r];
                a[r]=a[ind];
                a[ind]=temp;

                r++;
            }
            else{
                int temp = a[l];
                a[l] = a[ind];
                a[ind] = temp;

                l--;
            }
        }*/


//or
/*for(int j=0;j<=l;j++){
                if(a[j]<min){
                    min=a[j];
                    ind=j;
                }
            }

            for(int j=r;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    ind=j;
                }
            }*/
/*
for(int j=l+1;j <=
 */