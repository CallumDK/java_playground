package challenges.week_2.binary_tree;

public interface BinaryTreeI {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] element);

    boolean findElement(int value);

    //int getLeftChild(int element) throws ChildNotFoundException;

    //int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
