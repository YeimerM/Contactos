package Controlador;

import Vista.AddContactoPanel;
import Vista.AgendaView;
import Vista.VerContactosPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaController {
    private AgendaView view;

    public AgendaController(AgendaView view){
        this.view = view;

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
        }
    }

    public JPanel getPanelListaContactos() {
        VerContactosPanel contactosView = new VerContactosPanel();
        VerContactosController contactosController = new VerContactosController(contactosView);
        return contactosView.getPanelContenido(); // retornar el panel a mostrar (En el panel que se quiere tomar hacer funcion que devuelva ese panel)
    }

    public JPanel getPanelAddContacto(){
        AddContactoPanel addContactosView = new AddContactoPanel();
        AddContactoCtrller addContactoCtrller = new AddContactoCtrller(addContactosView);
        return addContactosView.getPanelContenido();
    }
}