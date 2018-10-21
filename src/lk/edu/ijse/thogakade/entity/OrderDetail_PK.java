/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author USER
 */
@Embeddable
public class OrderDetail_PK implements Serializable{
    private String itemId;
    private int oid;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(String itemId, int oid) {
        this.itemId = itemId;
        this.oid = oid;
    }
}
