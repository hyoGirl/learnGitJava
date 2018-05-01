package Tree;


class TreeNode{

    public int value;
    public TreeNode left,right;

    public TreeNode(int value) {
        this.value = value;
        left=right=null;
    }


}
public class TreeMain {


    public static void main(String[] args) {

        TreeNode node1=new TreeNode(10);
        TreeNode node2=new TreeNode(20);
        TreeNode node3=new TreeNode(30);

        node1.left=node2;
        node1.right=node3;

        System.out.println("TreeNode1 value: "+node1.value);
        System.out.println("TreeNode1 left value: "+node1.left.value);
        System.out.println("TreeNode1 right value: "+node1.right.value);



    }
}
