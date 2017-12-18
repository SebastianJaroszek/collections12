package pl.sdaprogramowanieii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int n = 100000;
        List<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Czasy dla LinkedList:");
        performTests(linkedList, n);

        List<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Czasy dla ArrayList:");
        performTests(arrayList, n);
    }

    public static void performTests(List<Integer> list, int n) {
        long startTime = System.currentTimeMillis();
        fillList(list, n);
        long endTime = System.currentTimeMillis();
        System.out.println("fillList: " + (endTime - startTime) + " milisekund");

        startTime = System.currentTimeMillis();
        readList(list, n);
        endTime = System.currentTimeMillis();
        System.out.println("readList: " + (endTime - startTime) + " milisekund");

        startTime = System.currentTimeMillis();
        clearList(list, n);
        endTime = System.currentTimeMillis();
        System.out.println("clearList: " + (endTime - startTime) + " milisekund");
    }

    public static void fillList(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add(0, i);
        }
    }

    public static void clearList(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.remove(0);
        }
    }

    public static void readList(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            int tmp = list.get(i);
        }
    }
}
