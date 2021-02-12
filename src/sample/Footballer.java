package sample;
import javafx.beans.property.*;

 public class Footballer extends List {

public Footballer(String name,String country,int age,String position,int rating,String foot){
    super(name,country,age,position,rating,foot);
}
public static class Builder{
    private String name;
    private String country;
    private int age;
    private String position;
    private int rating;
    private String foot;
    public Builder(){}
    public Builder setData(String name,String country,int age,String position,int rating,String foot){
      this.name=name;
      this.country=country;
      this.age=age;
      this.position=position;
      this.rating=rating;
      this.foot=foot;
      return this;
    }
public Footballer build(){
return new Footballer(name,country,age,position,rating,foot);
}
}

     @Override
     public String showInfo() {
         return super.showInfo();
     }
 }
