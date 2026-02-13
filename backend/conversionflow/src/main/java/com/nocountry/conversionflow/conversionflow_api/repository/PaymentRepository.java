package com.nocountry.conversionflow.conversionflow_api.repository;

import com.nocountry.conversionflow.conversionflow_api.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    /**
     * Garantir idempotência do webhook Stripe
     */
    boolean existsByStripeEventId(String stripeEventId);

    /**
     * Buscar pagamento pela session do Stripe
     */
    Optional<Payment> findByStripeSessionId(String stripeSessionId);
}
