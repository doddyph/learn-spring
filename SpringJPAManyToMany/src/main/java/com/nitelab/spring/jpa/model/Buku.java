package com.nitelab.spring.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dph on 08/10/16.
 */
@Entity
public class Buku {
    private int id;
    private String name;
    private Set<Penerbit> penerbit;

    public Buku() {
    }

    public Buku(String name) {
        this.name = name;
    }

    public Buku(String name, Set<Penerbit> penerbit) {
        this.name = name;
        this.penerbit = penerbit;
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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "penerbit_buku",
            joinColumns = @JoinColumn(name = "buku_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "penerbit_id", referencedColumnName = "id"))
    public Set<Penerbit> getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(Set<Penerbit> penerbit) {
        this.penerbit = penerbit;
    }
}
