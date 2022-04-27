package HW_week_2;

public class Person {
    String name;
    String adress;
    String phoneNumber;
    String email;

    public Person(String name, String adress, String phoneNumber, String email){
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString(){
        return "Person " + this.name;
    }
}
