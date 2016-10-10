package com.nitelab.spring.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by SRIN on 10/10/2016.
 */
@Entity
public class Karyawan implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID")
    private long employeeId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "EMPLOYEE_EVENT",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "EVENT_ID")})
    private Set<Acara> acara;

    public Karyawan() {
    }

    public Karyawan(String employeeName) {
        this.employeeName = employeeName;
    }

    public Karyawan(String employeeName, Set<Acara> acara) {
        this.employeeName = employeeName;
        this.acara = acara;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Set<Acara> getAcara() {
        return acara;
    }

    public void setAcara(Set<Acara> acara) {
        this.acara = acara;
    }
}
