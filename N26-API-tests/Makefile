FORKS =	3
PETSTORE_REPO = https://github.com/swagger-api/swagger-petstore.git

download-petstore: ##downloads petstore repo to the main project directory
	@git clone ${PETSTORE_REPO}

run-petstore: ##runs the jetty server
	@cd swagger-petstore/ && mvn package jetty:run

test-exec: ##executes all the test suites subsequently
	@./gradlew clean test

test-exec-parallel: ##executes all the test suites in parallel
	@./gradlew clean test -PforksNumber=${FORKS}

test-exec-specific: ##executes only procided suite, ie: make test-exec-specific FILE_NAME=UserSpec
	@./gradlew clean test --tests ${FILE_NAME}