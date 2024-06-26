package coordinate.precourse;

public class Sonata implements Car {
  private int tripDistance;

  public Sonata(int travelDistance) {
    this.tripDistance = travelDistance;
  }

  @Override
  public double getDistancePerLiter() {
    return 10;
  }

  @Override
  public double getTripDistance() {
    return this.tripDistance;
  }

  @Override
  public String getName() {
    return "Sonata";
  }
}
