import KI306.Hlukhenkyi.lab6.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        DoublyLinkedList<String> names = new DoublyLinkedList<>();
        // Додати деякі елементи до списку
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(2);

//        names.add("H");
        names.add("Apple");
        names.add("Graz");
        names.add("Алівмвапдлва");
        names.add("Puppy");


        names.display();
//        String min02 = names.findMax();
//        System.out.println("Мінімальний елемент: " + min02);

        String minLenght = names.findMinLenght();
        System.out.println("Найменший елемент в збірці: " + minLenght);

        // Вивести елементи списку
//        list.display();

        // Знайти та вивести мінімальний елемент
//        Integer min = list.findMin();
//        System.out.println("Мінімальний елемент: " + min);

//        // Знайти та вивести максимальний елемент
//        Integer max = list.findMax();
//        System.out.println("Максимальний елемент: " + max);
    }
}
