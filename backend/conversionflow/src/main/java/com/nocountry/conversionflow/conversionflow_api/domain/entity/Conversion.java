package com.nocountry.conversionflow.conversionflow_api.domain.entity;

import com.nocountry.conversionflow.conversionflow_api.domain.enums.ConversionStatus;
import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "conversions")
public class Conversion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "lead_id")
    private Lead lead;

    @Column(nullable = false)
    private String plan;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ConversionStatus status;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    public Conversion() {
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public Lead getLead() {
        return lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public ConversionStatus getStatus() {
        return status;
    }

    public void setStatus(ConversionStatus status) {
        this.status = status;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
