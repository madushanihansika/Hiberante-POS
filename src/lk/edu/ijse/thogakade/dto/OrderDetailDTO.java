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
public class OrderDetailDTO {
    private int order_qty;
    private double unitprice;
    private ItemDTO itemDTO;
    private OrderDTO orderDTO;
    private OrderDetail_PKDTO orderDetail_PKdto;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String itemId,int oid,int order_qty, double unitprice, ItemDTO itemDTO, OrderDTO orderDTO, OrderDetail_PKDTO orderDetail_PKdto) {
        this.order_qty = order_qty;
        this.unitprice = unitprice;
        this.itemDTO = itemDTO;
        this.orderDTO = orderDTO;
        orderDetail_PKdto =new OrderDetail_PKDTO(itemId, oid);
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
     * @return the itemDTO
     */
    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    /**
     * @param itemDTO the itemDTO to set
     */
    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    /**
     * @return the orderDTO
     */
    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    /**
     * @param orderDTO the orderDTO to set
     */
    public void setOrderDTO(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    /**
     * @return the orderDetail_PKdto
     */
    public OrderDetail_PKDTO getOrderDetail_PKdto() {
        return orderDetail_PKdto;
    }

    /**
     * @param orderDetail_PKdto the orderDetail_PKdto to set
     */
    public void setOrderDetail_PKdto(OrderDetail_PKDTO orderDetail_PKdto) {
        this.orderDetail_PKdto = orderDetail_PKdto;
    }

    
    
}
