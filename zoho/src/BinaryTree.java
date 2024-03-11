import java.util.ArrayList;
import java.util.Scanner;

class TreeNode{
    int data;
    char pos;
    TreeNode left,right;
    TreeNode(int data,char pos){
        this.data=data;
        this.pos=pos;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        TreeNode root = null;

        for (int i=0;i<n;i++){
            int pData=s.nextInt();
            int cData=s.nextInt();
            char pos=s.next().charAt(0);

            if (root==null)root=new TreeNode(pData,' ');

            TreeNode pNode=find(root,pData);
            if(pNode==null){
                System.out.print("no parent is there");
                return;
            }
            TreeNode cNode=new TreeNode(cData, pos);

            if (pos=='L'){
                pNode.left=cNode;
            }
            else{
                pNode.right=cNode;
            }
         }
         print(root,0);


//ArrayList<Integer> p=new ArrayList<>();
//        int from=4;
//        TreeNode a=find(root,from);
//        if(a==null) System.out.print("not found");
//        else path(root,a.data,p);
//
//        for(int i=0;i<p.size();i++) System.out.print(p.get(i)+" ");

//        p.clear();
//        int to=5;
//         a=find(root,to);
//        if(a==null) System.out.print("not found");
//        else path(root,a.data,p);
//
//        for(int i=p.size()-1;i>=0;i--) System.out.print(p.get(i)+" ");

 }

    static TreeNode find(TreeNode root,int data) {
        if(root==null) return null;

        if (root.data==data){
            return root; }

        TreeNode left=find(root.left,data);
        if(left!=null){
            return left;
           }
        TreeNode right=find(root.right,data);

        if(right!=null){
            return right;
           }
        return null;
    }

    static void print(TreeNode root,int s){
    if(root==null) return;

    print(root.right,s+1);
       for (int i=0;i<s; i++)
      System.out.print("    ");

    System.out.println(root.data + " " + root.pos);
       print(root.left,s+1);
    }

    /*
    static boolean path(TreeNode root,int todata , ArrayList<Integer> p) {
        if(root==null) return false;
        if(root.data==todata){
           // System.out.print(from.data+" ");
            p.add(root.data);
            return true;
        }
        boolean left=path(root.left,todata,p);
        if (left!=false){
           // System.out.print(root.data+" ");
            p.add(root.data);
            return true;
        }
        boolean right=path(root.right,todata,p);

        if(right!=false){
           // System.out.print(root.data+" ");
            p.add(root.data);
            return true;
        }
        return false;
  }*/
}