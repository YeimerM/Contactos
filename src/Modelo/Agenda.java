package Modelo;

import java.util.List;

public class Agenda {
    private ContactoDAO contactoDao;

    public Agenda(){
        this.contactoDao = new ContactoDAOImpl();
    }

    public List<Contacto> listarContactos(){
        return this.contactoDao.listarContactos();
    }

    public Contacto obtenerContactoPorId(int id){
        return this.contactoDao.obtenerContactoPorId(id);
    }
    public List<Contacto> obtenerContactosPorTipo(TipoContacto tipoContacto){
        return this.contactoDao.obtenerContactosPorTipo(tipoContacto);
    }

    public boolean agregarContacto(Contacto contacto){
        return this.contactoDao.agregarContacto(contacto);
    }

    public boolean actualizarContacto(Contacto contacto) {
        return this.contactoDao.actualizarContacto(contacto);
    }

    public boolean eliminarContacto(int id) {
        return this.contactoDao.eliminarContacto(id);
    }
}
