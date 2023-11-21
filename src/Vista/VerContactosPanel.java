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


        JPanel panelBotones = new JPanel(new GridBagLayout());
        panelBotones.setOpaque(false);

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
        panelBotones.add(btnEstudiante,gbc);
        gbc.gridy = 1;
        panelBotones.add(btnProfesor,gbc);
        gbc.gridy = 2;
        panelBotones.add(btnEmpleado,gbc);

        panelContenido.add(panelBotones, BorderLayout.CENTER);
        panelContenido.setVisible(true);
    }

    public JPanel getPanelContenido() {
        return panelContenido;
    }

    public void addLabelListener(ActionListener listener) {

    }
}
