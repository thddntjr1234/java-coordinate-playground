package coordinate.precourse;

public class Avante implements Car {
  private int tripDistance;

  public Avante(int travelDistance) {
    this.tripDistance = travelDistance;
  }

  @Override
  public double getDistancePerLiter() {
    return 15;
  }

  @Override
  public double getTripDistance() {
    return this.tripDistance;
  }

  @Override
  public String getName() {
    return "Avante";
  }
}
