package me.api.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int ag;

    @Column(unique = true)
    private String cc;

    @Column(nullable = false, scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit",nullable = false, scale = 13, precision = 2)
    private BigDecimal limit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAg() {
        return ag;
    }

    public void setAg(int ag) {
        this.ag = ag;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}
