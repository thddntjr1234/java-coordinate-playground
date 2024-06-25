package coordinate;

public class K5 extends Car {
  private int tripDistance;

  public K5(int travelDistance) {
    this.tripDistance = travelDistance;
  }

  @Override
  double getDistancePerLiter() {
    return 13;
  }

  @Override
  double getTripDistance() {
    return this.tripDistance;
  }

  @Override
  String getName() {
    return "K5";
  }
}
