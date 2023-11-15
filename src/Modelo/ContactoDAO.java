package Modelo;

import java.util.List;

public interface ContactoDAO {
    List<Contacto> listarContactos();
    Contacto obtenerContactoPorId(int id);
    void agregarContacto(Contacto contacto);
    void actualizarContacto(Contacto contacto);
    void eliminarContacto(int id);
}
