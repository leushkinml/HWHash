import java.util.*;

public class MillionSityTable {
    private static final Map<Integer, String> sities = new HashMap<>();
//    private static Set<Integer> setOfIndex = new HashSet<>();

    public static void main(String[] args) {

        sities.put(1,"Москва");
        sities.put(2,"Санкт-Петербург");
        sities.put(3,"Новосибирск");
        sities.put(4,"Екатеринбург");
        sities.put(5,"Нижний Новгород");
        sities.put(6,"Казань");
        sities.put(7,"Самара");
        sities.put(8,"Челябинск");
        sities.put(9,"Омск");
        sities.put(10,"Ростов-на-Дону");
        sities.put(11,"Уфа");
        sities.put(12,"Красноярск");
        sities.put(13,"Пермь");
        sities.put(14,"Волгоград");
        sities.put(15,"Воронеж");
        sities.put(16,"Краснодар");

        addSityInList();
    }
        public static void addSityInList() {
            Set<Integer> setOfIndex = new LinkedHashSet<>();
            Random random = new Random();
            int i = 0;
            System.out.println(" initial i = " + i);

            while (i < 10) {
                int number = random.nextInt(15)+1;
                System.out.println("сгенерированное number = " + number);
                System.out.println("i в цикле = " + i);
                if (!setOfIndex.contains(number)) {
                    setOfIndex.add(number);
                    i++;
                }
                System.out.println("Получившийся setOfIndex = " + setOfIndex);
                System.out.println();
            }

            System.out.println("Укажите население города: ");
            int count = 1;
            for (Integer index : setOfIndex) {
                System.out.println(index);

              System.out.println(count + ". " + sities.get(index) + " =");
             count ++;
            }
        }
}
