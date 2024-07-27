import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Array example
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println("Array elements:");
        for (int i : intArray) {
            System.out.println(i);
        }

        // ArrayList example
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);

        System.out.println("\nArrayList elements:");
        for (int i : intArrayList) {
            System.out.println(i);
        }

        // ArrayList can dynamically grow
        intArrayList.add(4);
        System.out.println("\nArrayList after adding an element:");
        for (int i : intArrayList) {
            System.out.println(i);
        }
    }
}
