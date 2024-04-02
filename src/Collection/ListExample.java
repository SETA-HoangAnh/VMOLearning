package Collection;

import java.util.*;

public class ListExample {

    public static void main(String[] args){

        //List interface
        List<String> list = new ArrayList<String>();
//        ArrayList<String> arrayList = new ArrayList<String>();
//        LinkedList<String> linkedList = new LinkedList<String>();
//        HashSet<String> setA = new HashSet<String>();
//        Set<String> linkedHashSet = new LinkedHashSet<String>();
        list.add("java");
        list.add("python");
        list.add("C#");
        list.add("js");
        System.out.println("phần tử có index là 3: " + list.get(3));

        list.set(3, "fluter");
        System.out.println("phần tử có index là 3 sau set: " + list.get(3));
    }
}
