package Controlador;

import Modelo.*;
import Vista.VerContactosPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VerContactosController {
    private VerContactosPanel view;
    private Agenda model;

    public VerContactosController(VerContactosPanel view, Agenda model){
        this.view = view;
        this.model = model;

        view.addEstudianteBtnListener(new EstudianteBtnListener());
        view.addProfesorBtnListener(new ProfesorBtnListener());
        view.addEmpleadoBtnListener(new EmpleadoBtnListener());
        view.addRegresarBtnListener(new RegresarBtnListener());

        // Contactos ficticios para probar
        // Direcciones
        Direccion direccion1 = new Direccion("Calle 123, Ciudad A");
        Direccion direccion2 = new Direccion("Avenida XYZ, Ciudad B");

        // Teléfonos
        Telefono telefono1 = new Telefono("123-456-7890", TipoTelefono.MOVIL);
        Telefono telefono2 = new Telefono("987-654-3210", TipoTelefono.CASA);

        // Lista de direcciones y teléfonos
        List<Direccion> direcciones1 = new ArrayList<>();
        direcciones1.add(direccion1);
        direcciones1.add(direccion2);
        List<Direccion> direcciones2 = new ArrayList<>();
        direcciones2.add(direccion2);

        List<Telefono> telefonos1 = new ArrayList<>();
        telefonos1.add(telefono1);
        List<Telefono> telefonos2 = new ArrayList<>();
        telefonos2.add(telefono2);

        // Objetos Contacto inicializados
        Contacto contacto1 = new Contacto(1, "01/01/1990", "Juan", "Perez", direcciones1, telefonos1, TipoContacto.EMPLEADO);
        Contacto contacto2 = new Contacto(2, "05/05/1985", "Maria", "Gomez", direcciones2, telefonos2, TipoContacto.ESTUDIANTE);
        Contacto contacto3 = new Contacto(3, "10/10/1980", "Carlos", "Rodriguez", direcciones1, telefonos1, TipoContacto.PROFESOR);
        Contacto contacto4 = new Contacto(4, "15/03/1995", "Ana", "Lopez", direcciones2, telefonos2, TipoContacto.EMPLEADO);
        Contacto contacto5 = new Contacto(5, "20/11/1982", "Luis", "Martinez", direcciones1, telefonos1, TipoContacto.ESTUDIANTE);
        Contacto contacto6 = new Contacto(6, "25/07/1978", "Laura", "Garcia", direcciones2, telefonos2, TipoContacto.PROFESOR);

        model.agregarContacto(contacto1);
        model.agregarContacto(contacto2);
        model.agregarContacto(contacto3);
        model.agregarContacto(contacto4);
        model.agregarContacto(contacto5);
        model.agregarContacto(contacto6);
    }

    class EstudianteBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.verInfoContactos();
            for (Contacto contacto : model.obtenerContactosPorTipo(TipoContacto.ESTUDIANTE)) {
                view.getModeloLista().addElement(obtenerTextoContacto(contacto));
            }
        }
    }
    class ProfesorBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.verInfoContactos();
            for (Contacto contacto : model.obtenerContactosPorTipo(TipoContacto.PROFESOR)) {
                view.getModeloLista().addElement(obtenerTextoContacto(contacto));
            }
        }
    }
    class EmpleadoBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.verInfoContactos();
            for (Contacto contacto : model.obtenerContactosPorTipo(TipoContacto.EMPLEADO)) {
                view.getModeloLista().addElement(obtenerTextoContacto(contacto));
            }
        }
    }
    class RegresarBtnListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.getPanelInfo().setVisible(false);
            view.getPanelBotones().setVisible(false);
            view.getPanelTipos().setVisible(true);
        }
    }

    private String obtenerTextoContacto(Contacto contacto) {
        StringBuilder texto = new StringBuilder();
        texto.append("ID: ").append(contacto.getId()).append("\n");
        texto.append("  Nombres: ").append(contacto.getNombres()).append("\n");
        texto.append("  Apellidos: ").append(contacto.getApellidos()).append("\n");
        texto.append("  Fecha de Nacimiento: ").append(contacto.getFechaNacimiento()).append("\n");

        // Añadir direcciones
        texto.append("  Direcciones:\n");
        for (Direccion direccion : contacto.getDirecciones()) {
            texto.append(" - ").append(direccion.getDireccion()).append("\n");
        }

        // Añadir teléfonos
        texto.append("  Teléfonos:\n");
        for (Telefono telefono : contacto.getTelefonos()) {
            texto.append(" - ").append(telefono.getNumero()).append("\n");
        }

        //texto.append("  Tipo de Contacto: ").append(contacto.getTipoContacto()).append("\n");

        return texto.toString();
    }
}
