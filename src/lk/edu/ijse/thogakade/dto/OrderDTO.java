/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.dto;

/**
 *
 * @author USER
 */
public class OrderDTO {
    private int oid;
    private String date;
    private String priority;
    private CustomerDTO customerdto;

    public OrderDTO() {
    }

    public OrderDTO(String date, String priority, CustomerDTO customerdto) {
        this.date = date;
        this.priority = priority;
        this.customerdto = customerdto;
    }

    public OrderDTO(int oid, String date, String priority, CustomerDTO customerdto) {
        this.oid = oid;
        this.date = date;
        this.priority = priority;
        this.customerdto = customerdto;
    }

    /**
     * @return the oid
     */
    public int getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * @return the customerdto
     */
    public CustomerDTO getCustomerdto() {
        return customerdto;
    }

    /**
     * @param customerdto the customerdto to set
     */
    public void setCustomerdto(CustomerDTO customerdto) {
        this.customerdto = customerdto;
    }
    
}
