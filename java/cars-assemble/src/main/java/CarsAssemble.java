public class CarsAssemble {

  public double productionRatePerHour(int speed) {
    int idealProductionRate = speed * 221;
    double realProductionRate = 0;

    if (speed > 0 && speed <= 4)
      realProductionRate = idealProductionRate * 1;
    if (speed > 4 && speed <= 8)
      realProductionRate = idealProductionRate * 0.9;
    if (speed == 9)
      realProductionRate = idealProductionRate * 0.8;
    if (speed == 10)
      realProductionRate = idealProductionRate * 0.77;

    return realProductionRate;
  }

  public int workingItemsPerMinute(int speed) {
    double perMin = productionRatePerHour(speed) / 60;
    int itemsPerMin = (int) perMin;
    return itemsPerMin;
  }
}
