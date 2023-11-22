package Controlador;

import Modelo.Agenda;
import Modelo.Contacto;
import Vista.DelContactoPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DelContactoCtrller {
    private DelContactoPanel view;
    private Agenda model;
    public DelContactoCtrller(DelContactoPanel view, Agenda model){
        this.view = view;
        this.model = model;

        view.addEliminarBtnListener(new EliminarbtnListener());
        view.addMenuBtnListener(new MenuBtnListener());
    }

    class EliminarbtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Eliminando...");

            boolean eliminado = model.eliminarContacto(view.getTxtfIdEliminar());

            if (eliminado){
                System.out.println("contacto eliminado con exito");
            }else{
                System.out.println("No se pudo eliminar el contacto");
            }
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
