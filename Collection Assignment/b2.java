import java.util.ArrayList;

public class b2 {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
	cars.set(0,"suzuki");
    System.out.println(cars);
  }
}