/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.controller.impl;

import java.util.List;
import lk.edu.ijse.thogakade.controlle.ItemController;
import lk.edu.ijse.thogakade.dto.ItemDTO;
import lk.edu.ijse.thogakade.entity.Item;
import lk.edu.ijse.thogakade.service.impl.ItemServiceImpl;
import lk.edu.ijse.thogakade.services.ItemService;


/**
 *
 * @author USER
 */
public class ItemControllerImpl implements ItemController{

    ItemService itemServices=new ItemServiceImpl();
    @Override
    public boolean saveItem(ItemDTO itemDTO) throws Exception {
        return itemServices.saveItem(new Item(itemDTO.getItemId(),itemDTO.getDescription(),itemDTO.getQty_on_hand(),itemDTO.getUnitprice()));
    }

    @Override
    public ItemDTO getItemByDescription(String name) throws Exception {
        return  itemServices.getItemByDescription(name);
    }

    @Override
    public List<ItemDTO> viewItems() throws Exception {
        return itemServices.viewItems();
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws Exception {
        return itemServices.updateItem(new Item(itemDTO.getItemId(),itemDTO.getDescription(),itemDTO.getQty_on_hand(),itemDTO.getUnitprice()));
    }

    @Override
    public boolean deleteItem(String id) throws Exception {
        return itemServices.deleteItem(id); 
    }

    
    
}
