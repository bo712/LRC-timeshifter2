.DEFAULT_GOAL := build-run

build-run: build run

build:
	./mvnw clean package

run:
	java -jar ./target/LRC-timeshifter-1.0-SNAPSHOT-jar-with-dependencies.jar

update:
	./mvnw versions:update-properties
	./mvnw versions:display-plugin-updates
