package Controlador;

import Modelo.*;
import Vista.AddContactoPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

            // Verificar el TipoTelefono
            TipoTelefono tipoT;
            if (Objects.equals(view.getTipoTelefono(), "Móvil")){
                tipoT = TipoTelefono.MOVIL;
            } else if (Objects.equals(view.getTipoTelefono(), "Casa")) {
                tipoT = TipoTelefono.CASA;
            } else{
                tipoT = TipoTelefono.OFICINA;
            }

            telefonos.add(new Telefono(view.getTxtfTelefonos().getText(),tipoT));
            List<Direccion> direcciones = new ArrayList<>();

            // Verificar el TipoContacto
            TipoContacto tipoC;
            if (Objects.equals(view.getTipoContacto(), "Estudiante")){
                tipoC = TipoContacto.ESTUDIANTE;
            } else if (Objects.equals(view.getTipoTelefono(), "Profesor")) {
                tipoC = TipoContacto.PROFESOR;
            } else{
                tipoC = TipoContacto.EMPLEADO;
            }
            
            model.agregarContacto(new Contacto(id,fecha,nombres,apellidos,direcciones,telefonos,tipoC));
            List<Contacto> contactos = model.listarContactos();
            String idC = String.valueOf(contactos.get(0).getId());
            System.out.println("ID: " + idC);
            System.out.println("Nombres: " + contactos.get(0).getNombres());
            System.out.println("Tipo Telefono: " + contactos.get(0).getTelefonos().get(0).getTipoTelefono());
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
