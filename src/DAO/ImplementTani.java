/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModTani;
import java.util.List;
/**
 *
 * @author user
 */
public interface ImplementTani {
    
    public void insert(ModTani mb);
    public void delete(int no);
    public void update(ModTani mb);
    public List<ModTani> getAll();
    public List<ModTani> getCariNama(String nama_bibit); 
}
