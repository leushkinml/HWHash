import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private final String passportNumber;
    private  String surname;
    private  String name;
    private  String secondName;
    private String  dateOfBirth;

    private static Set<Passport> passports;

    public Passport(String passportNumber, String surname, String name, String dateOfBirth) {
        this(passportNumber, surname, name, "Отчество отсутствует", dateOfBirth);
    }
    public Passport(String passportNumber, String surname, String name, String secondName, String dateOfBirth) {
        this.passportNumber = passportNumber;
        setSurname(surname);
        setName(name);
        setSecondName(secondName);
        setDateOfBirth(dateOfBirth);

        passports = new HashSet<>();
    }

//    public  Passport getPassportByNumber(String checkNumber) {
//        for (Passport passport: passports) {
//            if (checkNumber.equals(getPassportNumber())) {
//                return passport;
//            }
//        }
//        return null;
//    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty() || surname.isBlank()) {
            throw new IllegalArgumentException("Заполните данные.");
        } else {
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните данные.");
        } else {
            this.name = name;
        }
    }

    public String getSecondName() {

        return secondName;
    }

    public void setSecondName(String secondName) {
        if (secondName == null || secondName.isEmpty() || secondName.isBlank()) {
            throw new IllegalArgumentException("Заполните данные.");
        } else {
            this.secondName = secondName;
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Заполните данные.");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return Objects.equals(getPassportNumber(), passport.getPassportNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassportNumber());
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
