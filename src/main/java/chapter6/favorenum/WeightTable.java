package chapter6.favorenum;

public class WeightTable {

  public static void main(String[] args) {
    if (args.length < 1) args = new String[]{"60"};
    double earthWeight = Double.parseDouble(args[0]);
    double mass = earthWeight / Planet.EARTH.surfaceGravity();
    for (Planet planet : Planet.values()){
      System.out.printf("Weight on %s is %f%n", planet, planet.surfaceWeight(mass));
    }
  }

}
