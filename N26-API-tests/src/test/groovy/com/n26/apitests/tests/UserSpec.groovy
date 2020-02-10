package com.n26.apitests.tests

import io.restassured.path.json.JsonPath
import spock.lang.Unroll

import static com.n26.apitests.service.UserService.getSpecificUser
import static com.n26.apitests.service.UserService.logoutUserCall
import static com.n26.apitests.utils.SettingsReader.getValue
import static io.restassured.http.Method.GET
import static io.restassured.http.Method.POST

class UserSpec extends BaseSpec {

    final String RS_BODY_JSON = getValue("rs-body-json")
    final String USER_NAME = "user2"

    @Unroll
    def "should return correct status code when calling user logout with #method method"() {
        when:
            def respose = logoutUserCall(method)
        then:
            respose.statusCode() == statusCode
        where:
            method     | statusCode
            GET        | 200
            POST       | 405
    }

    def "should user response body match expected json"() {
        given:
            JsonPath expectedJson = new JsonPath(new File(RS_BODY_JSON))
        when:
            def response = getSpecificUser(USER_NAME)
        then:
            response.statusCode() == 200
        and:
            response.path("") == expectedJson.getMap("")
    }
}