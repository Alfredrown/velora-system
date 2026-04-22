package com.example.shippingservice.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    public static final String ORDER_TOPIC = "velora.order.topic";
    public static final String PAYMENT_SUCCESS_TOPIC = "velora.payment.success.topic";
    public static final String PAYMENT_FAILED_TOPIC = "velora.payment.failed.topic";
    public static final String SHIPMENT_CREATED_TOPIC = "velora.shipment.created.topic";
    public static final String DLQ_TOPIC = "velora.dlq.topic";
}
