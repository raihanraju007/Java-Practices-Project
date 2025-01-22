package map_hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap();
//        Map<String, Integer> students = new Hashtable<>();

        students.put("Raihan",95);
        students.put("Raju",98);
        students.put("Rimi",99);
        students.put("Mahmuda",50);
        students.put("Khan",60);
        students.put("Mafuz",40);

        System.out.println(students.keySet());

        for (String key : students.keySet()){
            System.out.println(key +" : " + students.get(key));
        }
    }
}
