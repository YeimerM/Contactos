package Modelo;

import java.util.List;

public interface ContactoDAO {
    List<Contacto> listarContactos();
    Contacto obtenerContactoPorId(int id);
    List<Contacto> obtenerContactosPorTipo(TipoContacto tipoContacto);
    boolean agregarContacto(Contacto contacto);
    boolean actualizarContacto(int id);
    boolean eliminarContacto(int id);
}
