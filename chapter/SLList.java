import edu.princeton.cs.algs4.In;

import java.util.NoSuchElementException;

public class SLList {
    private IntNode head_;  // 哨兵结点
    private int size_ = 0;
    private IntNode last_;  // 尾指针

    /**
     * 简单的构造函数
     */
    public SLList(int x) {
        IntNode p = new IntNode(x, null);
        head_ = new IntNode(-255, p);
        last_ = p;
        ++size_;
    }

    public SLList() {
        head_ = new IntNode(-255, null);
        last_ = head_;
        size_ = 0;
    }

    /**
     * 头插法加入元素.
     */
    public void addFirst(int x) {
        IntNode p = new IntNode(x, head_.next_);
        if (size_ == 0) {
            last_ = p;
        }
        ++size_;
    }

    /**
     * 获取头结点元素值.
     */
    public int getFirst() {
        if (head_.next_ == null) throw new NoSuchElementException();
        return head_.next_.item_;
    }

    /**
     * 尾插法
     */
    public void addLast(int x) {
        IntNode p = new IntNode(x, null);
        last_.next_ = p;
        last_ = p;
        ++size_;
    }

    /**
     * 获取链表中元素数量,使用递归方法.
     */
    public int size(IntNode p) {
        IntNode p1 = head_.next_;
        if (p1 == null) return 0;
        if (p1.next_ == null) return 1;

        return 1 + size(p1.next_);
    }

    /**
     * 使用缓存来更快的获取元素个数
     */
    public int size() {
        return size_;
    }
}
