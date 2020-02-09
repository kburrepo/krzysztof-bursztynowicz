package com.n26.apitests.utils

import org.yaml.snakeyaml.Yaml

class SettingsReader {

    static final String SETTINGS_FILE = 'test-config.yaml'

    @Lazy
    static volatile Object settings = loadSettings()

    static getValue(String key) {
        return getNestedProperty(settings, key) ?: settings."$key"
    }

    private static Object getNestedProperty(Object object, String key) {
        key.tokenize('.').inject object, { obj, prop ->
            if (!obj) {
                return null
            }
            obj[prop]
        }
    }

    private static loadSettings() {
        def input = SettingsReader.class.getClassLoader().getResourceAsStream(SETTINGS_FILE)
        return input.withStream {
            return new Yaml().load(it)
        }
    }
}