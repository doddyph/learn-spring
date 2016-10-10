package com.nitelab.spring.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by SRIN on 10/10/2016.
 */
@Entity
public class Employee implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEEID")
    private long employeeId;

    @Column(name = "EMPLOYEENAME")
    private String employeeName;

    public Employee() {
    }

    public Employee(String employeeName) {
        this.employeeName = employeeName;
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
}
