public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public class LinkedListString {
        NodeString head;
        NodeString tail;

        int size;

        public LinkedListString() {
            head = tail = null;
            size = 0;
        }

        public void add(String data) {
            NodeString newNodeString = new NodeString(data);
            if (isEmpty()) {
                head = tail = newNodeString;
                size++;
                return;
            }

            tail.next = newNodeString;
            newNodeString.prev = tail;
            tail = newNodeString;
            size++;
        }

        public void print() {
            NodeString current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        public boolean remove(String data) {
            NodeString current = head;
            while (current != null) {
                if (current.data.equals(data)) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    if (current == head) {
                        head = current.next;
                    }
                    if (current == tail) {
                        tail = current.prev;
                    }
                    current.next = null;
                    current.prev = null;
                    size--;
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    class NodeString {
        String data;
        NodeString next;
        NodeString prev;

        public NodeString(String data) {
            this.data = data;
        }
    }

    int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean remove(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current == head) {
                    head = current.next;
                }
                if (current == tail) {
                    tail = current.prev;
                }
                current.next = null;
                current.prev = null;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

class Node<T> {
    T data;
    Node next;
    Node prev;

    public Node(T data) {
        this.data = data;
    }
}
