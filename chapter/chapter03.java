import edu.princeton.cs.algs4.In;

public class chapter03 {
    /**
     * simple intList complement
     * 感觉更像一个链表的结点
     * @param:first_ 该结点的值
     * @param:next_ 指向的下一个结点
     * */
    public static class IntList{
        public int first_;
        public IntList next_;
        public IntList(int first,IntList next){
            first_ = first;
            next_ = next;
        }
        /**
         * @return:返回一个可迭代的链表规模大小
         * */
        public int iterativeSize(){
            IntList p = this;
            int size = 0;
            while(p != null){
                size++;
                p = p.next_;
            }
            return size;
        }
        /**
         * @param:i为索引,i从0开始,i>=o
         * @return: 第i个结点的值
         * */
        public int get(int i) throws Exception {
            int ret;
            IntList p = this;
            if(p == null)    throw new Exception("No elements");
            for(int j = 1;j <= i;j++){
                if(p.next_ != null)
                    {p = p.next_;}
            }
            ret = p.first_;
            return ret;
        }

    }
}
