/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class ModTblTani extends AbstractTableModel{

    List<ModTani> lmb; 

    public ModTblTani(List<ModTani> lmb) {
        this.lmb = lmb;
    }
    
    
    
    @Override
    public int getRowCount() {
        return lmb.size();
        
    }

    @Override
    public int getColumnCount() {
        return 9;
        
    }

    @Override
    public Object getValueAt(int row, int column) {

        switch(column){
            case 0:
                return lmb.get(row).getNo();
            case 1:
                return lmb.get(row).getNama_bibit();
            case 2:
                return lmb.get(row).getHarga_bibit();
            case 3:
                return lmb.get(row).getBiaya_perawatan();
            case 4:
                return lmb.get(row).getModal();
            case 5:
                return lmb.get(row).getHasil_kg();
            case 6:
                return lmb.get(row).getHasil_harga_kg();
            case 7:
                return lmb.get(row).getTotal_hasil();
            case 8:
                return lmb.get(row).getRatio_kotor();
            default:
                return null;
                
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "no";
            case 1:
                return "nama_bibit";
            case 2:
                return "harga_bibit";
            case 3:
                return "biaya_perawatan";
            case 4:
                return "modal";
            case 5:
                return "hasil_kg";
            case 6:
                return "hasil_harga_kg";
            case 7:
                return "total_hasil";
            case 8:
                return "ratio_kotor";
            default:
                return null;
        }
    }
    
    
    
}
