package com.n26.apitests.tests


import org.junit.Rule
import org.junit.rules.TestName
import org.junit.rules.Timeout
import spock.lang.Specification

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails
import static io.restassured.RestAssured.useRelaxedHTTPSValidation

class BaseSpec extends Specification {

    @Rule Timeout globalTimeout = new Timeout(200000)
    @Rule  TestName name = new TestName()

    def setupSpec() {
        enableLoggingOfRequestAndResponseIfValidationFails()
        useRelaxedHTTPSValidation()
    }
}
