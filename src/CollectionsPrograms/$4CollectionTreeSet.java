package CollectionsPrograms;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class $4CollectionTreeSet {
    public static void main(String[] args) {
        SortedSet<Object> s1 = new TreeSet<>();
        s1.add(12);
        s1.add(22);
//        s1.add("hi");
//        s1.add("Hello");
        TreeSet<Object> t1 = new TreeSet<>(s1);
        System.out.println(t1);
        double d = 10;
        System.out.println(d);
        int d1 = (int) 10.2;
        System.out.println(d1);
    }
}
