package Tree;

/**
 * 中序遍历
 */
public class LDR {

    static int count=0;
    public static void main(String[] args) {


        TreeNode node1=new TreeNode(8);
        TreeNode node2=new TreeNode(3);
        TreeNode node3=new TreeNode(10);
        TreeNode node4=new TreeNode(1);
        TreeNode node5=new TreeNode(6);
        TreeNode node6=new TreeNode(4);
        TreeNode node7=new TreeNode(7);
        TreeNode node8=new TreeNode(14);
        TreeNode node9=new TreeNode(13);

        node1.left=node2;
        node1.right=node3;

        node2.left=node4;
        node2.right=node5;

        node5.left=node6;
        node5.right=node7;

        node3.right=node8;
        node8.left=node9;

        //中序遍历,左根右
        print(node1);
        System.out.println();
        System.out.println(count);


    }

    //这个print打印了19次 19=2*9+1 +1是一开始调用的一次。


    //每次传入一个值，都会调用2次，如果是叶子节点，那么也会去调用2次，传入的左/右 都是null
    //所以总共调用了18次 而多出来的一次就是main函数调用的。
    static void print(TreeNode node){
        count++;
        //如果root已经是叶子节点，就不用继续打印了。
        if(node==null ){
            return;
        }

        print(node.left);
        System.out.print(node.value+" ");
        print(node.right);



    }
}
