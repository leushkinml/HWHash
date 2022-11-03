import java.util.HashMap;
import java.util.Map;

public class Training {

    private static Map<String, Integer> freshMap = new HashMap<>();

    public static void main(String[] args) {
        freshMap.put("First", 111);
        freshMap.put("Second", 222);
        freshMap.put("Third", 333);
        freshMap.put("Forth", 444);
        System.out.println(freshMap);

        System.out.println();
        freshMap.put("First", 555);
        System.out.println(freshMap);

//        addToMap("First", 555);

    }
    public static void addToMap(String str, Integer count) {
        if (freshMap.containsKey(str) && freshMap.get(str).equals(count)) {
            // Если такой ключ есть, тогда мы можем вызвать у этого значения метод equals
            // и если у этого ключа значение эквивалентно, то тогда выбрасываем исключение и не добавляем.
            // !!! Не использовать freshMap.containsValue(count), так как он будет проверять все значения,
            // а нам нужно только проверить значение у конкретного ключа.
            throw new RuntimeException("Нет возможности добавить");
        }
        freshMap.put(str, count);
    }

}
