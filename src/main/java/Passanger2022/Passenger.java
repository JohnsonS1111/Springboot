package Passanger2022;
import java.util.ArrayList;

public class Passenger {
    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public Passenger(String title, String name, String id, String phone, int age){
        this.title = title;
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == "Mr" || title == "Mrs" || title == "Ms"){
            this.title = title;
        }

        else{
            throw new IllegalArgumentException("Incorrect Title. Please enter 'Mr', 'Mrs', or 'Ms'.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            name = name;
        }
//
        else{
            throw new IllegalArgumentException("Incorrect Entry, Name must contain at least 3 characters");
        }
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        if(id.length() >= 10){
            this.id = id;
        }

        else{
            throw new IllegalArgumentException("Incorrect Entry, ID must contain at least 10 characters");
        } 
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length() >= 7){
            this.phone = phone;
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
 