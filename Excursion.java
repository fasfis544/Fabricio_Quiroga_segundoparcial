/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Operador
 */
public abstract class Excursion {
    private static int contadorId = 1;
    
    protected int id;
    protected String titulo;
    protected double precioBase;
    protected int cupoMaximo;
    protected transient GestorReservas gestorReservas;
    protected List<String> actividades;

    public Excursion(int id, String titulo, double precioBase, int cupoMaximo) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.cupoMaximo = cupoMaximo;
        this.gestorReservas = new GestorReservas(this);
        this.actividades = new ArrayList<>();
    }
    public boolean realizarReserva(String cliente){
        return gestorReservas.realizarReserva(new Reserva(id, cliente));
    }
    public abstract double calcularPrecioFinal();
    public void agregarActividad(String actividad){
        actividades.add(actividad);
    }
    public String mostrarResumen(){
        return "Excursion:" + titulo + "Actividades:" + actividades + "cupos disponibles:" + (cupoMaximo - gestorReservas.getReservas().size());
        
    }
    private String generarFilePath(){
        return "reservas excursion:" + id + ".dat";
    }   
    public Optional<List<Reserva>> traerReservas(){
        return gestorReservas.getReservas().isEmpty()? Optional.empty(): Optional.of (gestorReservas.getReservas());
    }
}
