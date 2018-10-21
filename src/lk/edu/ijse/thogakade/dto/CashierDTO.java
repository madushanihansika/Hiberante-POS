/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.dto;

import java.util.List;


/**
 *
 * @author USER
 */
public class CashierDTO {
    private CustomerDTO customerDTO;
    private OrderDTO orderDTO;
    private List<OrderDetailDTO> orderdetaillist;

    public CashierDTO() {
    }

    public CashierDTO(CustomerDTO customerDTO, OrderDTO orderDTO, List<OrderDetailDTO> orderdetaillist) {
        this.customerDTO = customerDTO;
        this.orderDTO = orderDTO;
        this.orderdetaillist = orderdetaillist;
    }

    /**
     * @return the customerDTO
     */
    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    /**
     * @param customerDTO the customerDTO to set
     */
    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
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
     * @return the orderdetaillist
     */
    public List<OrderDetailDTO> getOrderdetaillist() {
        return orderdetaillist;
    }

    /**
     * @param orderdetaillist the orderdetaillist to set
     */
    public void setOrderdetaillist(List<OrderDetailDTO> orderdetaillist) {
        this.orderdetaillist = orderdetaillist;
    }

}
