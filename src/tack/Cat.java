package tack;

public class Cat {
    public String name;
    public int age;
    public boolean isill;
    public String diagnozes;

    public Owner owner;

    public Cat(String name, int age, boolean isill, String diagnozes, Owner owner) {
        this.name = name;
        this.age = age;
        this.isill = isill;
        this.diagnozes = diagnozes;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("Cat {Name = %s, age = %s, isill = %s, diagnozes = %s, owner = %s}", name , age, isill,diagnozes,owner );//%d type to int
    }
}
