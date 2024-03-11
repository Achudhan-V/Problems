public class GrandChild {
    public static void main(String[] args) {
        String[][] a={
                {"kumar","sekar","10"},
                {"sekar", "john","12"},
                {"abc","john","15"},
                {"def","abc","8"},
                {"rajesh", "sekar","5"},
        };

        String b="john";
        int k=0,j=0,i=0;
      String[][] gc=new String[a.length][2];

        for(i=0;i<a.length;i++){

            if(a[i][1].equals(b)){
                String f=a[i][0]; //sekar

                for(j=0;j<a.length ; j++){
                    if(a[j][1].equals(f)){
                       // System.out.print(a[j][0]+" , ");
                        gc[k][0]=a[j][0];
                        gc[k][1]=a[j][2];
                        k++;
                    }
                }
            }

        }

for(i=0;i<gc.length;i++){
    for(j=i+1;j<gc.length;j++){
        if(gc[i][1] != null && gc[j][1] != null && Integer.parseInt(gc[i][1])>Integer.parseInt(gc[j][1])){
            String temp=gc[i][1];
            gc[i][1]=gc[j][1];
            gc[j][1]=temp;

            temp=gc[i][0];
            gc[i][0]=gc[j][0];
            gc[j][0]=temp;
        }
    }
}

for(i=0;i<k;i++){
    System.out.println(gc[i][0]+" "+gc[i][1]);
}

       }
}
