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
public class ItemDTO {
   private String itemId;
    private String description;
    private int qty_on_hand;
    private double unitprice;

    public ItemDTO() {
    }

    public ItemDTO(String description, int qty_on_hand, double unitprice) {
        this.description = description;
        this.qty_on_hand = qty_on_hand;
        this.unitprice = unitprice;
    }

    public ItemDTO(String itemId, String description, int qty_on_hand, double unitprice) {
        this.itemId = itemId;
        this.description = description;
        this.qty_on_hand = qty_on_hand;
        this.unitprice = unitprice;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the qty_on_hand
     */
    public int getQty_on_hand() {
        return qty_on_hand;
    }

    /**
     * @param qty_on_hand the qty_on_hand to set
     */
    public void setQty_on_hand(int qty_on_hand) {
        this.qty_on_hand = qty_on_hand;
    }

    /**
     * @return the unitprice
     */
    public double getUnitprice() {
        return unitprice;
    }

    /**
     * @param unitprice the unitprice to set
     */
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
}
