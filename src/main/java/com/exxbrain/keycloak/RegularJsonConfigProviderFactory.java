package com.exxbrain.keycloak;

import org.keycloak.common.util.SystemEnvProperties;
import org.keycloak.services.util.JsonConfigProviderFactory;

import java.util.HashMap;
import java.util.Properties;

public class RegularJsonConfigProviderFactory extends JsonConfigProviderFactory {

    private final KeycloakServerProperties properties;

    public RegularJsonConfigProviderFactory(KeycloakServerProperties properties) {
        this.properties = properties;
    }

    @Override
    protected Properties getProperties() {
        var map = new HashMap<String, String>();
        for (var entry: properties.getConnectionsJpa().entrySet()) {
            map.put("keycloak.connectionsJpa." + entry.getKey(), entry.getValue());
        }
        return new SystemEnvProperties(map);
    }
}
