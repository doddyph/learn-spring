package com.nitelab.spring.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dph on 08/10/16.
 */
@Entity
public class Penerbit {
    private int id;
    private String name;
    private Set<Buku> buku;

    public Penerbit() {
    }

    public Penerbit(String name) {
        this.name = name;
    }

    public Penerbit(String name, Set<Buku> buku) {
        this.name = name;
        this.buku = buku;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "penerbit")
    public Set<Buku> getBuku() {
        return buku;
    }

    public void setBuku(Set<Buku> buku) {
        this.buku = buku;
    }
}
