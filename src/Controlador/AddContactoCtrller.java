package Controlador;

import Modelo.*;
import Vista.AddContactoPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AddContactoCtrller {
    private AddContactoPanel view;
    private Agenda model;

    public AddContactoCtrller(AddContactoPanel view, Agenda model){
        this.view = view;
        this.model = model;

        view.addGuardarBtnListener(new GuardarBtnListener());
        view.addMenuBtnListener(new MenuBtnListener());
    }

    class GuardarBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Guardando contacto");
            int id = Integer.parseInt(view.getTxtfId().getText());
            String fecha = view.getTxtfFechaN().getText();
            String nombres = view.getTxtfNombres().getText();
            String apellidos = view.getTxtfApellidos().getText();
            List<Telefono> telefonos = new ArrayList<>();
            TipoTelefono tipoT = TipoTelefono.CASA;
            telefonos.add(new Telefono(view.getTxtfTelefonos().getText(),tipoT));
            List<Direccion> direcciones = new ArrayList<>();
            TipoContacto tipoC = TipoContacto.ESTUDIANTE;
            model.agregarContacto(new Contacto(id,fecha,nombres,apellidos,direcciones,telefonos,tipoC));
            List<Contacto> contactos = model.listarContactos();
            String idC = String.valueOf(contactos.get(0).getId());
            System.out.println("ID: " + idC);
        }
    }
    class MenuBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Volviendo...");
            view.getPanelContenido().setVisible(false);
        }
    }
}
