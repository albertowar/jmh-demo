package org.example.cstyle;

public class CStyleCalculator {
  private final int[] numbers;

  public CStyleCalculator(int[] numbers) {
    this.numbers = numbers;
  }

  public int sum() {
    int sum = 0;

    for (int i = 0; i < numbers.length; ++i) {
      sum += this.numbers[i];
    }

    return sum;
  }
}
