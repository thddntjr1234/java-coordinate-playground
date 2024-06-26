package coordinate.precourse;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
  private List<Car> cars = new ArrayList<>();

  public static RentCompany create() {
    return new RentCompany();
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public String generateReport() {
    String result = "";
    for (Car car : cars) {
      result += car.getName() + " : " + (int)car.getChargeQuantity() + "리터" + System.getProperty("line.separator");
    }

    return result;
  }
}
