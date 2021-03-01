package org.example.fstyle;

import java.util.Arrays;

public class FunctionalStyleCalculator {
  private final int[] numbers;

  public FunctionalStyleCalculator(int[] numbers) {
    this.numbers = numbers;
  }

  public int sum() {
    return Arrays.stream(this.numbers).sum();
  }
}
