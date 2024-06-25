package coordinate;

public class Avante extends Car {
  private int tripDistance;

  public Avante(int travelDistance) {
    this.tripDistance = travelDistance;
  }

  @Override
  double getDistancePerLiter() {
    return 15;
  }

  @Override
  double getTripDistance() {
    return this.tripDistance;
  }

  @Override
  String getName() {
    return "Avante";
  }
}
