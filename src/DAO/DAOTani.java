/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

//import Koneksi.KoneksiDB;
import Koneksi.KoneksiVer2DB;
import Model.ModTani;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DAOTani implements ImplementTani{

    Connection connection;
    public DAOTani(){
        connection=KoneksiVer2DB.connection();
    }
    
    //SQL QUERY =======================================
    final String insert = "INSERT INTO data_tani (nama_bibit, harga_bibit, biaya_perawatan, hasil_kg, hasil_harga_kg, modal, total_hasil, ratio_kotor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
    final String delete = "DELETE FROM data_tani WHERE no=?";
    
    final String update = "UPDATE data_tani SET nama_bibit=?, harga_bibit=?, biaya_perawatan=?, hasil_kg=?, hasil_harga_kg=?, modal=?, total_hasil=?, ratio_kotor=? WHERE no=?";
    
    final String select = "SELECT * FROM data_tani";
    
    final String CariNama = "SELECT * FROM data_tani WHERE nama_bibit like ?";    
    
    //INSERT =======================================
    @Override
    public void insert(ModTani mb) {
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement(insert);
            statement.setString(1, mb.getNama_bibit());
            statement.setDouble(2, mb.getHarga_bibit());
            statement.setDouble(3, mb.getBiaya_perawatan());
            statement.setDouble(4, mb.getHasil_kg());
            statement.setDouble(5, mb.getHasil_harga_kg());
            statement.setDouble(6, mb.getModal());
            statement.setDouble(7, mb.getTotal_hasil());
            statement.setDouble(8, mb.getRatio_kotor());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                mb.setNo(rs.getInt(1));
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    //DELETE =======================================
    @Override
    public void delete(int no) {
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    //UPDATE =======================================
    @Override
    public void update(ModTani mb) {
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, mb.getNama_bibit());
            statement.setDouble(2, mb.getHarga_bibit());
            statement.setDouble(3, mb.getBiaya_perawatan());
            statement.setDouble(4, mb.getHasil_kg());
            statement.setDouble(5, mb.getHasil_harga_kg());
            statement.setDouble(6, mb.getModal());
            statement.setDouble(7, mb.getTotal_hasil());
            statement.setDouble(8, mb.getRatio_kotor());
            statement.setInt(9, mb.getNo());
            statement.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    //ISI TABEL =======================================
    @Override
    public List<ModTani> getAll() {
        List<ModTani> lmb = null;
        
        try{
            lmb = new ArrayList<ModTani>();
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModTani mb = new ModTani();
                mb.setNo(rs.getInt("no"));
                mb.setNama_bibit(rs.getString("nama_bibit"));
                mb.setHarga_bibit(rs.getDouble("harga_bibit"));
                mb.setBiaya_perawatan(rs.getDouble("biaya_perawatan"));
                mb.setHasil_kg(rs.getDouble("hasil_kg"));
                mb.setHasil_harga_kg(rs.getDouble("hasil_harga_kg"));
                mb.setModal(rs.getDouble("modal"));
                mb.setTotal_hasil(rs.getDouble("total_hasil"));
                mb.setRatio_kotor(rs.getDouble("ratio_kotor"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }

    //CARI =======================================
    @Override
    public List<ModTani> getCariNama(String nama_bibit) {
        List<ModTani> lmb = null;
  
        try{
            lmb = new ArrayList<ModTani>();
            PreparedStatement st = connection.prepareStatement(CariNama);
            st.setString(1, "%" + nama_bibit + "%");
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ModTani mb = new ModTani();
                mb.setNo(rs.getInt("no"));
                mb.setNama_bibit(rs.getString("nama_bibit"));
                mb.setHarga_bibit(rs.getDouble("harga_bibit"));
                mb.setBiaya_perawatan(rs.getDouble("biaya_perawatan"));
                mb.setHasil_kg(rs.getDouble("hasil_kg"));
                mb.setHasil_harga_kg(rs.getDouble("hasil_harga_kg"));
                mb.setModal(rs.getDouble("modal"));
                mb.setTotal_hasil(rs.getDouble("total_hasil"));
                mb.setRatio_kotor(rs.getDouble("ratio_kotor"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }
    
}