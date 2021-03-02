package org.example;

import java.util.concurrent.TimeUnit;
import org.example.cstyle.CStyleCalculator;
import org.example.fstyle.FunctionalStyleCalculator;
import org.example.istyle.IteratorStyleCalculator;
import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class JavaBenchmark
{
    private static final int[] input = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    @Benchmark
    public void cStyleCalculator()
    {
        CStyleCalculator calculator = new CStyleCalculator(input);
        calculator.sum();
    }

    @Benchmark
    public void functionalStyleCalculator()
    {
        FunctionalStyleCalculator calculator = new FunctionalStyleCalculator(input);
        calculator.sum();
    }

    @Benchmark
    public void iteratorStyleCalculator()
    {
        IteratorStyleCalculator calculator = new IteratorStyleCalculator(input);
        calculator.sum();
    }
}
