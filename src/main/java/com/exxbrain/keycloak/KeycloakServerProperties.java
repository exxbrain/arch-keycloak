package com.exxbrain.keycloak;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {

    Map<String, String> connectionsJpa;

    String contextPath = "/auth";

    String realmImportFile = "arch-realm.json";

    AdminUser adminUser = new AdminUser();

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public AdminUser getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(AdminUser adminUser) {
        this.adminUser = adminUser;
    }

    public String getRealmImportFile() {
        return realmImportFile;
    }

    public void setRealmImportFile(String realmImportFile) {
        this.realmImportFile = realmImportFile;
    }

    public Map<String, String> getConnectionsJpa() {
        return connectionsJpa;
    }

    public void setConnectionsJpa(Map<String, String> connectionsJpa) {
        this.connectionsJpa = connectionsJpa;
    }

    public static class AdminUser {

        String username = "admin";

        String password = "admin";

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
