/**
  Name: Ramneek Kaur
  Student ID: 991555460
  Assignment 2
  Date: February 26,2020
*/
package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayOrder extends Stage{
    private Scene getScene(Order one){
        String firstname = "First Name: "+one.getFirstName();
String orderid = "OrderID: " + one.getOrderID();
String lastname = "Last Name: "+one.getLastName();
String city = "City: "+one.getCity();
String first ="Number of First product: "+ one.getNum();
String second ="Number of Second product: "+ one.getNum1();
String third ="Number of Third product: "+ one.getNum2();
String fourth ="Number of Fourth product: "+ one.getNum3();
int all = one.getNum() + one.getNum1() + one.getNum2() + one.getNum3();
String total = "Total Number of Products: "+ all;


one.setFirstName(firstname);
one.setCity(city);
one.setOrderID(orderid);
one.setLastName(lastname);


        
        Label lblid = new Label(orderid);
       Label lblcity = new Label(city);
       Label lbllastname = new Label(lastname);
       Label lblfirstname = new Label(firstname);
       Label lblfirst = new Label(first);
       Label lblsecond = new Label(second);
       Label lblthird = new Label(third);
        Label lblfourth = new Label(fourth);
        Label lbltotal = new Label(total);
              VBox pane = new VBox(lblid,lblfirstname,lbllastname,lblcity
       ,lblfirst,lblsecond,lblthird,lblfourth,lbltotal);
    Scene scene = new Scene(pane,600,550);
    
    
    return scene;
    
    
    }
    
    public DisplayOrder(Order one){


    setScene(getScene(one));
    
    
    }
}
