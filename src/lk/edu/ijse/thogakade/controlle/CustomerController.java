/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.controlle;

import java.util.List;
import lk.edu.ijse.thogakade.dto.CustomerDTO;

/**
 *
 * @author USER
 */
public interface CustomerController {
    public boolean saveItem(CustomerDTO customerDTO)throws Exception;
    
    public CustomerDTO getCustomerName(String name)throws Exception;
    
    public List<CustomerDTO> viewCustomer() throws Exception;
    
    public boolean updateCustomer(CustomerDTO itemDTO)throws Exception;
    
    public boolean deleteCustomer(String id)throws Exception;
}
