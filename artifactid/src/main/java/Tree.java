import java.math.*;

public class Tree {

    public static int minimumTreedepth (TreeNode treeNodeRoot) {
        if (treeNodeRoot == null) {return 0;} else { return (1+Math.min(minimumTreedepth(treeNodeRoot.leftTreennode),minimumTreedepth(treeNodeRoot.leftTreennode)));}

    }

    public static int maximumTreedepth (TreeNode treeNodeRoot) {
        if (treeNodeRoot == null) {return 0;} else { return (1+Math.max(maximumTreedepth(treeNodeRoot.leftTreennode),maximumTreedepth(treeNodeRoot.leftTreennode)));}

    }


    public static boolean isTreeBalanced (TreeNode treeNodeRoot) {
        return (maximumTreedepth(treeNodeRoot)-minimumTreedepth(treeNodeRoot) <= 1 );
    }
}
