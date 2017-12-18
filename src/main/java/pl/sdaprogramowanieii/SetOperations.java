package pl.sdaprogramowanieii;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

    public static void main(String[] args) {
        System.out.println("HashSet:");
        Set<String> hashSet = new HashSet<String>();
        fillSet(hashSet);
        showSet(hashSet);

        System.out.println("\nTreeSet:");
        //TODO dodać comparator porównujący długości łańcuchów
        //SizeComparator sizeComparator = new SizeComparator();
        Set<String> treeSet = new TreeSet<String>();
        fillSet(treeSet);
        //TODO Adam, Beata/Eliza, Celina, Dariusz, Franciszek
        showSet(treeSet);

        System.out.println("\nLinkedHashSet");
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        fillSet(linkedHashSet);
        showSet(linkedHashSet);
    }

    /**
     * Wyświetla wszystkie elementy zbioru korzystając z for-each
     *
     * @param set zbiór do wyświetlenia
     */
    private static void showSet(Set<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }

    /**
     * Wstawia do zbioru elementy: Adam, Beata, Celina, Dariusz, Eliza, Franciszek
     *
     * @param set zbiór do uzupełnienia
     */

    private static void fillSet(Set<String> set) {
        set.add("Adam");
        set.add("Celina");
        set.add("Beata");
        set.add("Franciszek");
        set.add("Eliza");
        set.add("Dariusz");
    }
}
