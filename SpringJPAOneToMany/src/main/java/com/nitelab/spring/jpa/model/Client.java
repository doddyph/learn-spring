package com.nitelab.spring.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dph on 08/10/16.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;
    private String cardId;

    @OneToMany(targetEntity = Purchase.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Set<Purchase> purchases;

    public Client() {}

    public Client(String name, String address, String cardId) {
        this.name = name;
        this.address = address;
        this.cardId = cardId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }

    @Override
    public String toString() {
        return String.format("Client[id=%d, name='%s', address='%s', cardId='%s']", id, name, address, cardId);
    }
}
