package Controlador;

import Modelo.Agenda;
import Vista.AddContactoPanel;
import Vista.AgendaView;
import Vista.DelContactoPanel;
import Vista.VerContactosPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaController {
    private AgendaView view;
    private Agenda model;

    public AgendaController(AgendaView view, Agenda model){
        this.view = view;
        this.model = model;

        view.addListarbtnListener(new VerContactosListener());
        view.addAgregarbtnListener(new AddContactosListener());
        view.addActualizarbtnListener(new ActContactosListener());
        view.addEliminarbtnListener(new DelContactosListener());
    }

    class VerContactosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ver cont");
            view.getPanelPrincipal().add(getPanelListaContactos(),"VerContactos");
            view.getCardLayout().show(view.getPanelPrincipal(),"VerContactos");
        }
    }

    class AddContactosListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Add Cont");
            view.getPanelPrincipal().add(getPanelAddContacto(),"AddContacto");
            view.getCardLayout().show(view.getPanelPrincipal(),"AddContacto");
        }
    }

    class ActContactosListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Act Cont");
        }
    }

    class DelContactosListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Del Cont");
            view.getPanelPrincipal().add(getPanelDelContacto(),"DelContacto");
            view.getCardLayout().show(view.getPanelPrincipal(),"DelContacto");
        }
    }

    public JPanel getPanelListaContactos() {
        VerContactosPanel contactosView = new VerContactosPanel();
        VerContactosController contactosController = new VerContactosController(contactosView, model);
        return contactosView.getPanelContenido(); // retornar el panel a mostrar (En el panel que se quiere tomar hacer funcion que devuelva ese panel)
    }

    public JPanel getPanelAddContacto(){
        AddContactoPanel addContactosView = new AddContactoPanel();
        AddContactoCtrller addContactoCtrller = new AddContactoCtrller(addContactosView, model);
        return addContactosView.getPanelContenido();
    }

    public JPanel getPanelDelContacto(){
        DelContactoPanel delContactoView = new DelContactoPanel();
        DelContactoCtrller delContactoCtrller = new DelContactoCtrller(delContactoView,model);
        return delContactoView.getPanelContenido();
    }
}
