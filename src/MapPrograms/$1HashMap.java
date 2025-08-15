package MapPrograms;

import java.util.HashMap;
import java.util.Map;

public class $1HashMap {
    public static void main(String[] args) {
        Map<Object, Object> hm = new HashMap<>();
        hm.put("Mamuni",95);
        System.out.println(hm);
        System.out.println(hm.put("Mamuni",100));  //return old value only
        hm.put("Mamuni",98);
        System.out.println(hm);
        hm.put("Mamuni",null);
        System.out.println(hm);
        hm.put("Swaroop",null);
        System.out.println(hm);
        hm.put(null,123);
        System.out.println(hm);
        hm.put(null,124);
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
    }
}
