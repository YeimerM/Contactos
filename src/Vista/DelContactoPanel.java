package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DelContactoPanel {

    private JPanel panelContenido;
    private JButton btnMenu, btnEliminar;
    private JLabel lblIdEliminar;
    private JTextField txtfIdEliminar;

    public DelContactoPanel(){
        initComp();
    }

    private void initComp() {
        panelContenido = new JPanel(new BorderLayout());


        JPanel panelEliminar = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;

        lblIdEliminar = new JLabel("Id del contacto a eliminar");
        panelEliminar.add(lblIdEliminar,gbc);

        gbc.gridy = 1;

        txtfIdEliminar = new JTextField("", 10);
        panelEliminar.add(txtfIdEliminar,gbc);


        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));
        btnMenu = new JButton("Regresar al Menu");
        panelBotones.add(btnMenu);

        btnEliminar = new JButton("Eliminar Contacto");
        panelBotones.add(btnEliminar);


        panelContenido.add(panelEliminar,BorderLayout.CENTER);
        panelContenido.add(panelBotones, BorderLayout.SOUTH);
        panelContenido.setVisible(true);
    }

    public JPanel getPanelContenido() {
        return panelContenido;
    }

    public int getTxtfIdEliminar() {
        return Integer.parseInt(txtfIdEliminar.getText());
    }

    public void addEliminarBtnListener(ActionListener listener){
        btnEliminar.addActionListener(listener);
    }
    public void addMenuBtnListener(ActionListener listener){
        btnMenu.addActionListener(listener);
    }
}
