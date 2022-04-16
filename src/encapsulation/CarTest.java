package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        //Setting info for make
        car1.make = "BMW";

        //Getting info of make
        System.out.println(car1.make);

        //Setting info for year
        car1.setYear(2020);

        //Getting info of year
        System.out.println(car1.getYear());

        car1.setPrice(5000, "abcd123");
        System.out.println(car1.getPrice()); // 5000.0


        System.out.println(car1.getIsConvertible());
    }
}
