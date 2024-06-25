package coordinate;

public class Sonata extends Car {
  private int tripDistance;

  public Sonata(int travelDistance) {
    this.tripDistance = travelDistance;
  }

  @Override
  double getDistancePerLiter() {
    return 10;
  }

  @Override
  double getTripDistance() {
    return this.tripDistance;
  }

  @Override
  String getName() {
    return "Sonata";
  }
}
