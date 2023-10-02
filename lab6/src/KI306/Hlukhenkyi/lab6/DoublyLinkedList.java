package KI306.Hlukhenkyi.lab6;

/**
 * Node class represents a node in a doubly linked list.
 *
 * @param <T> The type of data stored in the node.
 */
class Node<T> {
    T data;           // Data stored in the node
    Node<T> next;     // Reference to the next node
    Node<T> prev;     // Reference to the previous node

    /**
     * Constructor to create a new node with the given data.
     *
     * @param data The data to be stored in the node.
     */
    public Node(T data) {
        this.data = data;
    }
}

/**
 * DoublyLinkedList class represents a doubly linked list.
 *
 * @param <T> The type of data stored in the list (must be Comparable).
 */
public class DoublyLinkedList<T extends Comparable<T>> {
    private Node<T> head; // Reference to the first node in the list
    private Node<T> tail; // Reference to the last node in the list

    /**
     * Adds a new node with the given data to the end of the list.
     *
     * @param data The data to be added to the list.
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    /**
     * Finds and returns the minimum element in the list.
     *
     * @return The minimum element in the list.
     */
    public T findMin() {
        if (head == null) {
            return null;
        }
        T min = head.data;
        Node<T> current = head;
        while (current != null) {
            if (current.data.compareTo(min) < 0) {
                min = current.data;
            }
            current = current.next;
        }
        return min;

    public T findMinLenght() {
        if (head == null) {
            return null;
        }
        String minLengthWord = head.data.toString(); // Convert to string to get length
        int minLength = minLengthWord.length();
        Node<T> current = head;

        while (current != null) {
            String currentWord = current.data.toString(); // Convert to string to get length
            int currentLength = currentWord.length();

            if (currentLength < minLength) {
                minLengthWord = currentWord;
                minLength = currentLength;
            }
            current = current.next;
        }

        String minLenghtString = Integer.toString(minLength);
        return (T) minLenghtString;
    }

    /**
     * Finds and returns the maximum element in the list.
     *
     * @return The maximum element in the list.
     */
    public T findMax() {
        if (head == null) {
            return null;
        }
        T max = head.data;
        Node<T> current = head;
        while (current != null) {
            if (current.data.compareTo(max) > 0) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    /**
     * Displays the elements of the list in order.
     */
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
