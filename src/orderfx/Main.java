/**
  Name: Ramneek Kaur
  Student ID: 991555460
  Assignment 2
  Date: February 26,2020
*/

package orderfx;

import content.DisplayOrder;
import content.Order;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    private Label idlbl = new Label("Order ID:");
    private TextField idtxt = new TextField();
    
    private Label fnlbl = new Label("First Name: ");
    private TextField fntxt = new TextField();
    
    private Label lnlbl = new Label("Last Name:\t");
    private TextField lntxt = new TextField();
   
    private Label citylbl = new Label("City:");
    private TextField citytxt = new TextField();
    
    
     private Label lblmakeorder=new Label("Click product ");
     private Label lblmakeorder1=new Label("to make orders:");
    
    private Rectangle rect = new Rectangle(0,0,59,59);
   
    private Circle circle = new Circle(30);
     
   private ImageView img = new ImageView("content/img.jpg");
      
   private  ImageView img1 = new ImageView("content/img2.jpg");
     
     private Button btnDisplay = new Button("Display");
     private Order one = new Order();
    // private DisplayOrder two = new DisplayOrder(one);
    private TextField circletxt = new TextField();
        private TextField imgtxt = new TextField();
     private TextField recttxt = new TextField();
    private  TextField img1txt = new TextField();
   
   
    @Override
    public void start(Stage primaryStage) {
        
        btnDisplay.setOnAction((e)->{
        show();
        DisplayOrder ds = new DisplayOrder(one);
        ds.setTitle("Display - Orders");
        ds.show();
        
        });
        img.setOnMouseClicked((e)-> {
            one.setNum2();
            imgtxt.setText(""+one.getNum2());
        });
         img1.setOnMouseClicked((e)-> {
            one.setNum3();
            img1txt.setText(""+one.getNum3());
        });
        rect.setOnMouseClicked((e)-> {
            one.setNum();
            recttxt.setText(""+one.getNum());
        });
        circle.setOnMouseClicked((e)-> {
            one.setNum1();
            circletxt.setText(""+one.getNum1());
        });
       
         
       
        
        Scene scene = new Scene(getGrid());
        primaryStage.setScene(scene);
         img.setFitHeight(60);
         img.setFitWidth(60);
         
         img1.setFitHeight(60);
         img1.setFitWidth(60);
      rect.setFill(Color.ROYALBLUE);
      circle.setFill(Color.PEACHPUFF);
        rect.setStrokeWidth(1);
        circle.setStrokeWidth(1);
          rect.setStroke(Color.BROWN);
        circle.setStroke(Color.BROWN);
        primaryStage.setTitle("Assignment 2");
                
      primaryStage.setWidth(725);
        primaryStage.setHeight(600);
        primaryStage.show();
     
    }
    private GridPane getGrid(){
GridPane pane = new GridPane();

         pane.add(idlbl,0,0);  
         pane.add(idtxt,1,0);
         pane.add(citylbl,3,0);
         pane.add(citytxt,4,0);
         pane.add(fnlbl,0,2);
         pane.add(fntxt,1,2);
         pane.add(lnlbl,3,2);
         pane.add(lntxt,4,2);
         pane.add(lblmakeorder,0,4);
         pane.add(lblmakeorder1,1,4);
         pane.add(rect,0,6);
         pane.add(recttxt,1,6);
         pane.add(circle,0,8);
         pane.add(circletxt,1,8);
         pane.add(img,3,6);
         pane.add(imgtxt,4 ,6);
         pane.add(img1,3,8);
         pane.add(img1txt,4,8);
         pane.add(btnDisplay,2,10);
         
         return pane;

    }
    private void show(){
String firstname = fntxt.getText();
String orderid = idtxt.getText();
String lastname = lntxt.getText();
String city = citytxt.getText();
one.setFirstName(firstname);
one.setCity(city);
one.setOrderID(orderid);
one.setLastName(lastname);


}
 
    public static void main(String[] args) {
        launch(args);
    }
    
}
