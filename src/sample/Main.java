package sample;

import com.sun.javafx.scene.control.IntegerField;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.web.HTMLEditor;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Random;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
List list;
        ArrayList<List> cars = new ArrayList<List>();
String none = new String();
        SimpleStringProperty gone = new SimpleStringProperty();
        int k=0;
int coefficient=5000;
list = new Footballer.Builder()
.setData("Pele","Brazil",72,"forward",92,"R")
        .build();
Text forCount = new Text("0");
Text stadiumNumber = new Text();
Text managerName = new Text();
Text member = new Text();
Label mine= new Label();
Text text4445 =new Text();
        text4445.setText("0");
        Group root =new Group();
Text text67 = new Text();
Text budgetClub = new Text();
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));
        Text text=new Text(10,30,"Football Club Manager");
        text.setEffect(ds);
        text.setCache(true);
        text.setX(600.0f);
        text.setY(50.0f);
        text.setFill(Color.RED);

        text.setFont(Font.font(null, FontWeight.BOLD, 32));

        text.setFill(Color.GREEN);
        Text text1 = new Text();
        text1.setText("AliAsMuhAmi company Ⓒ");
        text1.setFill(Color.GREEN);
        text1.setX(600.0f);
        text1.setY(750.0f);
        text1.setFont(Font.font(null, FontWeight.BOLD, 32));




        Image image = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\color-11-512.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);

        Image image1= new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\color_2-30-512.png"));
        ImageView imageView1=new ImageView(image1);
        imageView.setX(1050);
        imageView.setY(25);
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);


//        WebView webView = new WebView();
//        WebEngine webEngine = webView.getEngine();
//        webEngine.loadContent("" +
//                "<input type='button' value='Create team'>" +
//                "");
//        HTMLEditor htmlEditor = new HTMLEditor();
//        htmlEditor.setPrefHeight(245);
//        Button showHTMLButton = new Button("Produce HTML Code");
//        TextArea textArea = new TextArea();
//        textArea.setWrapText(true);
//
//        //
//        showHTMLButton.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                textArea.setText(htmlEditor.getHtmlText());
//            }
//        });
//        BUTTON 1
       Button button =new Button("Create a club");
       button.setLayoutX(670);
       button.setLayoutY(90);
       button.setMinWidth(200);
        button.setMinHeight(50);

//        BUTTON 2

        Button button1 = new Button("     Footballer list     ");
        button1.setMinHeight(50);
        button1.setMinWidth(200);
        button1.setLayoutX(670);
        button1.setLayoutY(150);
        //        BUTTON 3
        Button button2 = new Button("     Club information     ");

        button2.setMinWidth(200);
        button2.setMinHeight(50);
        button2.setLayoutX(670);
        button2.setLayoutY(210);
        //        BUTTON 4
        Button button3 = new Button("   Provide a match   ");
        button3.setMinWidth(200);
        button3.setMinHeight(50);
        button3.setLayoutX(670);
        button3.setLayoutY(270);
        //        BUTTON 5

        Button button4 = new Button("          Budget          ");

        button4.setMinWidth(200);
        button4.setMinHeight(50);
        button4.setLayoutX(670);
        button4.setLayoutY(330);
        //        BUTTON 6
        Button button5 = new Button("Upgrade a stadium");

        button5.setMinWidth(200);
        button5.setMinHeight(50);
        button5.setLayoutX(670);
        button5.setLayoutY(390);

//        Image image2 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\untitled1\\PKz8.gif"));
//        ImageView imageView2=new ImageView(image2);
//        imageView.setX(1700);
//        imageView.setLayoutY(500);
//        imageView.setFitHeight(1);
//        imageView.setFitWidth(2);



        root.getChildren().add(text);
        root.getChildren().add(imageView);
        root.getChildren().add(imageView1);
        root.getChildren().add(button);
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);
        root.getChildren().add(button5);
        root.getChildren().add(text1);

//        root.getChildren().addAll(webView);
//        root.getChildren().addAll(htmlEditor,showHTMLButton);
//        root.getChildren().add(imageView2);

        primaryStage.setTitle("Football Club Manager");
        primaryStage.setScene(new Scene(root, 300, 275));



        primaryStage.show();

//CREATE A CLUB
        button.setOnAction(e->{
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setVgap(5);
            grid.setHgap(5);

//Defining the Name text field
            final TextField name = new TextField();
            name.setPromptText("Enter your club name.");
            name.setPrefColumnCount(10);
            name.getText();
            GridPane.setConstraints(name, 0, 0);
            grid.getChildren().add(name);
//Defining the Last Name text field
            final TextField lastName = new TextField();
            lastName.setPromptText("Enter your manager name.");
            GridPane.setConstraints(lastName, 0, 1);
            grid.getChildren().add(lastName);
//Defining the Comment text field
            final TextField comment = new TextField();
            comment.setPrefColumnCount(15);
            comment.setPromptText("Enter your Stadium size.");
            GridPane.setConstraints(comment, 0, 2);
            grid.getChildren().add(comment);
            //Budget
            final TextField budget = new TextField();
            budget.setPromptText("Enter your initial budget.");
            GridPane.setConstraints(budget, 0, 3);
            grid.getChildren().add(budget);
//Defining the Submit button
            Button submit = new Button("Submit");
            GridPane.setConstraints(submit, 1, 0);
            grid.getChildren().add(submit);
//Defining the Clear button
            Button clear = new Button("Back to main menu");
            GridPane.setConstraints(clear, 1, 1);
            grid.getChildren().add(clear);

            final Label label = new Label();
            GridPane.setConstraints(label, 0, 5);
            GridPane.setColumnSpan(label, 2);
            grid.getChildren().add(label);
//            grid.getChildren().add(button6);


//            Group root2 = new Group();
//            Label label = new Label("Your are now in the second form");
//            root2.getChildren().add(label);
//            Scene secondScene = new Scene(root2, 500,500);
            Scene scene=new Scene(grid,500,500);
            Stage secondStage = new Stage();
//            secondStage.setScene(secondScene); // set the scene
            secondStage.setScene(scene);
            secondStage.setTitle("CREATING A CLUB");
            secondStage.show();

            primaryStage.close(); // close the first stage (Window)



            clear.setOnAction(eaafafaf->{
                secondStage.close();
                primaryStage.show();
            });
            submit.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e) {
                    if ((comment.getText() != null && !comment.getText().isEmpty())) {
                        label.setText(
                                 "Thank you for your filling!");
                    } else {
                        label.setText("You have  left some fields.");
                    }
                    name.copy();
                    text67.setText(name.getText());
                    budgetClub.setText(budget.getText());
                    stadiumNumber.setText(comment.getText());
                    managerName.setText(lastName.getText());


                }
            });

//Setting an action for the Clear button
//            clear.setOnAction(new EventHandler<ActionEvent>() {
//
//                @Override
//                public void handle(ActionEvent e) {
//                    name.clear();
//                    lastName.clear();
//                    comment.clear();
//                    label.setText(null);
//                }
//            });
        });
        Image image2 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\criro.jpg"));
        Circle circle =new Circle();
        Image image3 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\messi.jpg"));
        Image image4 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\debruyne.jpg"));
        Image image5 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\de ligt.jpg"));
        Image image6 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\oblak.jpg"));
        //FOOTBALLER LIST
        button1.setOnAction(e->{

            //primaryStage.close(); // you can close the first stage from the beginning

            // create the structure again for the second GUI
            // Note that you CAN use the previous root and scene and just create a new Stage
            //(of course you need to remove the button first from the root like this, root.getChildren().remove(0); at index 0)
            Group root3 = new Group();
            Button label = new Button("Back to main menu");
            label.getScaleY();
//            Image image6 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\color_2-30-512.png"));
            ImageView imageView2 =new ImageView(image2);
            ImageView imageView3 = new ImageView(image3);
            ImageView imageView4 = new ImageView(image4);
            ImageView imageView5 = new ImageView(image5);
            ImageView imageView6 = new ImageView(image6);
            Label label65 = new Label();

            Text text89 = new Text();
            Label label1=new Label("Cristiano Ronaldo, Portuguese,35 years old,forward");
            label1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            label1.setTextFill(Paint.valueOf("red"));
            //----------------------
            Label label2 = new Label("Lionel Messi, Argentina,32 years old,forward");
            label2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            label2.setTextFill(Paint.valueOf("red"));
            //----------------------
            Label label3 = new Label("Kevin De Bruyne, Belgium,29 years old,midfielder");
            label3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            label3.setTextFill(Paint.valueOf("yellow"));
            //----------------------
            Label label4 = new Label("De Ligt, Netherlands,20 years old,defender");
            label4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            label4.setTextFill(Paint.valueOf("green"));
            //----------------------
            Label label5 = new Label("Jan Oblak, Slovenia,30 years old,goalkeeper");
            label5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            label5.setTextFill(Paint.valueOf("darkblue"));
circle.clipProperty();
Text text2 = new Text("TOP footballers of the world!!!");
text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
text2.setFill(Color.RED);
text2.setX(150);
text2.setY(30);
            //ronaldo
            imageView2.setX(100);
            imageView2.setY(50);
            imageView2.setFitWidth(100);
            imageView2.setFitHeight(100);
            label1.setLayoutX(250);
            label1.setLayoutY(80);
            //messi
            imageView3.setX(100);
            imageView3.setY(200);
            imageView3.setFitWidth(100);
            imageView3.setFitHeight(100);
            label2.setLayoutX(250);
            label2.setLayoutY(230);
            //de bruyne
            imageView4.setX(100);
            imageView4.setY(350);
            imageView4.setFitWidth(100);
            imageView4.setFitHeight(100);
            label3.setLayoutX(250);
            label3.setLayoutY(380);
            //de ligt
            imageView5.setX(100);
            imageView5.setY(500);
            imageView5.setFitWidth(100);
            imageView5.setFitHeight(100);
            label4.setLayoutX(250);
            label4.setLayoutY(530);
            //Oblak
            imageView6.setX(100);
            imageView6.setY(650);
            imageView6.setFitWidth(100);
            imageView6.setFitHeight(100);
            label5.setLayoutX(250);
            label5.setLayoutY(680);

            Label label6=new Label("Footballer name:");
            Label label7 = new Label("Country:");
            label6.setLayoutX(1200);
            label6.setLayoutY(50);
            label7.setLayoutX(1200);
            label7.setLayoutY(110);
            Label label8 = new Label("Age:");
            label8.setLayoutX(1200);
            label8.setLayoutY(170);
            Label label9 = new Label("Position:");
            label9.setLayoutX(1200);
            label9.setLayoutY(230);
            Label label10 = new Label("Playing Foot:");
            label10.setLayoutX(1200);
            label10.setLayoutY(290);
            Label label11 = new Label("FIFA Rating:");
            label11.setLayoutX(1200);
            label11.setLayoutY(350);
            TextField textField =new TextField();
            textField.setLayoutX(1200);
            textField.setLayoutY(80);
            TextField textField1=new TextField();
            textField1.setLayoutX(1200);
            textField1.setLayoutY(140);
            TextField textField2=new TextField();
            textField2.setLayoutX(1200);
            textField2.setLayoutY(200);
            TextField textField3=new TextField();
            textField3.setLayoutX(1200);
            textField3.setLayoutY(260);
            TextField textField4=new TextField();
            textField4.setLayoutX(1200);
            textField4.setLayoutY(320);
            TextField textField5=new TextField();
            textField5.setLayoutX(1200);
            textField5.setLayoutY(380);
            Button create = new Button("Create a footballer");
            create.setLayoutY(410);
            create.setLayoutX(1200);


            root3.getChildren().add(label);
            root3.getChildren().add(imageView2);
            root3.getChildren().add(imageView3);
            root3.getChildren().add(imageView4);
            root3.getChildren().add(imageView5);
            root3.getChildren().add(imageView6);
            root3.getChildren().add(label1);
            root3.getChildren().add(label2);
            root3.getChildren().add(label3);
            root3.getChildren().add(label4);
            root3.getChildren().add(label5);
            root3.getChildren().add(label6);
            root3.getChildren().add(label7);
            root3.getChildren().add(label8);
            root3.getChildren().add(label9);
            root3.getChildren().add(label10);
            root3.getChildren().add(label11);
            root3.getChildren().add(text2);
            root3.getChildren().add(textField);
            root3.getChildren().add(textField1);
            root3.getChildren().add(textField2);
            root3.getChildren().add(textField3);
            root3.getChildren().add(textField4);
            root3.getChildren().add(textField5);
            root3.getChildren().add(create);
//            root3.getChildren().add();
            Scene thirdScene = new Scene(root3, 500,500);
            Stage thirdStage = new Stage();
            thirdStage.setScene(thirdScene); // set the scene
            thirdStage.setTitle("FOOTBALLER LIST");
            thirdStage.show();
            primaryStage.close(); // close the first stage (Window)
            label.setOnAction(a->{
                thirdStage.close();
                primaryStage.show();
            });
            create.setOnAction(ge->{
                int first =Integer.parseInt(textField2.getText());
                int second = Integer.parseInt(textField5.getText());
                Footballer list1 =new Footballer.Builder()
                        .setData(textField.getText(),textField1.getText(),first,textField3.getText(),second,textField4.getText())
                        .build();
//                ObservableList<List> people = FXCollections.observableArrayList(
//                         new Footballer.Builder()
//                                .setData(textField.getText(),textField1.getText(),first,textField3.getText(),second,textField4.getText())
//                                .build()
//
//                );





                int sale = Integer.parseInt(forCount.getText());
                sale =sale +1;
                forCount.setText(""+sale);

                Label text3 = new Label(list1.showInfo());
//                member.setText(textField.getText()+", "+textField1.getText()+", "+first+" years old,with "+textField4.getText()+" skill "+textField3.getText()+", rating in FIFA is "+second+" .This footballer is in your club");
//                gone.set(list1.country);
                member.setText(list1.showInfo());
                text4445.setText("Number of footballers in your club "+sale);

//                TableView<List> table = new TableView<List>(people);
            });
        });
        //CLUB INFORMATION
        button2.setOnAction(e->{
            Button button6 = new Button("Back to main menu");

            //primaryStage.close(); // you can close the first stage from the beginning

            // create the structure again for the second GUI
            // Note that you CAN use the previous root and scene and just create a new Stage
            //(of course you need to remove the button first from the root like this, root.getChildren().remove(0); at index 0)
            Group root4 = new Group();
            Text text6=new Text("Club name: "+text67.getText());
            String string = new String("fsfsf");
            Text text2 = new Text("Manager name: "+managerName.getText());
            Text text3 = new Text("Your stadium can place "+stadiumNumber.getText()+" people at once.");
            Text text4 = new Text("Your budget: "+budgetClub.getText()+"$.");
            Text text578978 = new Text(member+" is added to your club!!!");

            text6.setY(50);
            text6.setX(100);
            text2.setY(80);
            text2.setX(100);
            text3.setY(110);
            text3.setX(100);
            text4.setY(140);
            text4.setX(100);
            member.setX(100);
            member.setY(170);
            text4445.setX(100);
            text4445.setY(200);
            text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            text3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            text4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            text6.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            member.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
            text4445.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

            for (int i=0;i<cars.size();i++){
               cars.get(i);
            }

            root4.getChildren().add(text4445);
            root4.getChildren().add(text6);
            root4.getChildren().add(text2);
            root4.getChildren().add(text3);
            root4.getChildren().add(text4);
            root4.getChildren().add(member);
            root4.getChildren().add(button6);


            Scene fourthScene = new Scene(root4, 500,500);

            Stage fourthStage = new Stage();
            fourthStage.setScene(fourthScene); // set the scene
            fourthStage.setTitle("CLUB INFORMATION");
            fourthStage.show();
            primaryStage.close(); // close the first stage (Window)
            button6.setOnAction(a->{
                fourthStage.close();
                primaryStage.show();
            });
        });
        //PROVIDE A MATCH
        button3.setOnAction(e->{
            //primaryStage.close(); // you can close the first stage from the beginning

            // create the structure again for the second GUI
            // Note that you CAN use the previous root and scene and just create a new Stage
            //(of course you need to remove the button first from the root like this, root.getChildren().remove(0); at index 0)
            Group root5 = new Group();
            Button label = new Button("Back to main menu");
            Button button8 = new Button("Play a match");
            Label label1=new Label("");
            Label label2= new Label("");
            Label label3 = new Label("");
            Label label4 = new Label("Your footballers are ready!!!");
            Label label5 = new Label();
            button8.setLayoutX(200);
            label4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
            label4.setLayoutX(400);
            label4.setLayoutY(200);

            label2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 80));
            label2.setLayoutX(800);
            label2.setLayoutY(350);

            label1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 60));
            label1.setLayoutX(420);
            label1.setLayoutY(370);

            label3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 60));
            label3.setLayoutX(850);
            label3.setLayoutY(370);

            label5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 60));
            label5.setLayoutX(750);
            label5.setLayoutY(370);

            //ROOT
            root5.getChildren().add(label);
            root5.getChildren().add(button8);
            root5.getChildren().add(label4);
            root5.getChildren().add(label2);
            root5.getChildren().add(label3);
            root5.getChildren().add(label1);
            root5.getChildren().add(label5);
            Scene fifthScene = new Scene(root5, 500,500);
            Stage fifthStage = new Stage();
            fifthStage.setScene(fifthScene); // set the scene
            fifthStage.setTitle("PROVIDE A MATCH");
            fifthStage.show();
            primaryStage.close(); // close the first stage (Window)
            label.setOnAction(a->{
                fifthStage.close();
                primaryStage.show();
            });
            button8.setOnAction(q->{
                Random rand=new Random(System.currentTimeMillis());
                int first = rand.nextInt(7);
                int second= rand.nextInt(7);
                label1.setText(  text67.getText());
                label3.setText( second+" Opponent Team");
                label2.setText(":");
                label4.setText("GREAT! Your team is provided a match!");
                label5.setText(""+first);
                int i=Integer.parseInt(budgetClub.getText());
                i=i+coefficient;
                budgetClub.setText(""+i);
            });
        });
        //BUDGET
        button4.setOnAction(e->{
            //primaryStage.close(); // you can close the first stage from the beginning

            // create the structure again for the second GUI
            // Note that you CAN use the previous root and scene and just create a new Stage
            //(of course you need to remove the button first from the root like this, root.getChildren().remove(0); at index 0)
            Group root6 = new Group();
            Button label = new Button("Back to main menu");
            Label label1 = new Label(budgetClub.getText()+" $");
            label1.setLayoutX(700);
            label1.setLayoutY(250);
            label1.setTextFill(Color.GREEN);
            label1.setFont(Font.font(null, FontWeight.BOLD, 60));
            root6.getChildren().add(label);
            root6.getChildren().add(label1);
            Scene sixthScene = new Scene(root6, 500,500);
            Stage sixthStage = new Stage();
            sixthStage.setScene(sixthScene); // set the scene
            sixthStage.setTitle("BUDGET");
            sixthStage.show();
            primaryStage.close(); // close the first stage (Window)
            label.setOnAction(a->{
                sixthStage.close();
                primaryStage.show();
            });
        });
        //UPGRADE A STADIUM
        Image image554 = new Image(new FileInputStream("C:\\Users\\Мухаммед\\IdeaProjects\\Sport project\\santi.jpg"));
        button5.setOnAction(e->{
            //primaryStage.close(); // you can close the first stage from the beginning

            // create the structure again for the second GUI
            // Note that you CAN use the previous root and scene and just create a new Stage
            //(of course you need to remove the button first from the root like this, root.getChildren().remove(0); at index 0)
            Group root7 = new Group();
            TextField stadiumSize = new TextField();
            stadiumSize.setText(stadiumNumber.getText());
            ImageView imageView2 = new ImageView(image554);
            imageView2.setFitHeight(800);
            imageView2.setFitWidth(1600);
            imageView2.setY(200);
            Button button6 = new Button("Upgrade");
            stadiumSize.setLayoutX(350);
            stadiumSize.setLayoutY(20);
            button6.setLayoutX(550);
            button6.setLayoutY(20);
            Button label = new Button("Back to main menu");
            Label label1 = new Label();
            label1.setLayoutY(20);
            label1.setLayoutX(700);


            root7.getChildren().add(label);
            root7.getChildren().add(label1);
            root7.getChildren().add(imageView2);
            root7.getChildren().add(stadiumSize);
            root7.getChildren().add(button6);
            Scene seventhScene = new Scene(root7, 500,500);
            Stage seventhStage = new Stage();
            seventhStage.setScene(seventhScene); // set the scene
            seventhStage.setTitle("UPGRADE A STADIUM");
            seventhStage.show();
            primaryStage.close(); // close the first stage (Window)
            label.setOnAction(a->{
                seventhStage.close();
                primaryStage.show();
            });
            button6.setOnAction(h->{
                stadiumNumber.setText(stadiumSize.getText());
                int ake =Integer.parseInt(budgetClub.getText());
                ake-=10000;
                budgetClub.setText(""+ake);
                label1.setText("Stadium is upgraded successfully");

            });
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
