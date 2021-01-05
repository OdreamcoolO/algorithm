package linked;

/**
 *
 * 双链表反转
 *
 * @description
 * @author: clt
 * @create: 2021-01-05 09:02
 **/
public class DoublyLinkedListReverse {

    public static class Node<T> {
        private T element;

        private Node previous;

        private Node next;

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
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
            while (head.hasNext()){
                Node next = head.next;
                sb.append(next.element).append(", ");
                head = next;
            }
            sb.delete(sb.lastIndexOf(", "), sb.lastIndexOf(", ")+2);
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

        // 保存旧链表头信息作为新链表尾
        Node<Integer> newLinkedList = new Node<>(head.element);
        while (head.hasNext()){
            // 根据就旧链表数据初始化新节点
            Node pre = new Node(head.next.element);

            // 维护新链表双向指针
            newLinkedList.previous = pre;
            pre.next = newLinkedList;

            // 新旧链表指针移位
            newLinkedList = pre;
            head = head.next;
        }

        System.out.println(newLinkedList);
    }
}
