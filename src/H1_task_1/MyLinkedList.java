
package H1_task_1;

import java.util.Collection;

public class MyLinkedList<E> {

    private int size = 0;

    private Node<E> first = new Node<>();
    private Node<E> last = new Node<>();

    public MyLinkedList() {
        first.next = last;
        last.prev = first;
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;
    }
    public int size(){
        return size;
    }

    public void add(E element) {

        Node newNode = new Node();
        newNode.element = element;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;

        size++;
    }

    public void addAll(Collection<E> collection) {
       for(E elements:collection){
           add(elements);
       }
    }


    public Object get(int index) {
        Node currentElement = first.next;
        int currentIndex = 0;

        while (currentElement != null && currentElement != last) {
            if (currentIndex == index) {
                return currentElement.element;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return null;

    }


    public void remove(int index) {
        Node<E> currentElement = first.next;
        int currentIndex = 0;

        while (currentElement != null && currentElement != last) {
            if (currentIndex == index) {
                E elenemt = currentElement.element;
                currentElement.prev.next = currentElement.next;
                currentElement.next.prev = currentElement.prev;

                currentElement.next = currentElement.prev = null;
                currentElement.element = null;
                size--;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
    }

}




