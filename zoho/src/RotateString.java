public class RotateString {
    public static void main(String args[]){

        String a="hello";
        String b="llohe";

        for(int j=0;j<b.length();j++){
            if(b.charAt(j)==a.charAt(0)){
                String temp="";

                for(int i=j;i<b.length();i++) temp+=b.charAt(i);
                for(int i=0;i<j;i++) temp+=b.charAt(i);

                if(a.equals(temp)){
                    System.out.print("Yes");
                    return;
                }
            }
        }
        System.out.print("No");

        /*
        if(a.length()!=b.length()) return;

        boolean flag=true; int k=0;
        for(int j=0;j<b.length();j++){
           flag=true;
           if(b.charAt(j)==a.charAt(0)){

                for(int i=j;i<b.length();i++) {
                    if(b.charAt(i)!=a.charAt(k)){
                        flag=false;
                        k=0;
                        break;
                    }
                    k++;
               }
                for(int i=0;i<j;i++) {
                    if(b.charAt(i)!=a.charAt(k)){
                        flag=false;
                        k=0;
                        break;
                    }
                    k++;
                }
            }
        }

        if(flag && k==a.length()){
            System.out.println("yes");
        }
        else{
            System.out.print("no");
        }*/
    }
}
