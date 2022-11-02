import java.util.*;

public class MapTest {


    private static final Map<String, List<Integer>> mapFrom = new HashMap<>();
    private static final Map<String, Integer> mapTo = new HashMap<>();



    public static void main(String[] args) {
        Random random = new Random();
        List listOne = new ArrayList<>(List.of());
        for (int i = 0; i < 3; i++) {
            listOne.add(random.nextInt(1000));
        }
        List listTwo = new ArrayList<>(List.of());
        for (int i = 0; i < 3; i++) {
            listTwo.add(random.nextInt(1000));
        }
        List listThree = new ArrayList<>(List.of());
        for (int i = 0; i < 3; i++) {
            listThree.add(random.nextInt(1000));
        }
        mapFrom.put("List 1", listOne);
        mapFrom.put("List 2", listTwo);
        mapFrom.put("List 3", listThree);
        mapFrom.put("List 4", new ArrayList<>(List.of(55, 55, 55)));
        mapFrom.put("List 5", new ArrayList<>(Arrays.asList(21,22,23)));

        System.out.println(mapFrom);


        // Второй вариант через Entry
//        for (Map.Entry<String, List<Integer>> entry : mapFrom.entrySet()) {
//            Integer sum = 0;
//            List<Integer> tempList = entry.getValue();
//            for (Integer integerSum : tempList) {
//                sum += integerSum;
//            }
//            mapTo.put(entry.getKey(), sum);
//        }
        System.out.println(mapTo);
    }
}
