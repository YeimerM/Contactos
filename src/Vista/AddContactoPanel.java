package Vista;

import javax.swing.*;
import java.awt.*;

public class AddContactoPanel {

    private JPanel panelContenido;

    /*

this.id = id;
this.fechaNacimiento = fechaNacimiento;
this.nombres = nombres;
this.apellidos = apellidos;
this.direcciones = direcciones;
this.telefonos = telefonos;
this.tipoContacto = tipoContacto;

*/
    private JLabel lblId, lblFechaN, lblNombres, lblApellidos, lblDirecciones, lblTelefonos, lblTipoContacto;
    private JTextField txtfId, txtfFechaN, txtfNombres, txtfApellidos, txtfDirecciones, txtfTelefonos, txtfTipoContacto;

    public AddContactoPanel(){
        initComp();
    }

    private void initComp() {

        panelContenido = new JPanel(new BorderLayout());


        // Panel Botones

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

        gbc.gridx = 0;
        gbc.gridy = 1;
        lblFechaN = new JLabel("Fecha de Nacimiento");
        panelDatos.add(lblFechaN,gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        lblNombres = new JLabel("Nombres");
        panelDatos.add(lblNombres,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        lblApellidos = new JLabel("Apellidos");
        panelDatos.add(lblApellidos,gbc);




        panelContenido.add(panelDatos);
        panelContenido.setVisible(true);
    }

    public JPanel getPanelContenido() {
        return panelContenido;
    }
}
