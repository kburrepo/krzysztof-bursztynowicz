package com.n26.apitests.tests

import static com.n26.apitests.factory.OrderFactory.buildOrder
import static com.n26.apitests.service.StoreService.*

class InventorySpec extends BaseSpec {

    static final int QUANTITY = 3

    def "should increase inventory quantity after placing an order"() {
        given:
            int initialApprovedOrders = getApprovedOrdersQuantity()
        when:
            postNewOrder(buildOrder(QUANTITY))
        then:
            getApprovedOrdersQuantity() == initialApprovedOrders + QUANTITY
    }

    static Integer getApprovedOrdersQuantity() {
        getInventoryResponseBody().path("approved")
    }
}
