package tack;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Petrov Vasiliy", "+3726468");

        Cat cat = new Cat("Simba",13,true,"Linyaet",owner);
        System.out.println(cat);
    }
}
