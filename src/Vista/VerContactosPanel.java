package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class VerContactosPanel {
    private JButton btnEstudiante;
    private JButton btnProfesor;
    private JButton btnEmpleado;
    private JPanel panelContenido;
    private JButton btnRegresar;
    private JPanel panelTipos;
    private JPanel panelInfo;
    private JList<Object> infoContactos;
    private DefaultListModel<Object> modeloLista;
    private JPanel panelBotones;

    public VerContactosPanel(){
        initComp();
    }

    private void initComp() {

        // Panel Contenido
        ImageIcon bgImg = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagenes/fondoMenu.jpg")));
        panelContenido = new JPanel(new BorderLayout()){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bgImg.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };


        panelTipos = new JPanel(new GridBagLayout());
        panelTipos.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        btnEstudiante = new JButton("Estudiantes");
        btnProfesor = new JButton("Profesores");
        btnEmpleado = new JButton("Empleados");

        btnEstudiante.setBorderPainted(false);
        btnEstudiante.setContentAreaFilled(false);
        btnEstudiante.setFocusPainted(false);
        btnEstudiante.setFont(new Font("SansSerif",Font.PLAIN,38));

        btnProfesor.setBorderPainted(false);
        btnProfesor.setContentAreaFilled(false);
        btnProfesor.setFocusPainted(false);
        btnProfesor.setFont(new Font("SansSerif",Font.PLAIN,38));

        btnEmpleado.setBorderPainted(false);
        btnEmpleado.setContentAreaFilled(false);
        btnEmpleado.setFocusPainted(false);
        btnEmpleado.setFont(new Font("SansSerif",Font.PLAIN,38));

        gbc.gridx = 0;
        gbc.gridy = 0;
        panelTipos.add(btnEstudiante,gbc);
        gbc.gridy = 1;
        panelTipos.add(btnProfesor,gbc);
        gbc.gridy = 2;
        panelTipos.add(btnEmpleado,gbc);

        btnRegresar = new JButton("Regresar");



        panelContenido.add(panelTipos, BorderLayout.CENTER);
        panelContenido.setVisible(true);
    }

    public JPanel getPanelContenido() {
        return panelContenido;
    }

    public DefaultListModel<Object> getModeloLista() {
        return modeloLista;
    }

    public JPanel getPanelTipos() {
        return panelTipos;
    }

    public JPanel getPanelInfo() {
        return panelInfo;
    }

    public JPanel getPanelBotones() {
        return panelBotones;
    }

    public void verInfoContactos() {
        panelTipos.setVisible(false);
        panelInfo = new JPanel(new BorderLayout()); // antes panelEstudiante
        modeloLista = new DefaultListModel<>();

        infoContactos = new JList<>(modeloLista); // antes contactoEstudiantes
        JScrollPane scrollPane = new JScrollPane(infoContactos);

        panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        panelBotones.add(btnRegresar);


        panelInfo.add(scrollPane, BorderLayout.CENTER);
        panelInfo.add(panelBotones, BorderLayout.SOUTH);
        panelContenido.add(panelInfo, BorderLayout.CENTER);

        panelContenido.add(panelInfo,BorderLayout.CENTER);
        panelContenido.add(panelBotones,BorderLayout.SOUTH);
    }

    public void addEstudianteBtnListener(ActionListener listener) {
        btnEstudiante.addActionListener(listener);
    }
    public void addProfesorBtnListener(ActionListener listener) {
        btnProfesor.addActionListener(listener);
    }
    public void addEmpleadoBtnListener(ActionListener listener) {
        btnEmpleado.addActionListener(listener);
    }
    public void addRegresarBtnListener(ActionListener listener){
        btnRegresar.addActionListener(listener);
    }
}
