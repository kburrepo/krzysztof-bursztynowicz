package com.n26.apitests.service

import static com.n26.apitests.utils.SettingsReader.getValue

class BaseService {

    static final String HOST_URL = getValue("host-url")
}
