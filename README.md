## JVM benchmark

### How to run
In order to run locally:

```
make run
```

### Results
| Benchmark                                                                             | Mode   | Threads | Samples | Score           | Score Error (99.9%) | Unit   |
| ------------------------------------------------------------------------------------- | ------ | ------- | ------- | --------------- | ------------------- | ------ |
| cStyleCalculator                                            | thrpt  | 1       | 25      | 1.698106        | 0.238484            | ops/ns |
| functionalStyleCalculator                                   | thrpt  | 1       | 25      | 0.041903        | 0.002721            | ops/ns |
| iteratorStyleCalculator                                     | thrpt  | 1       | 25      | 1.970580        | 0.152724            | ops/ns |
| kotlinStyleCalculator                                     | thrpt  | 1       | 25      | 1.881233        | 0.198123            | ops/ns |
| cStyleCalculator                                            | avgt   | 1       | 25      | 0.582806        | 0.054818            | ns/op  |
| functionalStyleCalculator                                   | avgt   | 1       | 25      | 25.010708       | 2.069345            | ns/op  |
| iteratorStyleCalculator                                     | avgt   | 1       | 25      | 0.603647        | 0.042062            | ns/op  |
| kotlinStyleCalculator                                     | avgt   | 1       | 25      | 0.579168        | 0.037932            | ns/op  |
| cStyleCalculator                                            | sample | 1       | 767765  | 48.691180       | 2.202561            | ns/op  |
| cStyleCalculator:cStyleCalculator p0.00                     | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| cStyleCalculator:cStyleCalculator p0.50                     | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| cStyleCalculator:cStyleCalculator p0.90                     | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| cStyleCalculator:cStyleCalculator p0.95                     | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| cStyleCalculator:cStyleCalculator p0.99                     | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| cStyleCalculator:cStyleCalculator p0.999                    | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| cStyleCalculator:cStyleCalculator p0.9999                   | sample | 1       | 1       | 23530.892800    | NaN                 | ns/op  |
| cStyleCalculator:cStyleCalculator p1.00                     | sample | 1       | 1       | 138240.000000   | NaN                 | ns/op  |
| functionalStyleCalculator                                   | sample | 1       | 856688  | 71.863269       | 9.206023            | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p0.00   | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p0.50   | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p0.90   | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p0.95   | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p0.99   | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p0.999  | sample | 1       | 1       | 800.000000      | NaN                 | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p0.9999 | sample | 1       | 1       | 23680.000000    | NaN                 | ns/op  |
| functionalStyleCalculator:functionalStyleCalculator p1.00   | sample | 1       | 1       | 1699840.000000  | NaN                 | ns/op  |
| iteratorStyleCalculator                                     | sample | 1       | 815745  | 49.724872       | 1.995916            | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p0.00       | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p0.50       | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p0.90       | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p0.95       | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p0.99       | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p0.999      | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p0.9999     | sample | 1       | 1       | 19624.838400    | NaN                 | ns/op  |
| iteratorStyleCalculator:iteratorStyleCalculator p1.00       | sample | 1       | 1       | 194816.000000   | NaN                 | ns/op  |
| kotlinStyleCalculator                                     | sample | 1       | 754097  | 53.340639       | 2.763094            | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p0.00         | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p0.50         | sample | 1       | 1       | 0.000000        | NaN                 | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p0.90         | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p0.95         | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p0.99         | sample | 1       | 1       | 100.000000      | NaN                 | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p0.999        | sample | 1       | 1       | 200.000000      | NaN                 | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p0.9999       | sample | 1       | 1       | 26936.659200    | NaN                 | ns/op  |
| kotlinStyleCalculator:kotlinStyleCalculator p1.00         | sample | 1       | 1       | 268800.000000   | NaN                 | ns/op  |
| cStyleCalculator                                            | ss     | 1       | 5       | 2888360.000000  | 4390771.650417      | ns/op  |
| functionalStyleCalculator                                   | ss     | 1       | 5       | 5618980.000000  | 18150614.248119     | ns/op  |
| iteratorStyleCalculator                                     | ss     | 1       | 5       | 1905480.000000  | 1208848.422987      | ns/op  |
| kotlinStyleCalculator                                     | ss     | 1       | 5       | 88125760.000000 | 17243120.114739     | ns/op  |
|                                                                                       |

## Go benchmark
### How to run
In order to run the go benchmark:
```go

```

### Results
| goarch: amd64          |
| ---------------------- | ----------- | ----------------- |
| Benchmark1-12          |  1000000000 |  0.000001 ns/op   |
| Benchmark10-12         |  1000000000 |  0.000001 ns/op   |
| Benchmark100-12        |  1000000000 |  0.000003 ns/op   |
| Benchmark1000-12       |  1000000000 |  0.000019 ns/op   |
| Benchmark10000-12      |  1000000000 |  0.000181 ns/op   |
| Benchmark100000-12     |  1000000000 |  0.00186 ns/op    |
| Benchmark1000000-12    |  1000000000 |  0.0182 ns/op     |
| Benchmark10000000-12   |  1000000000 |  0.0710 ns/op     |
| Benchmark100000000-12  |  1000000000 |  0.658 ns/op      |
| Benchmark1000000000-12 |  1          |  6042611600 ns/op |