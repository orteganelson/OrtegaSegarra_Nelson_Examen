/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.iDao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.SortedSet;

/**
 *
 * @author Usuario
 */
public abstract class ElectrodomesticoDAO implements IElectrodomesticoDAO{
    private SortedSet<Electrodomestico> lista;
    
    @Override
    public void crearLavadora(Lavadora lavadora){
        lista.addAll(lista);
    }
    
    @Override
    public void crearTelevision(Television television){
        
    }
    
    @Override
    public List<Lavadora> listarLavadora(){
        
    }
    
    @Override
    public List<Television> listarTelevision(){
        
    }
}
