package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public void setFirstName(String firstName) {
        if (checkName(firstName)) {
            throw new NameUndefinedException("Nieprawidłowe imię");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (checkName(lastName)) {
            throw new NameUndefinedException("Nieprawidłowe naziwsko");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (checkAge(age)) {
            throw new IncorrectAgeException("Nieprawidłowy wiek");
        }
        this.age = age;
    }

    private boolean checkName(String firstName) {
        return firstName == null || firstName.length() < 2;
    }

    private boolean checkAge(int age) {
        return age < 1;
    }
}
