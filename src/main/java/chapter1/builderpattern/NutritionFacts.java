package chapter1.builderpattern;

public class NutritionFacts {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int carbs;
  private final int sodium;
  private final int fat;

  private NutritionFacts(Builder builder) {
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.carbs = builder.carbs;
    this.sodium = builder.sodium;
    this.fat = builder.fat;
  }
  public static class Builder {
    private final int servingSize;
    private final int servings;

    private  int calories = 0;
    private  int carbs = 0;
    private  int sodium = 0;
    private  int fat = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int calories) {
      this.calories = calories;
      return this;
    }

    public Builder carbs(int carbs) {
      this.carbs = carbs;
      return this;
    }

    public Builder sodium(int sodium) {
      this.sodium = sodium;
      return this;
    }

    public Builder fat(int fat) {
      this.fat = fat;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }

  }


}
