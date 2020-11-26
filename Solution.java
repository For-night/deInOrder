class Solution {
    public static int num;
    public static int ans;
    public static boolean canGo;

    public int kthLargest(TreeNode root, int k) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        num = 0;
        ans = 0;
        canGo = true;
        deInOrder(root , k );
        return ans;
    }

    public static void deInOrder(TreeNode head, int k ){
        if(!canGo) return;
        if(head == null) return;
        deInOrder(head.right,k);
        num ++;
        if(num == k){
            ans = head.val;
            canGo = false;
            return;
        }
        deInOrder(head.left,k);
    }
}