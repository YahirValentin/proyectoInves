/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import java.awt.*;

public class Res extends JFrame {


    public Res(double clientesEnElSistema, double clientesEnLaCola,
                     double tiempoEnElSistema, double tiempoEnLaCola,
                     double probabilidadDeDesocupado, double probabilidadDeOcupado,
                     String unidad, double probabilidadDeNumeroDeClientes, double numeroDeClientes) {
        super("Resultado");
        setBounds(0, 0, 500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);

        GridLayout gl = new GridLayout(7, 2, 0, 5);
        setLayout(gl);
        add(new JLabel(clientesEnElSistema +" clientes esperando en el sistema."));
        add(new JLabel(clientesEnLaCola + " clientes esperando en la cola."));
        add(new JLabel(tiempoEnElSistema + " " + unidad + " de espera en el sistema."));
        add(new JLabel(tiempoEnLaCola + " " + unidad + " de espera en la cola."));
        add(new JLabel(probabilidadDeDesocupado + "% de que este desocupado el sistema."));
        add(new JLabel(probabilidadDeOcupado + "% de que este ocupado el sistema."));
        add(new JLabel(probabilidadDeNumeroDeClientes + "% de que haya " + numeroDeClientes +
                " clientes en el sistema."));

    }
}
