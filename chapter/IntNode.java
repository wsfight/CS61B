/**
 * 一个简单的Node结点
 * @param:  item_ 保存的内容
 * @param: next_ 指向的下一个结点
 * */

public class IntNode {
    public int item_;
    public IntNode next_;
    public IntNode(int item,IntNode next){
        this.item_ = item;
        this.next_ = next;
    }
}
