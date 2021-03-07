# Instructions
In order to run locally:

```
make run
```

# Results
| Benchmark                                                                             | Mode   | Threads | Samples | Score           | Score Error (99.9%) | Unit   |
| ------------------------------------------------------------------------------------- | ------ | ------- | ------- | --------------- | ------------------- | ------ |
| org.example.JavaBenchmark.cStyleCalculator                                            | thrpt  | 1       | 25      | 1.698106        | 0.238484            | ops/ns |
| org.example.JavaBenchmark.functionalStyleCalculator                                   | thrpt  | 1       | 25      | 0.041903        | 0.002721            | ops/ns |
| org.example.JavaBenchmark.iteratorStyleCalculator                                     | thrpt  | 1       | 25      | 1.970580        | 0.152724            | ops/ns |
| org.example.KotlinBenchmark.kotlinStyleCalculator                                     | thrpt  | 1       | 25      | 1.881233        | 0.198123            | ops/ns |
| org.example.JavaBenchmark.cStyleCalculator                                            | avgt   | 1       | 25      | 0.582806        | 0.054818            | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator                                   | avgt   | 1       | 25      | 25.010708       | 2.069345            | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator                                     | avgt   | 1       | 25      | 0.603647        | 0.042062            | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator                                     | avgt   | 1       | 25      | 0.579168        | 0.037932            | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator                                            | sample | 1       | 767765  | 48.691180       | 2.202561            | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p0.00                     | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p0.50                     | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p0.90                     | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p0.95                     | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p0.99                     | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p0.999                    | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p0.9999                   | sample | 1       | 1       | 23530.892800    | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator:cStyleCalculator·p1.00                     | sample | 1       | 1       | 138240.000000   | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator                                   | sample | 1       | 856688  | 71.863269       | 9.206023            | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p0.00   | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p0.50   | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p0.90   | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p0.95   | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p0.99   | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p0.999  | sample | 1       | 1       | 800.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p0.9999 | sample | 1       | 1       | 23680.000000    | NaN                 | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator:functionalStyleCalculator·p1.00   | sample | 1       | 1       | 1699840.000000  | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator                                     | sample | 1       | 815745  | 49.724872       | 1.995916            | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p0.00       | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p0.50       | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p0.90       | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p0.95       | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p0.99       | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p0.999      | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p0.9999     | sample | 1       | 1       | 19624.838400    | NaN                 | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator:iteratorStyleCalculator·p1.00       | sample | 1       | 1       | 194816.000000   | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator                                     | sample | 1       | 754097  | 53.340639       | 2.763094            | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p0.00         | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p0.50         | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p0.90         | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p0.95         | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p0.99         | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p0.999        | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p0.9999       | sample | 1       | 1       | 26936.659200    | NaN                 | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator:kotlinStyleCalculator·p1.00         | sample | 1       | 1       | 268800.000000   | NaN                 | ns/op  |
| org.example.JavaBenchmark.cStyleCalculator                                            | ss     | 1       | 5       | 2888360.000000  | 4390771.650417      | ns/op  |
| org.example.JavaBenchmark.functionalStyleCalculator                                   | ss     | 1       | 5       | 5618980.000000  | 18150614.248119     | ns/op  |
| org.example.JavaBenchmark.iteratorStyleCalculator                                     | ss     | 1       | 5       | 1905480.000000  | 1208848.422987      | ns/op  |
| org.example.KotlinBenchmark.kotlinStyleCalculator                                     | ss     | 1       | 5       | 88125760.000000 | 17243120.114739     | ns/op  |
|                                                                                       |