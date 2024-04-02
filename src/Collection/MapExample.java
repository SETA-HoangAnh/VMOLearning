package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args){

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pho bo", 35000);
        hashMap.put("Com rang", 30000);
        hashMap.put("Bun cha", 40000);

        System.out.println(hashMap);
        System.out.println(hashMap.get("Bun cha"));
        System.out.println(hashMap.values());

        for(String i : hashMap.keySet()){

            System.out.println(i + " " + hashMap.get(i));
        }

        System.out.println(hashMap.containsKey("Mi xao"));
        System.out.println(hashMap.containsValue("50000"));
        System.out.println(hashMap.replace("Bun cha", 45000));
        System.out.println(hashMap.putIfAbsent("Bun oc", 25000));
        System.out.println(hashMap.remove("Bun oc"));
    }
}
