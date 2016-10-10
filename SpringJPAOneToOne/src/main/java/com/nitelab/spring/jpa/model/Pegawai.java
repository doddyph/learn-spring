package com.nitelab.spring.jpa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by SRIN on 10/10/2016.
 */
@Entity
public class Pegawai implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID")
    private long employeeId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ADDRESS")
    private Alamat alamat;

    public Pegawai() {
    }

    public Pegawai(String employeeName) {
        this.employeeName = employeeName;
    }

    public Pegawai(String employeeName, Alamat alamat) {
        this.employeeName = employeeName;
        this.alamat = alamat;
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

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}
