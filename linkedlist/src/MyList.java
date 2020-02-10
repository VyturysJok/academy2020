public class MyList<T> {


    Node<T> first;
    Node<T> last;

    public MyList() {

    }

    @Override
    public String toString() {
        return "MyList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public void insertFirst(T value) {
        Node<T> node = new Node<>(value);
        if (last == null) {
            last = node;
        }
        if (first == null) {
            first = node;
        } else {
            node.tail = first;
            first = node;
        }
    }

    public void addLast(T value) {
        Node<T> tempNode = first;
        Node<T> node = new Node<>(value);
        node.tail = null;
        if (first == null) {
            first = node;
        } else {
            while (tempNode.tail != null) {
                tempNode = tempNode.tail;
            }
            tempNode.tail = node;
        }
        last = node;

    }
}