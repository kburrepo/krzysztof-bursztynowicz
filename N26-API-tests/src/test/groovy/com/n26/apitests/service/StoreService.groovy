package com.n26.apitests.service

import com.n26.apitests.dto.Order

import static io.restassured.RestAssured.given
import static io.restassured.http.ContentType.JSON

class StoreService extends BaseService {

    static def postNewOrder(Order order) {
            given()
                .contentType(JSON)
                .body(order)
                .log().all()
            .when()
                .post("$HOST_URL/store/order")
            .then()
                .log().all()
                .statusCode(200)
                .extract().response()
    }

    static def getInventoryResponseBody() {
            given()
                .log().all()
                .contentType(JSON)
            .when()
                .get("$HOST_URL/store/inventory")
            .then()
                .log().all()
                .statusCode(200)
                .extract().response()
    }
}
