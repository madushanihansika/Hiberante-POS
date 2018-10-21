/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author USER
 */
@Entity
public class Customer {
    @Id
    private String cid;
    private String name;
    private String address;
    private String contact;
    
    public Customer() {
    }

    public Customer(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public Customer(String cid, String name, String address, String contact) {
        this.cid = cid;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", name=" + name + ", address=" + address + ", contact=" + contact + '}';
    }
}
