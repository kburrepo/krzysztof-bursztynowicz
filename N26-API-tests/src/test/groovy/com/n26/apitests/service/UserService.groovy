package com.n26.apitests.service

import io.restassured.http.Method

import static io.restassured.RestAssured.given
import static io.restassured.http.ContentType.JSON

class UserService extends BaseService {

    static def logoutUserCall(Method method) {
            given()
                .contentType(JSON)
            .when()
                .request(method, "$HOST_URL/user/logout")
            .then()
                .log().all()
                .extract().response()
    }

    static def getSpecificUser(String userName) {
            given()
                .accept(JSON)
            .when()
                .get("$HOST_URL/user/$userName")
            .then()
                .extract().response()
    }
}
