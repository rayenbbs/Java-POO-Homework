package ArrayList;

public class CustomArrayList {
    private Object[] arr;
    private int size = 0;
    private int maxSize = 10;

    public CustomArrayList() {
        arr = new Object[maxSize];
    }

    public CustomArrayList(int initialSize) {
        maxSize = initialSize;
        arr = new Object[maxSize];
    }

    boolean isIn(Object x) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(x)) {
                return true;
            }
        }
        return false;
    }
    public void add(Object obj) {
        if (size == maxSize - 1) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        arr[size] = obj;
        size++;
        System.out.println("Object added successfully");
    }

    public void add(int index, Object x) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        if (size == maxSize - 1) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        size++;
        System.out.println("Object added successfully");
    }
    void remove(Object x) {
        int index = find(x);
        if (index == -1) {
            throw new IllegalArgumentException("404 not found");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Object removed successfully");
    }
    public Object get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
        return arr[index];
    }

    public int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }



    int find(Object x) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        list1.add("tofeha");
        list1.add("banana");
        list1.add("cerise");
        list1.add("degla");

        CustomArrayList list2 = new CustomArrayList(20);
        list2.add(4);
        list2.add(6);

        System.out.println("Size of list1: " + list1.size());
        System.out.println("Size of list2: " + list2.size());
        System.out.println("'cerise' in list1? " + list1.isIn("cerise"));
        System.out.println("8 in list2? " + list2.isIn(8));
        System.out.println("Pos of 'banana' in list1: " + list1.find("banana"));
        System.out.println("Pos of 7 in list2: " + list2.find(7));
        System.out.println("list2 empty? " + list2.isEmpty());
        list2.remove(6);
        list2.remove(4);
        System.out.println("list2 empty? " + list2.isEmpty());
    }


}
