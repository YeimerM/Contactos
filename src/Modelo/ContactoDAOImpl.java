package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ContactoDAOImpl implements ContactoDAO {
    private List<Contacto> listaContactos;


    public ContactoDAOImpl() {
        listaContactos = new ArrayList<>();
    }

    @Override
    public List<Contacto> listarContactos() {
        return listaContactos;
    }

    @Override
    public Contacto obtenerContactoPorId(int id) {
        // Implementar la búsqueda por ID
        return null; // retornar el contacto
    }

    @Override
    public void agregarContacto(Contacto contacto) {
        listaContactos.add(contacto);
    }

    @Override
    public void actualizarContacto(Contacto contacto) {
        // Implementar la actualización del contacto
    }

    @Override
    public void eliminarContacto(int id) {
        // Implementar la eliminación del contacto
    }
}
