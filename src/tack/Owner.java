package tack;

public class Owner {
    public String name;
    public String phone;

    @Override
    public String toString() {
        return String.format("Owner {Name = %s, phone = %s}", name , phone);//%d type to int

    }

    public Owner(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}
