/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class Hospital extends Ubicacion{
    int maxParamedicos;
    int maxAmbulancias;
    int ranking;

    public Hospital() {
    }

    public Hospital(int maxParamedicos, int maxAmbulancias, int ranking, String nombre, String direccion) {
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

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
