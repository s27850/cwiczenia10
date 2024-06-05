import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("AA", 2010);
        Car car2 = new Car("AB", 2011);
        Car car3 = new Car("AC", 2012);
        Car car4 = new Car("AD", 2013);
        Car car5 = new Car("AE", 2014);
        Car car6 = new Car("AF", 2015);
        Car car7 = new Car("AG", 2016);
        Car car8 = new Car("AH", 2017);
        Car car9 = new Car("AI", 2018);
        Car car10 = new Car("AJ", 2019);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        Collections.sort(cars);


        for(Car car : cars) {
            System.out.println(car);
        }

    }
}