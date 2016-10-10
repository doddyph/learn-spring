package com.nitelab.spring.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by SRIN on 10/10/2016.
 */
@Entity
public class Acara implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "EVENT_ID")
    private long eventId;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @ManyToMany(mappedBy = "acara")
    private Set<Karyawan> karyawan;

    public Acara() {
    }

    public Acara(String eventName) {
        this.eventName = eventName;
    }

    public Acara(String eventName, Set<Karyawan> karyawan) {
        this.eventName = eventName;
        this.karyawan = karyawan;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Set<Karyawan> getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Set<Karyawan> karyawan) {
        this.karyawan = karyawan;
    }
}
