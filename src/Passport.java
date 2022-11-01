import java.util.*;

public class Passport {
    private final int passportNumber;
    private  String surname;
    private  String name;
    private  String secondName;
    private String  dateOfBirth;

    public static List<Passport> listOfPassports = new ArrayList<Passport>();

    public Passport(int passportNumber, String surname, String name, String dateOfBirth) {
        this(passportNumber, surname, name, "Отчество отсутствует", dateOfBirth);
    }
    public Passport(int passportNumber, String surname, String name, String secondName, String dateOfBirth) {
        this.passportNumber = passportNumber;
        setSurname(surname);
        setName(name);
        setSecondName(secondName);
        setDateOfBirth(dateOfBirth);

    }

    public static void getPassportByNumber(int checkNumber) {
        for (Passport passport: listOfPassports) {
            if (checkNumber == passport.passportNumber) {
                System.out.println(passport);
            }
        }

    }

    public int getPassportNumber() {
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

    public static List<Passport> getListOfPassports() {
        return listOfPassports;
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
