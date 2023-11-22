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
        Contacto contacto = null;

        for(Contacto actual : listaContactos) {
            if(actual.getId() == id){
                contacto = actual;
                break;
            }
        }
        return contacto;
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
    public boolean actualizarContacto(int id) {
        // Implementar la actualización del contacto
        Contacto contacto = obtenerContactoPorId(id);
        if(listaContactos.contains(contacto)){
            int pos = listaContactos.indexOf(contacto);
            listaContactos.set(pos, contacto);
            return true;
        }
        return true;
    }

    @Override
    public boolean eliminarContacto(int id) {
        // Implementar la eliminación del contacto
        Contacto contacto = obtenerContactoPorId(id);
        boolean contieneContacto = listaContactos.contains(contacto);
        if(contieneContacto){
            listaContactos.remove(contacto);
            return true;
        } else return contieneContacto;
    }
}
