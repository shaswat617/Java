package CollectionsPrograms;

import java.util.*;

public class $1Collection {
    public static void main(String[] args) {
        List<Object> listInte = new ArrayList<>();
        //Parent p = new Child();
//        listInte = new LinkedList<>();
        listInte.add(10);
//        listInte.add('M');
//        listInte.add(2,"Good");
//        System.out.println(listInte);
//        List<Object> listInte2 = new ArrayList<>();
//        listInte2.add(11);
//        listInte2.add("HI");
//        listInte2.add(21.2);
//        listInte.addAll(listInte2);
//        System.out.println(listInte2);
//        System.out.println(listInte2.size());
//        listInte2.clear();
//        System.out.println(listInte2.size());
//        System.out.println(listInte.containsAll(listInte2));
//        System.out.println(listInte.iterator());
//        for (int i=0;i<listInte.size();i++){
//            System.out.println(listInte.get(i));
//        }
//        System.out.println("-------------------");
//        Iterator<Object> x = listInte.iterator();
//        while (x.hasNext()){
//            System.out.println(x.next());
//        }
//        System.out.println(listInte.remove(2));
//        System.out.println(listInte);

        listInte.add(0);
        listInte.add(2);
        listInte.add(12);
        listInte.add(2);
        listInte.add("Mamuni");
//        System.out.println(listInte.remove());
//        System.out.println(listInte);
//        System.out.println(listInte.set(3,"Shaswat"));
//        System.out.println(listInte);
//        System.out.println(listInte.indexOf(2));

        ListIterator<Object> x = listInte.listIterator(2);
        while (x.hasNext()){
            System.out.println(x.next());
        }
    }
}
