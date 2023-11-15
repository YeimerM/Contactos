package Modelo;

import java.util.List;

public class Contacto {
    private int id;
    private String fechaNacimiento;
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private List<Direccion> direcciones;
    private List<Telefono> telefonos;
    private TipoContacto tipoContacto;

    // Método Constructor
    public Contacto(int id, String fechaNacimiento, String numeroIdentificacion, String nombres, String apellidos, List<Direccion> direcciones, List<Telefono> telefonos, TipoContacto tipoContacto) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direcciones = direcciones;
        this.telefonos = telefonos;
        this.tipoContacto = tipoContacto;
    }

    // Métodos getter/setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }


    // Métodos para agregar Direccion y Telefono
    public void agregarDireccion(Direccion direccion) {
        direcciones.add(direccion);
    }

    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }
}

