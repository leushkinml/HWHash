import java.util.*;

public class MultiTable {
    private static final Map<Integer, String> multiplications = new HashMap<>();

    public static void main(String[] args) {

        multiplications.put(0,"2*2");
        multiplications.put(1,"2*3");
        multiplications.put(2,"2*4");
        multiplications.put(3,"2*5");
        multiplications.put(4,"2*3");
        multiplications.put(5,"2*4");
        multiplications.put(6,"2*5");
        multiplications.put(7,"2*6");
        multiplications.put(8,"2*7");
        multiplications.put(9,"2*8");
        multiplications.put(10,"2*9");
        multiplications.put(11,"3*3");
        multiplications.put(12,"3*4");
        multiplications.put(13,"3*5");
        multiplications.put(14,"3*6");
        multiplications.put(15,"3*7");
        multiplications.put(16,"3*8");
        multiplications.put(17,"3*9");
        multiplications.put(18,"4*4");
        multiplications.put(19,"4*5");
        multiplications.put(20,"4*6");
        multiplications.put(21,"4*7");
        multiplications.put(22,"4*8");
        multiplications.put(23,"4*9");
        multiplications.put(24,"5*5");
        multiplications.put(25,"5*6");
        multiplications.put(26,"5*7");
        multiplications.put(27,"5*8");
        multiplications.put(28,"5*9");
        multiplications.put(29,"6*6");
        multiplications.put(30,"6*7");
        multiplications.put(31,"6*8");
        multiplications.put(32,"6*9");
        multiplications.put(33,"7*7");
        multiplications.put(34,"7*8");
        multiplications.put(35,"7*9");
        multiplications.put(36,"8*8");
        multiplications.put(37,"8*9");
        multiplications.put(38,"9*9");

        addMultiplicationsInTask();
    }
        public static void addMultiplicationsInTask() {
            Random random = new Random();
            Set<Integer> setOfIndex = new HashSet<>();
            int i = 0;
            while (i < 15) {
                setOfIndex.add(random.nextInt(38));
                i ++;
            }

//            for (int i = 0; i < 15; i++) {
//                setOfIndex.add(random.nextInt(38));
//            }
            System.out.println();
            System.out.println("Решите примеры:");
            int count = 1;
            for (Integer index : setOfIndex) {
             System.out.println(count + ". " + multiplications.get(index) + " =");
             count ++;
            }
        }
}
