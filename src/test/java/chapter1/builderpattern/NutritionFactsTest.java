package chapter1.builderpattern;


import org.junit.Test;

public class NutritionFactsTest {

  @org.junit.Before
  public void setUp() throws Exception {
  }
  @Test
  public void testCreateObject() {
    NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 5)
        .calories(1)
        .carbs(1)
        .fat(1)
        .sodium(1)
        .build();
  }
}