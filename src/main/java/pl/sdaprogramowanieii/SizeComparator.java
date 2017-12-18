package pl.sdaprogramowanieii;

import java.util.Comparator;

public class SizeComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        int diff = o1.length() - o2.length();
        if (diff != 0) {
            return diff;
        } else {
            return o1.compareTo(o2);
        }
    }
}
