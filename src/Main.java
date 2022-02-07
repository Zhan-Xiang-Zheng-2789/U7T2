/*import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(24);
        System.out.println(integers);
    }
} */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car[] carArray = {new Car("Mustang", 12500), new Car("Camry", 8400), new Car("Ram", 17200)};

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}
