/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.logging.Logger;

/**
 *
 * @author Operador
 */
public class Reserva {
    private static int contadorId = 1;
    
    int idExcursion;
    private String cliente;
    private String fechaReserva;
    private double precio;
    private boolean pagoConfirmado;

    public Reserva(int idExcursion, String cliente) {
        this.idExcursion = idExcursion;
        this.cliente = cliente;
        this.fechaReserva = LocalDateTime.now().toString();
        this.precio = 0.0; //despues se asigna
        this.pagoConfirmado = false;
    }
    
    public boolean confirmarPago(){
        this.pagoConfirmado = true;
        return true;
    }
    
    public String detalleReserva(){
        return "cliente:" + cliente + " Excursion id:" + idExcursion + "fecha:" + fechaReserva + "precio:" + precio + "pago confirmado:" + pagoConfirmado;
    }
    
    public void setPrecio (double precio){
        this.precio = precio;
    }
}
