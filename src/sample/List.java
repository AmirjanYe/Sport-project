package sample;
import javafx.beans.property.*;
import javafx.scene.text.Text;

abstract public class List {
    public String name;
    public String country;
    public int age;
    public String position;
    public int rating;
    public String foot;



    public List(String name, String country, int age, String position, int rating, String foot){
        this.name=name;
        this.country= country;
        this.age=age;
        this.position=position;
        this.rating=rating;
        this.foot=foot;
    }
    public String showInfo(){
        return this.name+", "+this.country+", "+this.age+" years old,with "+this.foot+" skill "+this.position+", rating in FIFA is "+this.rating;
    }

}
