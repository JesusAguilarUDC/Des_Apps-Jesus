package com.kodular.jesus.domain.model;

public class Estudiante extends Usuario {

    private int id;
    private int usuarioId;
    private String nombre;
    private String apellido;
    private int fechaNacimiento;
    private int semestre;
    private String genero;
    private String telefono;
    private String programa;
    private String universidad;

    public Estudiante() {
        super();
    }

    public Estudiante(
        int id,
        int usuarioId,
        String nombre,
        String apellido,
        int fechaNacimiento,
        int semestre,
        String genero,
        String telefono,
        String programa,
        String universidad) {
            
        super(id, username, password, email);

        this.id = id;
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.semestre = semestre;
        this.genero = genero;
        this.telefono = telefono;
        this.programa = programa;
        this.universidad = universidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

}