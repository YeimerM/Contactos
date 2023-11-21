package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddContactoPanel {

    private JPanel panelContenido;

    private JLabel lblId, lblFechaN, lblNombres, lblApellidos, lblDirecciones, lblTelefonos, lblTipoContacto;
    private JTextField txtfId, txtfFechaN, txtfNombres, txtfApellidos, txtfDirecciones, txtfTelefonos, txtfTipoContacto;
    private JButton btnGuardar;
    private JButton btnMenu;
    private JPanel panelBotones;
    private JButton btnMasDirecciones;
    private JButton btnMasTelefonos;
    private JComboBox<String> tipoTelefono;

    public AddContactoPanel(){
        initComp();
    }

    private void initComp() {

        panelContenido = new JPanel(new BorderLayout());


        // Panel Datos

        JPanel panelDatos = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        // Son 7 labels y 7 campos de texto
        // (GridX = 0 y GridX = 1 es hasta el cuarto dato, es decir, hasta apellidos)
        // (GridX = 2 y GridX = 3 es para Direcciones, Telefonos y Tipo de contacto)

        gbc.gridx = 0;
        gbc.gridy = 0;
        lblId = new JLabel("ID");
        panelDatos.add(lblId,gbc);

        gbc.gridx = 1;
        txtfId = new JTextField("",10);
        panelDatos.add(txtfId);

        gbc.gridx = 2;
        lblDirecciones = new JLabel("Direccion");
        panelDatos.add(lblDirecciones,gbc);

        gbc.gridx = 3;
        txtfDirecciones = new JTextField("",10);
        panelDatos.add(txtfDirecciones,gbc);

        gbc.gridx = 4;
        btnMasDirecciones = new JButton("+");
        panelDatos.add(btnMasDirecciones,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        lblFechaN = new JLabel("Fecha de Nacimiento");
        panelDatos.add(lblFechaN,gbc);

        gbc.gridx = 1;
        txtfFechaN = new JTextField("",10);
        panelDatos.add(txtfFechaN,gbc);

        gbc.gridx = 2;
        lblTelefonos = new JLabel("Telefono");
        panelDatos.add(lblTelefonos,gbc);

        gbc.gridx = 3;
        txtfTelefonos = new JTextField("",10);
        panelDatos.add(txtfTelefonos,gbc);

        gbc.gridx = 4;
        tipoTelefono = new JComboBox<String>();

        tipoTelefono.addItem("Móvil");
        tipoTelefono.addItem("Casa");
        tipoTelefono.addItem("Oficina");

        panelDatos.add(tipoTelefono,gbc);

        gbc.gridx = 5;
        btnMasTelefonos = new JButton("+");
        panelDatos.add(btnMasTelefonos,gbc);



        gbc.gridx = 0;
        gbc.gridy = 2;
        lblNombres = new JLabel("Nombres");
        panelDatos.add(lblNombres,gbc);

        gbc.gridx = 1;
        txtfNombres = new JTextField("",10);
        panelDatos.add(txtfNombres,gbc);

        gbc.gridx = 2;
        lblTipoContacto = new JLabel("Tipo de Contacto");
        panelDatos.add(lblTipoContacto,gbc);

        gbc.gridx = 3;
        txtfTipoContacto = new JTextField("",10);
        panelDatos.add(txtfTipoContacto,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        lblApellidos = new JLabel("Apellidos");
        panelDatos.add(lblApellidos,gbc);

        gbc.gridx = 1;
        txtfApellidos = new JTextField("",10);
        panelDatos.add(txtfApellidos,gbc);


        // Botones inferiores
        panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));

        btnMenu = new JButton("Regresar al Menu");
        panelBotones.add(btnMenu);

        btnGuardar = new JButton("Guardar Contacto");
        panelBotones.add(btnGuardar);


        panelContenido.add(panelDatos,BorderLayout.CENTER);
        panelContenido.add(panelBotones, BorderLayout.SOUTH);
        panelContenido.setVisible(true);
    }

    public JPanel getPanelContenido() {
        return panelContenido;
    }

    public JTextField getTxtfId() {
        return txtfId;
    }

    public JTextField getTxtfFechaN() {
        return txtfFechaN;
    }

    public JTextField getTxtfNombres() {
        return txtfNombres;
    }

    public JTextField getTxtfApellidos() {
        return txtfApellidos;
    }

    public JTextField getTxtfDirecciones() {
        return txtfDirecciones;
    }

    public JTextField getTxtfTelefonos() {
        return txtfTelefonos;
    }

    public JTextField getTxtfTipoContacto() {
        return txtfTipoContacto;
    }

    public String getTipoTelefono() {
        return (String)tipoTelefono.getSelectedItem();
    }

    public void addGuardarBtnListener(ActionListener listener){
        btnGuardar.addActionListener(listener);
    }
    public void addMenuBtnListener(ActionListener listener){
        btnMenu.addActionListener(listener);
    }
}
