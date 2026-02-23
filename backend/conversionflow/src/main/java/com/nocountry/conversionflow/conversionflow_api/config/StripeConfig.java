package com.nocountry.conversionflow.conversionflow_api.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {

    /**
     * Ao subir a aplicação, configuramos a API Key do Stripe SDK.
     * Isso evita ficar setando em todo método.
     */
    public StripeConfig(StripeProperties properties) {
        Stripe.apiKey = properties.getSecretKey();
    }
}
