package CollectionsPrograms;

import java.util.*;

public class $2CollectionStack {
    public static void main(String[] args) {
        Stack<Object> s1 = new Stack<>();
        System.out.println(s1.size());
        Vector<Object> v = new Vector<>();
        Enumeration<Object> e = v.elements();
        List<Object> l1 = new ArrayList<>();
        Iterator<Object> i = l1.iterator();
        ListIterator<Object> i1 = l1.listIterator();
        Collection<Object> c1 = (Collection<Object>) l1.iterator();
    }
}
