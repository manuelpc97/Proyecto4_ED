/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class Ambulancia {
    String placa;
    String año;
    double maxVelocidad;
    Hospital complejo;

    public Ambulancia() {
    }

    public Ambulancia(String placa, String año, double maxVelocidad, Hospital complejo) {
        this.placa = placa;
        this.año = año;
        this.maxVelocidad = maxVelocidad;
        this.complejo = complejo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(double maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    public Hospital getComplejo() {
        return complejo;
    }

    public void setComplejo(Hospital complejo) {
        this.complejo = complejo;
    }

    @Override
    public String toString() {
        return placa;
    }
    
    
}
