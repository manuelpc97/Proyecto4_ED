/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class Emergencia {
    int grado;
    Ubicacion lugar;

    public Emergencia() {
    }

    public Emergencia(int grado, Ubicacion lugar) {
        this.grado = grado;
        this.lugar = lugar;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public Ubicacion getLugar() {
        return lugar;
    }

    public void setLugar(Ubicacion lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return grado+"";
    }
    
    
}
