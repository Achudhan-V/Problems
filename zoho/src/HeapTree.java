import java.util.*;
class TreeNodes{
    int data;
    TreeNodes left,right;
    TreeNodes(int data){
        this.data=data;
    }
}

public class HeapTree{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        TreeNodes root=null;
        int[] arr={7,11,3,15,21,4,9,0};

        root=create(0,arr.length-1,arr);
        print(root,0);

 }

    static TreeNodes create(int i,int j,int[] arr){
        if(i>j) return null;

        int maxind=-1,max=Integer.MIN_VALUE;

        for(int k=i;k<=j;k++){
            if(arr[k]>max){
                maxind=k;
                max=arr[k];
            }
        }

  TreeNodes curr=new TreeNodes(arr[maxind]);

        curr.left=create(i,maxind-1,arr);
        curr.right=create(maxind+1,j,arr);

        return curr;
 }

static void print(TreeNodes root,int s) {
        if(root==null) return;

        print(root.right,s+1);
        for (int i=0;i<s; i++)
            System.out.print("     ");

        System.out.println(root.data + " ");
        print(root.left,s+1);
}
/*
static boolean find(TreeNodes root, int data){
        if(root==null) return false;

        if(root.data==data){
            System.out.print(root.data+" ");
            return true;
        }

        if(find(root.left,data)){
            System.out.print(root.data+" ");
            return true;
        }
        if(find(root.right,data)){
            System.out.print(root.data+" ");
            return true;
        }
        return false;
    }
*/
}