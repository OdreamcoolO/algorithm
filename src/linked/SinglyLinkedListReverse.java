package linked;

/**
 * 单向链表反转
 *
 * @description
 * @author: clt
 * @create: 2021-01-05 10:04
 **/
public class SinglyLinkedListReverse {

    public static class Node<T> {
        private T element;

        private Node<T> next;

        public Node() {
        }

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            Node head = this;
            sb.append(head.element).append(", ");
            while (head.hasNext()) {
                Node next = head.next;
                sb.append(next.element).append(", ");
                head = next;
            }
            sb.delete(sb.lastIndexOf(", "), sb.lastIndexOf(", ") + 2);
            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // init head data
        Node<Integer> preNode = new Node<>(0);

        // save info to head in order to print
        Node<Integer> head = preNode;

        for (int i = 1; i < 5; i++) {
            Node<Integer> node = new Node<>(i);
            preNode.next = node;
            preNode = node;
        }

        System.out.println(head);

        head = reverse(head, null, null);
        System.out.println(head);

        head = reverse(head);
        System.out.println(head);
    }

    public static <T> Node<T> reverse(Node<T> head, Node<T> next, Node<T> pre){
        if (head == null){
            return pre;
        }
        next = head.next;
        head.next = pre;
        pre = head;
        head = next;
        return reverse(head, next, pre);
    }

    public static <T> Node<T> reverse(Node<T> head){
        Node pre = null;
        Node next = null;
        // head ---> [0,1,2,3,4]
        while (head != null) {
            // next --->  [1,2,3,4]
            next = head.next;
            // head --->  [0]
            head.next = pre;
            // pre ---> [0]
            pre = head;
            // head ---> [1,2,3,4]
            head = next;
        }

        // head [0,1,2,3,4]
        // next [1,2,3,4]
        // pre  [0]
        // head [1,2,3,4]

        // head [1,2,3,4]
        // next [2,3,4]
        // pre  [1,0]
        // head [2,3,4]

        // head [2,3,4]
        // next [3,4]
        // pre  [2,1,0]
        // head [3,4]

        // head [3,4]
        // next [4]
        // pre  [3,2,1,0]
        // head [4]

        // head [4]
        // next []
        // pre  [4,3,2,1,0]
        // head []
        return pre;
    }
}
