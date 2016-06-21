
import java.util.ArrayList;
import java.util.PriorityQueue;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manuel
 */
public class Hospital extends Ubicacion {

    int maxParamedicos;
    int maxAmbulancias;
    Emergencia ranking;
    ArrayList<Ambulancia> ambulancias = new ArrayList();
    PriorityQueue<Paramedico> paramedicos = new PriorityQueue();

    public Hospital() {
    }

    public Hospital(int maxParamedicos, int maxAmbulancias, Emergencia ranking, String nombre, String direccion) {
        super(nombre, direccion);
        this.maxParamedicos = maxParamedicos;
        this.maxAmbulancias = maxAmbulancias;
        this.ranking = ranking;

    }

    public int getMaxParamedicos() {
        return maxParamedicos;
    }

    public void setMaxParamedicos(int maxParamedicos) {
        this.maxParamedicos = maxParamedicos;
    }

    public int getMaxAmbulancias() {
        return maxAmbulancias;
    }

    public void setMaxAmbulancias(int maxAmbulancias) {
        this.maxAmbulancias = maxAmbulancias;
    }

    public Emergencia getRanking() {
        return ranking;
    }

    public void setRanking(Emergencia ranking) {
        this.ranking = ranking;
    }

    public ArrayList<Ambulancia> getAmbulancias() {
        return ambulancias;
    }

    public PriorityQueue<Paramedico> getParamedicos() {
        return paramedicos;
    }

    public void addAmbulancia(Ambulancia nueva) {
        this.ambulancias.add(nueva);
    }

    public void addParamedico(Paramedico nuevo) {
        this.getParamedicos().add(nuevo);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
