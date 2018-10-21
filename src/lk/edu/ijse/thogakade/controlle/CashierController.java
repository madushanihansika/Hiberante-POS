/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.controlle;

import lk.edu.ijse.thogakade.dto.CashierDTO;


/**
 *
 * @author USER
 */
public interface CashierController {
    public boolean placeOrder(CashierDTO cashierDTO)throws Exception;
}
