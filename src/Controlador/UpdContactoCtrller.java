package Controlador;

import Modelo.*;
import Vista.UpdContactoPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UpdContactoCtrller {
    UpdContactoPanel view = new UpdContactoPanel();
    Agenda model = new Agenda();

    public UpdContactoCtrller(UpdContactoPanel view, Agenda model){
        this.view = view;
        this.model = model;

        view.addRegresarBtnListener(new RegresarBtnListener());
        view.addSiguienteBtnListener(new SiguienteBtnListener());
        view.addActualizarBtnListener(new ActualizarBtnListener());

        Direccion direccion1 = new Direccion("Calle 123, Ciudad A");
        List<Direccion> direcciones1 = new ArrayList<>();
        direcciones1.add(direccion1);

        Telefono telefono1 = new Telefono("123-456-7890", TipoTelefono.MOVIL);
        List<Telefono> telefonos1 = new ArrayList<>();
        telefonos1.add(telefono1);

        Contacto contacto1 = new Contacto(1, "01/01/1990", "Juan", "Perez", direcciones1, telefonos1, TipoContacto.EMPLEADO);
        model.agregarContacto(contacto1);
    }

    class RegresarBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.getPanelContenido().setVisible(false);
        }
    }

    class SiguienteBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Actual...");
            if (!model.existeContacto(view.getTxtfIdContacto())){
                System.out.println("No se encontro el ID: " + view.getTxtfIdContacto());
            }
            System.out.println("Estas Actua..");
            //model.actualizarContacto(new Contacto());
            view.verUpdContacto();
        }
    }
    class ActualizarBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
