package com.nocountry.conversionflow.conversionflow_api.config.properties;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "stripe")
public class StripeProperties {

    private String secretKey;
    private String webhookSecret;

    private String successUrl;
    private String cancelUrl;

    /**
     * Ex: "usd"
     */
    private String currency = "usd";

    /**
     * stripe.prices.basic=price_...
     * stripe.prices.pro=price_...
     */
    private Map<String, String> prices;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getWebhookSecret() { return webhookSecret; }
    public void setWebhookSecret(String webhookSecret) { this.webhookSecret = webhookSecret; }
}
