.PHONY: build run

build:
	mvn clean install

java-benchmark: build
	java -jar target/microbenchmarks.jar -rf csv

go-benchmark:
	cd go; go test -bench=.
