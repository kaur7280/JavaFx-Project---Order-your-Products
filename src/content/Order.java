/**
  Name: Ramneek Kaur
  Student ID: 991555460
  Assignment 2
  Date: February 26,2020
*/
package content;

public class Order {
    private String orderID;
    private String firstName;
    private String lastName;
    private String city;
    private int num;
    private int num1;
    private int num2;
    private int num3;
    public String getOrderID(){
    
    return this.orderID;
    }
    public String getFirstName(){
    return this.firstName;
    }
    public String getLastName(){
    
    return this.lastName;
    }
    public String getCity(){
    
    return this.city;
    }
    public void setCity(String city){this.city = city;}
    public void setLastName(String lastName){this.lastName=lastName;}
    public void setFirstName(String firstName){this.firstName=firstName;}
    public void setOrderID(String orderID){this.orderID=orderID;}
    public int getNum(){
    return this.num;
    }    
    public int getNum1(){
    return this.num1;
    }public int getNum2(){
    return this.num2;
    }public int getNum3(){
    return this.num3;
    }
    public void setNum(){num++;}
    public void setNum1(){ num1++;}
    public void setNum2(){num2++;}
    public void setNum3(){num3++;}
}
