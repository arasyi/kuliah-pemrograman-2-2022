public class LinkedListInteger {
    NodeInteger head;
    NodeInteger tail;

    int size;

    public LinkedListInteger() {
        head = tail = null;
        size = 0;
    }

    public void add(Integer data) {
        NodeInteger newNodeInteger = new NodeInteger(data);
        if (isEmpty()) {
            head = tail = newNodeInteger;
            size++;
            return;
        }

        tail.next = newNodeInteger;
        newNodeInteger.prev = tail;
        tail = newNodeInteger;
        size++;
    }

    public void print() {
        NodeInteger current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean remove(Integer data) {
        NodeInteger current = head;
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

class NodeInteger {
    Integer data;
    NodeInteger next;
    NodeInteger prev;

    public NodeInteger(Integer data) {
        this.data = data;
    }
}
