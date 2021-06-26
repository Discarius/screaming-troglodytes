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
        return 5;   
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmb.get(row).getNo();
            case 1:
                return lmb.get(row).getNama_bibit();
//            case 2:
//                return lmb.get(row).getHarga_bibit();
//            case 3:
//                return lmb.get(row).getBiaya_perawatan();
//            case 4:
//                return lmb.get(row).getHasil_kg();
//            case 5:
//                return lmb.get(row).getHasil_harga_kg();
//            case 6:
//                return lmb.get(row).getModal();
//            case 7:
//                return lmb.get(row).getTotal_hasil();
//            case 8:
//                return lmb.get(row).getRatio_kotor();
            case 2:
                return lmb.get(row).getModal();
            case 3:
                return lmb.get(row).getTotal_hasil();
            case 4:
                return lmb.get(row).getRatio_kotor();
            default:
                return null;       
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "No";
            case 1:
                return "Tanaman";
//            case 2:
//                return "Harga Bibit";
//            case 3:
//                return "Perawatan";
//            case 4:
//                return "Berat Panen";
//            case 5:
//                return "Harga / Kg";
//            case 6:
//                return "Modal";
//            case 7:
//                return "Total Hasil";
//            case 8:
//                return "Ratio Kotor";
            case 2:
                return "Modal";
            case 3:
                return "Total Hasil";
            case 4:
                return "Ratio Kotor";
            default:
                return null;
        }
    }
    
}