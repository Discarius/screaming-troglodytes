/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOTani;
import DAO.ImplementTani;
import Model.ModTani;
import Model.ModTblTani;
import View.FormHasil;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author ACER
 */
public class ControllerTani {
    FormHasil frame;
    ImplementTani ImplementTani;
    List<ModTani> lmb;
    
    public ControllerTani(FormHasil frame){
        this.frame=frame;
        ImplementTani=new DAOTani();
        lmb=ImplementTani.getAll();
    }
    
    //CLEAR FIELD =======================================
    public void reset(){
        frame.getTf_no().setText("");
        frame.getTf_nama().setText("");
        frame.getTf_hargabbt().setText("");
        frame.getTf_perawatan().setText("");
        frame.getTf_hasil().setText("");
        frame.getTf_hargakg().setText("");
    }
    
    //ISI TABEL =======================================
    public void isiTabel(){
        lmb=ImplementTani.getAll();
        ModTblTani mtb=new ModTblTani(lmb);
        frame.getjTable1().setModel(mtb);
    }
    
    //ISI FIELD =======================================
    public void isiField(int row){
        frame.getTf_no().setText(String.valueOf(lmb.get(row).getNo()));
        frame.getTf_nama().setText(lmb.get(row).getNama_bibit());
        frame.getTf_hargabbt().setText(String.valueOf(lmb.get(row).getHarga_bibit()));
        frame.getTf_perawatan().setText(String.valueOf(lmb.get(row).getBiaya_perawatan()));
        frame.getTf_hasil().setText(String.valueOf(lmb.get(row).getHasil_kg()));
        frame.getTf_hargakg().setText(String.valueOf(lmb.get(row).getHasil_harga_kg()));
    }
    
    //INSERT =======================================
    public void insert(){
        if(!frame.getTf_nama().getText().trim().isEmpty() & !frame.getTf_nama().getText().trim().isEmpty()){
            ModTani mb=new ModTani();
            
            mb.setNama_bibit(frame.getTf_nama().getText());
            mb.setHarga_bibit(Double.valueOf(frame.getTf_hargabbt().getText()));
            mb.setBiaya_perawatan(Double.valueOf(frame.getTf_perawatan().getText()));
            mb.setHasil_kg(Double.valueOf(frame.getTf_hasil().getText()));
            mb.setHasil_harga_kg(Double.valueOf(frame.getTf_hargakg().getText()));
            mb.setModal(mb.getHarga_bibit()+mb.getBiaya_perawatan());
            mb.setTotal_hasil(mb.getHasil_kg()*mb.getHasil_harga_kg());
            mb.setRatio_kotor((mb.getTotal_hasil()-mb.getModal())/mb.getTotal_hasil()*100);
            
            ImplementTani.insert(mb);
            JOptionPane.showMessageDialog(null, "Data saved");
        } else{
            JOptionPane.showMessageDialog(null, "Failed to save Data");
        }  
    }
    
    //DELETE =======================================
    public void delete(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            int no=Integer.parseInt(frame.getTf_no().getText());
            ImplementTani.delete(no);
            JOptionPane.showMessageDialog(null, "Data deleted");
        } else{
            JOptionPane.showMessageDialog(null, "Failed to delete Data");
        }
    }
    
    //UPDATE =======================================
    public void update(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            ModTani mb=new ModTani();
            
            mb.setNo(Integer.valueOf(frame.getTf_no().getText()));
            mb.setNama_bibit(frame.getTf_nama().getText());
            mb.setHarga_bibit(Double.valueOf(frame.getTf_hargabbt().getText()));
            mb.setBiaya_perawatan(Double.valueOf(frame.getTf_perawatan().getText()));
            mb.setHasil_kg(Double.valueOf(frame.getTf_hasil().getText()));
            mb.setHasil_harga_kg(Double.valueOf(frame.getTf_hargakg().getText()));
            mb.setModal(mb.getHarga_bibit()+mb.getBiaya_perawatan());
            mb.setTotal_hasil(mb.getHasil_kg()*mb.getHasil_harga_kg());
            mb.setRatio_kotor((mb.getTotal_hasil()-mb.getModal())/mb.getTotal_hasil()*100);
            
            ImplementTani.update(mb);
            JOptionPane.showMessageDialog(null, "Data updated");
        } else{
            JOptionPane.showMessageDialog(null, "Failed to update Data");
        }
    }
    
    //CARI NAMA =======================================
    public void isiTableCariNama(){
        lmb=ImplementTani.getCariNama(frame.getTf_search().getText());
        ModTblTani mtb=new ModTblTani(lmb);
        frame.getjTable1().setModel(mtb);
    }
    
    public void cariNama(){
        if(!frame.getTf_search().getText().trim().isEmpty()){
            ImplementTani.getCariNama(frame.getTf_search().getText());
            isiTableCariNama();
        } else{
            JOptionPane.showMessageDialog(null, "Insert Seed Name");
        }
    }
    
}