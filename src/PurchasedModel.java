
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rose ann bahala
 */
public class PurchasedModel {
 public DefaultTableModel PurchModel= new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Purchase ID", "Name", "Location", "City", "Quantity", "Total", "Cash", "Product ID"
    }
){
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
    
};
}