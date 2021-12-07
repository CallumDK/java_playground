package challenges.week_2.binary_tree;

public class App {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(5);
        binaryTree.addElement(1);
        binaryTree.addElement(10);
        binaryTree.addElement(11);
        binaryTree.addElement(16);
        binaryTree.addElement(100);
        binaryTree.addElement(16);

        System.out.println(binaryTree.findElement(14));
    }

}
