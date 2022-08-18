//package com.apiGateway.config;
//
//import org.keycloak.adapters.KeycloakDeployment;
//import org.keycloak.adapters.KeycloakDeploymentBuilder;
//import org.keycloak.adapters.OIDCHttpFacade;
//import org.keycloak.adapters.spi.HttpFacade;
//import org.keycloak.representations.adapters.config.AdapterConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class KeycloakSpringBootConfigResolver implements org.keycloak.adapters.KeycloakConfigResolver {
//
//    private KeycloakDeployment keycloakDeployment;
//
//    @Autowired(required=false)
//    private AdapterConfig adapterConfig;
//
//    @Override
//    public KeycloakDeployment resolve(OIDCHttpFacade.Request request) {
//        if (keycloakDeployment != null) {
//            return keycloakDeployment;
//        }
//
//        keycloakDeployment = KeycloakDeploymentBuilder.build(adapterConfig);
//
//        return keycloakDeployment;
//    }
//
//    void setAdapterConfig(AdapterConfig adapterConfig) {
//        this.adapterConfig = adapterConfig;
//    }
//}