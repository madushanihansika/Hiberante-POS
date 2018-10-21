/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author USER
 */
@Entity
public class OrderDetail {
    private int order_qty;
    private double unitprice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="itemId",referencedColumnName = "itemId",insertable = false,updatable = false)
    private Item item;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders order;
    @EmbeddedId
    private OrderDetail_PK orderDetail_PK;

    public OrderDetail() {
    }

    public OrderDetail(String itemId,int oid,int order_qty, double unitprice, Item item, Orders order, OrderDetail_PK orderDetail_PK) {
        this.order_qty = order_qty;
        this.unitprice = unitprice;
        this.item = item;
        this.order = order;
        orderDetail_PK = new OrderDetail_PK(itemId,oid);
    }

    /**
     * @return the order_qty
     */
    public int getOrder_qty() {
        return order_qty;
    }

    /**
     * @param order_qty the order_qty to set
     */
    public void setOrder_qty(int order_qty) {
        this.order_qty = order_qty;
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

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the order
     */
    public Orders getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Orders order) {
        this.order = order;
    }

    /**
     * @return the orderDetail_PK
     */
    public OrderDetail_PK getOrderDetail_PK() {
        return orderDetail_PK;
    }

    /**
     * @param orderDetail_PK the orderDetail_PK to set
     */
    public void setOrderDetail_PK(OrderDetail_PK orderDetail_PK) {
        this.orderDetail_PK = orderDetail_PK;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "order_qty=" + order_qty + ", unitprice=" + unitprice + ", item=" + item + ", order=" + order + '}';
    }
    
}
