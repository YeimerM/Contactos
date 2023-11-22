package Modelo;

import java.util.List;

public interface ContactoDAO {
    List<Contacto> listarContactos();
    Contacto obtenerContactoPorId(int id);
    List<Contacto> obtenerContactosPorTipo(TipoContacto tipoContacto);
    boolean agregarContacto(Contacto contacto);
    boolean actualizarContacto(Contacto contacto);
    boolean eliminarContacto(int id);
    boolean existeContacto(int id);
}
