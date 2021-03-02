.PHONY: build run

build:
	mvn clean install

run: build
	java -jar target/microbenchmarks.jar