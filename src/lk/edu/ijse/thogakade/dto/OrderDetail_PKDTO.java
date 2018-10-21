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
public class OrderDetail_PKDTO {
    private String itemId;
    private int oid;

    public OrderDetail_PKDTO() {
    }

    public OrderDetail_PKDTO(String itemId, int oid) {
        this.itemId = itemId;
        this.oid = oid;
    }
    
}
