package encapsulation;

public class Car {


    //instance variables
    public String make= "BMW";
    private int year;
    private double price; //require a password
    private boolean isConvertible = true; //nobody can change without set method provided

    //Providing indirect access to year to set and get info
    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){

        return year;
    }

    //Writing -- Setting info
    public void setPrice(double price, String adminPassword){
        if (adminPassword.equals("abcd1234"))this.price = price;
        else throw new RuntimeException("The password entered is not valid!!!");
    }

    //Reading -- Getting info
    public double getPrice(){
        return price;
    }

    public boolean getIsConvertible(){
        return isConvertible;
    }
}



