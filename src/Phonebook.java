import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Phonebook {
    private final String nameSurname;
    private  String phoneNumber;

    private static HashMap<String,String> phoneBook = new HashMap<>();

    public Phonebook(String nameSurname, String phoneNumber) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;

    }



    //    public static void addUserInList(String nameSurname, String phoneNumber) {
//        if (manPhonen.put(nameSurname, phoneNumber)) {
//            return;
//        }
//        throw new RuntimeException("Такой продукт \"" + newProduct.name + "\" уже есть!");
//    }
    public String getNameSurname() {
        return nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phonNumber) {
        this.phoneNumber = phonNumber;
    }

    public static HashMap<String, String> getMap() {
        return phoneBook;
    }

//    public static void setMap(HashMap<String, String> map) {
//        Phonebook.phoneBook = map;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phonebook)) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(getNameSurname(), phonebook.getNameSurname()) && Objects.equals(getPhoneNumber(), phonebook.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameSurname(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "nameSurname='" + nameSurname + '\'' +
                ", phonNumber='" + phoneNumber + '\'' +
                '}';
    }
}
