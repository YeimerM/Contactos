package Modelo;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ContactoDAOImpl implements ContactoDAO {
    private List<Contacto> listaContactos;
    private Map<TipoContacto, List<Contacto>> mapaContactos; // Contactos en HashMap

    public ContactoDAOImpl() {
        listaContactos = new ArrayList<>();
        mapaContactos = new EnumMap<>(TipoContacto.class);
    }

    @Override
    public List<Contacto> listarContactos() {
        return listaContactos;
    }

    @Override
    public Contacto obtenerContactoPorId(int id) {
        // Implementar la búsqueda por ID

        for(Contacto actual : listaContactos) {
            if(actual.getId() == id){
                return actual;
            }
        }
        return null;
    }
    @Override
    public List<Contacto> obtenerContactosPorTipo(TipoContacto tipoContacto){
        return mapaContactos.getOrDefault(tipoContacto, new ArrayList<>());
    }

    @Override
    public boolean agregarContacto(Contacto contacto) {
        listaContactos.add(contacto);
        // Agregar un contacto al mapa
        mapaContactos.computeIfAbsent(contacto.getTipoContacto(), k -> new ArrayList<>()).add(contacto);
        return true;
    }

    @Override
    public boolean actualizarContacto(Contacto contactoActualizado) {
        if (existeContacto(contactoActualizado.getId())) {
            Contacto contactoExistente = obtenerContactoPorId(contactoActualizado.getId());
            int pos = listaContactos.indexOf(contactoExistente);
            listaContactos.set(pos, contactoActualizado);
            return true;
        }
        return false;
    }
    @Override
    public boolean existeContacto(int id) {
        Contacto contactoExistente = obtenerContactoPorId(id);
        return listaContactos.contains(contactoExistente);
    }

    @Override
    public boolean eliminarContacto(int id) {
        // Implementar la eliminación del contacto
        boolean contieneContacto = existeContacto(id);
        if(contieneContacto){
            listaContactos.remove(obtenerContactoPorId(id));
            return true;
        }
        return false;
    }
}
