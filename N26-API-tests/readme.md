## N26-API-tests

**Description** \
The project contains the API test automation framework with three test cases:
1. Check if the inventory is updated after adding a certain number of approved orders (InventorySpec)
2. Check if correct status code is returned after calling user logout endpoint with various methods (UserSpec)
3. Check if GET user endpoint returns correct response body (UserSpec)

**Manual** \
Pre-requisites: JAVA 8+ installed, maven installed
1. Clone the repository
2. Clone the petstore repository ('make download-petstore' command)
3. Run the petstore jetty server ('make run-petstore' command)
4. Execute tests according to the Makefile instructions
5. Report with logs is generated in the /build/reports/tests/test/index.html file

**Tech stack:**\
Groovy \
Gradle \
REST Assured http://rest-assured.io/ \
Spock http://spockframeworsk.org/
