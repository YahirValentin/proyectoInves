/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class ProyectoInves extends JFrame {
    private JTextField fieldLambda = new JTextField(10);
    private JTextField fieldMiu = new JTextField(10);
    private JTextField fieldUnidad = new JTextField(10);
    private JButton btnCalcular = new JButton("Calcular");
    private JButton btnSalir = new JButton("Salir");
    private JComboBox listaDeUnidadesDelProblema;
    private JComboBox listaDeUnidadesDelResultado;
    private JTextField fieldNumeroDeClientes = new JTextField(10);

    public ProyectoInves() {
        super("Teoria de colas");
        setIconImage(new Image() {
            
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }
            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }


            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addItemsToListaDeUnidadesDelProblema();
        addItemsToListaDeUnidadesDelResultado();
        // Panel de datos
        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout(3,2,0,5);
        panelDatos.setLayout(gl);
        panelDatos.add(new JLabel("Ingresar λ: "));
        panelDatos.add(fieldLambda);
        panelDatos.add(new JLabel("Ingresar μ: "));
        panelDatos.add(fieldMiu);
        panelDatos.add(new JLabel("Ingresar prob. de n clientes:"));
        panelDatos.add(fieldNumeroDeClientes);
        JPanel panelUnidades = new JPanel();
        panelUnidades.setLayout(new GridLayout(1, 4, 0, 5));
        panelUnidades.add(new JLabel("Elegir lo que pida el problema: "));
        panelUnidades.add(getListaDeUnidadesDelProblema());
        panelUnidades.add(new JLabel("Elegir lo que pida el problema: "));
        panelUnidades.add(getListaDeUnidadesDelResultado());
        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        btnCalcular.addActionListener(
                new ECalcular(
                        fieldLambda,
                        fieldMiu,
                        listaDeUnidadesDelProblema,
                        listaDeUnidadesDelResultado,
                        fieldNumeroDeClientes
                )
        );
        btnSalir.addActionListener(new ESalir());

        panelBotones.add(btnCalcular);
        panelBotones.add(btnSalir);

        Container cp = getContentPane();
        cp.add(panelUnidades, BorderLayout.NORTH);
        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(panelBotones, BorderLayout.SOUTH);
        setSize(750, 200);
    }

    private void addItemsToListaDeUnidadesDelResultado() {
        this.listaDeUnidadesDelResultado = new JComboBox();
        listaDeUnidadesDelResultado.addItem("Minutos");
        listaDeUnidadesDelResultado.addItem("Horas");
        listaDeUnidadesDelResultado.setSelectedIndex(0);
    }

    private void addItemsToListaDeUnidadesDelProblema() {
        this.listaDeUnidadesDelProblema = new JComboBox();
        getListaDeUnidadesDelProblema().addItem("Horas");
        getListaDeUnidadesDelProblema().addItem("Minutos");
        getListaDeUnidadesDelProblema().setSelectedIndex(0);
    }

    public JComboBox<String> getListaDeUnidadesDelResultado() {
        return listaDeUnidadesDelResultado;
    }

    public JComboBox getListaDeUnidadesDelProblema() {
        return listaDeUnidadesDelProblema;
    }

    public JTextField getFieldNumeroDeClientes() {
        return fieldNumeroDeClientes;
    }
}
