/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class Paramedico {
    String nombre;
    int edad;
    String id;
    int ranking;
    Hospital complejo;

    public Paramedico() {
    }

    public Paramedico(String nombre, int edad, String id, int ranking, Hospital complejo) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.ranking = ranking;
        this.complejo = complejo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Hospital getComplejo() {
        return complejo;
    }

    public void setComplejo(Hospital complejo) {
        this.complejo = complejo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
