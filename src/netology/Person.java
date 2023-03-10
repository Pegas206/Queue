package netology;

public class Person {
    public int getBilet() {
        return bilet;
    }

    public void setBilet(int bilet) {
        this.bilet = bilet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    protected int bilet;
    protected String name;
    protected String surname;

    public Person(String name, String surname, int bilet) {
        this.name = name;
        this.surname = surname;
        this.bilet = bilet;
    }
}
