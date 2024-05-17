package quiz2;

public class DoubleLinkedList {
    Node head, tail;
    int size;

    DoubleLinkedList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    }

    void deleteFirst() {
        if (!isEmpty()) {
            head = head.n;
            if (head != null) {
                head.p = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.n;
        }
        System.out.println("");
    }
    void addLast(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            tail.n = nu;
            nu.p = tail;
            tail = nu;
        }
        size++;
    }
    void deleteLast() {

        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.p;
                tail.n = null;
            }
            size--;
        }

    }
    void printFromTail() {
        Node tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.p;
        }
        System.out.println("");

    }
    int getPositionFromTail(int data) {
        Node tmp = tail;
        int position = 1;
        while (tmp != null) {
            if (tmp.data == data) {
                return position;
            }
            tmp = tmp.p;
            position++;
        }
        return -1;
    }
    int getLastPositionFromTail(int data) {
        Node tmp = tail;
        int position = size;
        while (tmp != null) {
            if (tmp.data == data) {
                return position;
            }
            tmp = tmp.p;
            position--;
        }
        return -1; 
    }
    double getAverage() {
        double average = 0;
        if (isEmpty()) {
            return 0; 
        }
        int sum = 0;
        Node tmp = head;
        while (tmp != null) {
            sum += tmp.data;
            tmp = tmp.n;
        }
        average = (double) sum / size;
        return average;
    }
    Node getNodeByIndex(int index) {
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.n;
        }
        return tmp;
    }

    void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                Node node1 = getNodeByIndex(j);
                Node node2 = getNodeByIndex(j - 1);
                if (node2.data > node1.data) {
                    int tmp = node2.data;
                    node2.data = node1.data;
                    node1.data = tmp;
                }
            }
        }
    }
    double getMedian() {
        double median = 0;
        sort();
        if (isEmpty()) {
            return 0;
        }
        if (size % 2 == 0) {
            int middleIndex = size / 2;
            median = (getNodeByIndex(middleIndex).data + getNodeByIndex(middleIndex + 1).data) / 2.0;
        } else {
            int middleIndex = size / 2 + 1;
            median = getNodeByIndex(middleIndex).data;
        }

        return median;
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();

        dll.addLast(5);
        dll.addLast(20);
        dll.print();

        dll.deleteLast();
        dll.printFromTail();

        System.out.println("Position from Tail: " + dll.getPositionFromTail(10));
        System.out.println("Last Position from Tail: " + dll.getLastPositionFromTail(10));
        System.out.println("Average: " + dll.getAverage());
        System.out.println("Median: " + dll.getMedian());
       
    }
}