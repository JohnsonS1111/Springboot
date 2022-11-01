package Passanger2022;

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
}
