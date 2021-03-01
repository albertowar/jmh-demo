package org.example.istyle;

public class IteratorStyleCalculator {
  private final int[] numbers;

  public IteratorStyleCalculator(int[] numbers) {
    this.numbers = numbers;
  }

  public int sum() {
    int sum = 0;

    for (int i : this.numbers) {
      sum += i;
    }

    return sum;
  }
}
