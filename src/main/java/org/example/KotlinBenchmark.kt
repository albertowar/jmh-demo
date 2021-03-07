package org.example

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@BenchmarkMode(Mode.All)
@Warmup(time = 1)
@Measurement(time = 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
open class KotlinBenchmark() {
    companion object {
        val input = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    }

    @Benchmark
    open fun kotlinStyleCalculator() {
        val calculator = KotlinStyleCalculator(input)
        calculator.sum()
    }
}
