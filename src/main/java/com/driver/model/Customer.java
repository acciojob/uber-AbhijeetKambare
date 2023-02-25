package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    private String mobile;
    private String password;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<TripBooking> bookedListC=new ArrayList<>();

    public List<TripBooking> getBookedListC() {
        return bookedListC;
    }

    public void setBookedListC(List<TripBooking> bookedListC) {
        this.bookedListC = bookedListC;
    }

    public Customer() {
    }

    public Customer(int id, String mobile, String password) {
        this.customerId = id;
        this.mobile = mobile;
        this.password = password;
    }

    public int getId() {
        return customerId;
    }

    public void setId(int id) {
        this.customerId = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}