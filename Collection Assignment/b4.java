import java.util.ArrayList;

public class b4 {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
	System.out.println(cars);
	cars.remove(3);
    System.out.println(cars);
  }
}