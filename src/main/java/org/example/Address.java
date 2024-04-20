package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Add_Id")
    private int addId;

    @Column(name = "add_Street",length = 50)
    private String street;
    @Column(name = "add_City",length = 10)
    private String city;

    private boolean isOpen;
    private Date mydate;
    public int getAddId() {
        return addId;
    }
    public void setAddId(int addId) {
        this.addId = addId;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public Date getMydate() {
        return mydate;
    }
    public void setMydate(Date mydate) {
        this.mydate = mydate;
    }
    @Override
    public String toString() {
        return "Address [addId=" + addId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + "]";
    }
    public Address() {
        super();
    }
    public Address(int addId, String street, String city, boolean isOpen, Date mydate) {
        super();
        this.addId = addId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.mydate = mydate;
    }

}
