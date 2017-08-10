
/**
 * Created by smeleyka on 10.08.17.
 */
public class Tree {
    int value;
    Tree left, right;

    public Tree(int value) {
        this.value = value;
    }

    public void add(int v) {
        if (value==v) return;
        if(v>value){
            right = new Tree(v);
            return;
        }
        else {
            left = new Tree(v);
            return;
        }
    }

    public void printTree(){
        System.out.println(value);
        if (left != null) left.printTree();
        if (right!=null) right.printTree();
    }

}
