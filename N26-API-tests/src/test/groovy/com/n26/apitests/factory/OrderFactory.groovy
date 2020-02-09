package com.n26.apitests.factory

import com.n26.apitests.dto.Order

import java.sql.Timestamp
import java.text.SimpleDateFormat

import static java.lang.System.currentTimeMillis
import static java.util.Calendar.instance

class OrderFactory {

    static def buildOrder(Integer quantity) {
        return new Order(
                id: idGenerator(),
                petId: 198772,
                quantity: quantity,
                shipDate: setShipDate(),
                status: "approved",
                complete: true
        )
    }

    static def idGenerator() {
        new Timestamp(currentTimeMillis()).getTime()
    }

    static String setShipDate(){
        generateFormattedDateAndTime(currentDateAndTime())
    }

    static def generateFormattedDateAndTime(Date date) {
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(date)
    }

    static def currentDateAndTime() {
        getInstance().getTime()
    }
}
