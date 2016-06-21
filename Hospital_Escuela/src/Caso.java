/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.algorithm.*;

/**
 *
 * @author manuel
 */
public class Caso extends Thread {

    Emergencia ranking;
    Ubicacion lugar;
    Graph grafo = new SingleGraph("");
    ArrayList<Hospital> lista = new ArrayList();

    public Caso(Emergencia ranking, Ubicacion lugar, String name, Graph graph, ArrayList<Hospital> lis) {
        super(name);
        this.ranking = ranking;
        this.lugar = lugar;
        this.grafo = graph;
        this.lista = lis;
    }

    public void run() {
        double parametro = 10000;
        double comparacion = 0;
        Hospital hospitalSeleccionado = new Hospital();
        Ambulancia ambulanciaSeleccionada = new Ambulancia();
        boolean find = false;
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "length");
        dijkstra.init(grafo);
        dijkstra.setSource(grafo.getNode(lugar.getNombre()));
        dijkstra.compute();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getRanking().compareTo(ranking) == 0 || lista.get(i).getRanking().compareTo(ranking) < 0) {
                if (lista.get(i).getParamedicos().size() >= 3) {
                    for (int k = 0; k < lista.get(i).getAmbulancias().size(); k++) {
                        comparacion = (dijkstra.getPathLength(grafo.getNode(lista.get(i).getNombre())) / lista.get(i).getAmbulancias()
                                .get(k).getMaxVelocidad());
                        if (comparacion < parametro) {
                            find = true;
                            parametro = comparacion;
                            comparacion = 0;
                            hospitalSeleccionado = lista.get(i);
                            ambulanciaSeleccionada = lista.get(i).getAmbulancias().get(k);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El hospital : " + lista.get(i).getNombre() + " no tiene los recursos necesarios",
                            "Atencion", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El hospital : " + lista.get(i).getNombre() + " no tiene el rango necesario",
                        "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (find) {
            PriorityQueue<Paramedico> cola = new PriorityQueue();
            PriorityQueue<Ambulancia> cola2 = new PriorityQueue();

            for (int i = 0; i < 3; i++) {
                cola.add(hospitalSeleccionado.getParamedicos().poll());
            }
            cola2.add(ambulanciaSeleccionada);
            hospitalSeleccionado.getAmbulancias().remove(ambulanciaSeleccionada);
            JOptionPane.showMessageDialog(null, "La emergencia sera atendidad por: " + hospitalSeleccionado.getNombre(),
                    "Atencion", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "Salio la ambulancia con placa " + ambulanciaSeleccionada.getPlaca(),
                    "Atencion", JOptionPane.WARNING_MESSAGE);
            esperarXsegundos((int) parametro);

            for (int i = 0; i < 3; i++) {
                hospitalSeleccionado.getParamedicos().add(cola.poll());
            }
            hospitalSeleccionado.getAmbulancias().add(cola2.poll());
            JOptionPane.showMessageDialog(null, "La ambulancia con placa " + ambulanciaSeleccionada.getPlaca() + " ha regresado",
                    "Atencion", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay hospitales disponibles para atender su emergencia",
                    "Atencion", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void esperarXsegundos(int segundos) {
        try {
            this.sleep(segundos * 2000);
        } catch (InterruptedException ex) {
            this.currentThread().interrupt();
        }
    }

}
