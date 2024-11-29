/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
/**
 *
 * @author Operador
 */
public class GestorReservas {
    private Repository<Reserva> repository;
    private Excursion excursion;

    public GestorReservas(Excursion excursion) {
        this.excursion = excursion;
        this.repository = new ReservaRepository(); 
    }
    public boolean realizarReserva(Reserva reserva){
        if (getReservas().size()<excursion.cupoMaximo){
            reserva.setPrecio(excursion.calcularPrecioFinal());
            repository.add (reserva);
            return true;
        }
        return false;
    }
    public List<Reserva> getReservas(){
        return repository.getAll();
    }
    
}
