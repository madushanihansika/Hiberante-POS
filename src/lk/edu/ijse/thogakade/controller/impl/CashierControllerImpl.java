/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.controller.impl;

import lk.edu.ijse.thogakade.controlle.CashierController;
import lk.edu.ijse.thogakade.dto.CashierDTO;
import lk.edu.ijse.thogakade.service.impl.ChashierServiceImpl;
import lk.edu.ijse.thogakade.services.CashireServices;


/**
 *
 * @author USER
 */
public class CashierControllerImpl implements CashierController{

    CashireServices cashireServices=new ChashierServiceImpl();

    @Override
    public boolean placeOrder(CashierDTO cashierDTO) throws Exception {
        return cashireServices.placeOrder(cashierDTO);
    }
    
    

}
