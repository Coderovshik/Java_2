.DEFAULT_GOAL: run

.PHONY: run
run: build
	@java -cp ./bin Main

.PHONY: build
build:
	@javac -sourcepath ./src -d ./bin ./src/*.java

.PHONY: clean
clean:
	@rm -r ./bin/*