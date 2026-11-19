package ec.edu.puce.sport.model;

import java.time.LocalDate;

public class Jugador {

    private int codigo;
    private String nombre;
    private LocalDate fecha;
    private String equipo; // Atributo agregado para guardar el equipo

    public Jugador() {
    }

    public Jugador(int codigo, String nombre, LocalDate fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
