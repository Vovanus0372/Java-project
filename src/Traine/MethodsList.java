package Traine;

public class MethodsList extends Traine{
    /* Реализация ArrayList
/**
 * Простая реализация ArrayList.
 */
    public static class MyArrayList<E> {
        private Object[] elements;
        private int size;

        public MyArrayList() {
            elements = new Object[10];
            size = 0;
        }

        /**
         * Добавляет элемент в конец списка.
         * @param element элемент, который нужно добавить
         */
        public void add(E element) {
            ensureCapacity();
            elements[size++] = element;
        }

        /**
         * Удаляет элемент по индексу.
         * @param index индекс элемента, который нужно удалить
         * @return удаленный элемент
         */
        public E remove(int index) {
            checkIndex(index);
            E removedElement = (E) elements[index];
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[--size] = null; // Убираем ссылку для сборщика мусора
            return removedElement;
        }

        /**
         * Получает элемент по индексу.
         * @param index индекс элемента
         * @return элемент по указанному индексу
         */
        public E get(int index) {
            checkIndex(index);
            return (E) elements[index];
        }

        /**
         * Устанавливает элемент по индексу.
         * @param index индекс элемента
         * @param element новый элемент
         * @return старый элемент по указанному индексу
         */
        public E set(int index, E element) {
            checkIndex(index);
            E oldElement = (E) elements[index];
            elements[index] = element;
            return oldElement;
        }

        /**
         * Возвращает подсписок от startIndex до endIndex.
         * @param startIndex начальный индекс
         * @param endIndex конечный индекс
         * @return подсписок
         */
        public MyArrayList<E> subList(int startIndex, int endIndex) {
            if (startIndex < 0 || endIndex > size || startIndex > endIndex) {
                throw new IndexOutOfBoundsException();
            }
            MyArrayList<E> subList = new MyArrayList<>();
            for (int i = startIndex; i < endIndex; i++) {
                subList.add((E) elements[i]);
            }
            return subList;
        }

        /**
         * Возвращает количество элементов в списке.
         * @return количество элементов
         */
        public int size() {
            return size;
        }

        private void ensureCapacity() {
            if (size >= elements.length) {
                Object[] newElements = new Object[elements.length * 2];
                System.arraycopy(elements, 0, newElements, 0, elements.length);
                elements = newElements;
            }
        }

        private void checkIndex(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
        }
    }


    /*Реализация LinkedList
    /**
     * Простая реализация LinkedList.
     */
    public static class MyLinkedList<E> {
        private class Node {
            E data;
            Node next;

            Node(E data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;
        private int size;

        public MyLinkedList() {
            head = null;
            size = 0;
        }

        /**
         * Добавляет элемент в конец списка.
         * @param element элемент, который нужно добавить
         */
        public void add(E element) {
            Node newNode = new Node(element);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        /**
         * Удаляет элемент по индексу.
         * @param index индекс элемента, который нужно удалить
         * @return удаленный элемент
         */
        public E remove(int index) {
            checkIndex(index);
            if (index == 0) {
                E removedElement = head.data;
                head = head.next;
                size--;
                return removedElement;
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                E removedElement = current.next.data;
                current.next = current.next.next;
                size--;
                return removedElement;
            }
        }

        /**
         * Получает элемент по индексу.
         * @param index индекс элемента
         * @return элемент по указанному индексу
         */
        public E get(int index) {
            checkIndex(index);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        /**
         * Устанавливает элемент по индексу.
         * @param index индекс элемента
         * @param element новый элемент
         * @return старый элемент по указанному индексу
         */
        public E set(int index, E element) {
            checkIndex(index);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            E oldElement = current.data;
            current.data = element;
            return oldElement;
        }

        /**
         * Возвращает подсписок от startIndex до endIndex.
         * @param startIndex начальный индекс
         * @param endIndex конечный индекс
         * @return подсписок
         */
        public MyLinkedList<E> subList(int startIndex, int endIndex) {
            if (startIndex < 0 || endIndex > size || startIndex > endIndex) {
                throw new IndexOutOfBoundsException();
            }
            MyLinkedList<E> subList = new MyLinkedList<>();
            Node current = head;
            for (int i = 0; i < startIndex; i++) {
                current = current.next;
            }
            for (int i = startIndex; i < endIndex; i++) {
                subList.add(current.data);
                current = current.next;
            }
            return subList;
        }

        /**
         * Возвращает количество элементов в списке.
         * @return количество элементов
         */
        public int size() {
            return size;
        }

        private void checkIndex(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
        }
    }
}
