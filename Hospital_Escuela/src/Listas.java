
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class Listas implements Serializable{
    ArrayList<Hospital> hospitales= new ArrayList();
    ArrayList<Ambulancia> ambulancias = new ArrayList();
    ArrayList<Ubicacion> ubicaciones = new ArrayList();
    ArrayList<Paramedico> paramedicos = new ArrayList();

    public Listas() {
    }

    public Listas(ArrayList<Hospital> lista1, ArrayList<Ambulancia> lista2,ArrayList<Ubicacion> lista3,ArrayList<Paramedico> lista4) {
        this.hospitales = lista1;
        this.ambulancias = lista2;
        this.paramedicos = lista4;
        this.ubicaciones = lista3;
        
    }

    public ArrayList<Hospital> getHospitales() {
        return hospitales;
    }

    public ArrayList<Ambulancia> getAmbulancias() {
        return ambulancias;
    }

    public ArrayList<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public ArrayList<Paramedico> getParamedicos() {
        return paramedicos;
    }
}
