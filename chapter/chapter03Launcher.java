public class chapter03Launcher {
    public static void main(String[] args) {
        chapter03.IntList l = new chapter03.IntList(1,null);
        l.next_ =  new chapter03.IntList(2,null);
        l.next_.next_ = new chapter03.IntList(3,null);
        chapter03.IntList q = l;
        for(int i = 0;i < 3;i++){
            System.out.println(q.first_);
            q = q.next_;
        }
    }
}
