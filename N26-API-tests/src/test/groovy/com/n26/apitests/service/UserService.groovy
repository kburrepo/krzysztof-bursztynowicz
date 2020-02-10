package com.n26.apitests.service

import io.restassured.http.Method

import static io.restassured.RestAssured.given
import static io.restassured.http.ContentType.JSON

class UserService extends BaseService {

    static def logoutUserCall(Method method) {
            given()
                .log().all()
                .contentType(JSON)
            .when()
                .request(method, "$HOST_URL/user/logout")
            .then()
                .log().all()
                .extract().response()
    }

    static def getSpecificUser(String userName) {
            given()
                .log().all()
                .accept(JSON)
            .when()
                .get("$HOST_URL/user/$userName")
            .then()
                .log().all()
                .extract().response()
    }
}
