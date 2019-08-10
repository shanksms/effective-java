package chapter6.favorenum;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation {
  PLUS("+"){
    public double apply(double x, double y) {
      return x + y;
    }
  },
  MINUS("-") {
    public double apply(double x, double y) {
      return x - y;
    }
  };

  private final String symbol;
  private static final Map<String, Operation> stringToMap =
      Stream.of(values()).collect(Collectors.toMap(e -> e.toString(), e -> e));

  Operation(String symbol) {
    this.symbol = symbol;
  }

  public static Optional<Operation> fromString(String symbol) {
    return Optional.ofNullable(stringToMap.get(symbol));
  }

  @Override
  public String toString() {
    return symbol;
  }

  public abstract double apply(double x, double y);
}
