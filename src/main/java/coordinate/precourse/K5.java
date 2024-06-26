package coordinate.precourse;

public class K5 implements Car {
  private int tripDistance;

  public K5(int travelDistance) {
    this.tripDistance = travelDistance;
  }

  @Override
  public double getDistancePerLiter() {
    return 13;
  }

  @Override
  public double getTripDistance() {
    return this.tripDistance;
  }

  @Override
  public String getName() {
    return "K5";
  }
}
