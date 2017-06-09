/**
 * Created by kyrka on 2017.06.09..
 */


public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(50);
        treeNode.leftTreennode= new TreeNode(17);
        treeNode.rightTreenode = new TreeNode(76);

        System.out.println(Tree.isTreeBalanced(treeNode));
        treeNode.leftTreennode.leftTreennode = new TreeNode(9);
        System.out.println(Tree.isTreeBalanced(treeNode));
        treeNode.leftTreennode.leftTreennode.leftTreennode = new TreeNode(4);
        System.out.println(Tree.isTreeBalanced(treeNode));
    }

}
