import java.util.*;
class CalcString
{
    public static void main(String[]args){

        String s="572+-";
        int oprcount=0,ans=(int)(s.charAt(0) - '0');
        char opr[]=new char[s.length()]; //operators

        for(int i=s.length()-1;i>=0;i--){
            if(!isNum(s.charAt(i))){
                opr[oprcount++]=s.charAt(i);
            }
        }

        if(s.length()-oprcount != oprcount+1) return;

        int k=oprcount-1;
        //System.out.print(oprcount);
        for(int i=1;i<s.length()-oprcount;i++){

            char oper = opr[k--];
            //System.out.println(oper+" >> "+s.charAt(i));
            switch(oper){
                case '+': ans+= (int)(s.charAt(i) - '0'); break;

                case '-': ans-= (int)(s.charAt(i) - '0'); break;

                case '*':ans*= (int)(s.charAt(i) - '0'); break;

                case '/':ans/= (int)(s.charAt(i) - '0'); break;
            }
        }
        System.out.print(ans);
    }
    static boolean isNum(char c){
        return (c>='0' && c<='9');
    }
}