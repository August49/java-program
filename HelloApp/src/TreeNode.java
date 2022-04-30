import java.util.Map;
import java.util.TreeMap;

import javax.lang.model.util.ElementScanner14;

public class TreeNode <E> extends TreeMap{

    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;


    public TreeNode (E e){
           element = e;
    }

   



    
}
