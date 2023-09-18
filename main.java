import java.util.HashMap;
import java.util.Map;

public class ElementCount {
    public static Map<Integer, Integer> countElements(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};

        Map<Integer, Integer> elementCountMap = countElements(arr);

        System.out.println(elementCountMap);
    }
}
