public class Main {
    public static void main(String args []){
        System.out.println("hello world!");
        TreeNode head = new TreeNode(1);
        head.right = new TreeNode(2);
        head.left = null;

        Solution s = new Solution();
        int ans;
        ans = s.kthLargest(head , 1);
        System.out.println("ans is :" + ans);
    }
}
