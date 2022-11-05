package Passanger2022;
import java.util.ArrayList;

public class Passenger {
    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int age;

    public Passenger(String Title, String Name, String ID, String Phone, int age){
        this.Title = Title;
        this.Name = Name;
        this.ID = ID;
        this.Phone = Phone;
        this.age = age;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        if (title == "Mr" || title == "Mrs" || title == "Ms"){
            Title = title;
        }

        else{
            throw new IllegalArgumentException("Incorrect Title. Please enter 'Mr', 'Mrs', or 'Ms'.");
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            Name = name;
        }

        else{
            throw new IllegalArgumentException("Incorrect Entry, Name must contain at least 3 characters");
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        if(id.length() >= 10){
            this.ID = id;
        }

        else{
            throw new IllegalArgumentException("Incorrect Entry, ID must contain at least 10 characters");
        } 
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        if(phone.length() >= 7){
            this.Phone = phone;
        }

        else{
            throw new IllegalArgumentException("Incorrect Entry, Phone No. must contain at least 7 digits");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 16){
            this.age = age;
        }

        else{
            throw new IllegalArgumentException("Passenger is too young to fly");
        }
    }
}
