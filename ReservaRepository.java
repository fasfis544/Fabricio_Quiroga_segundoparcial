/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author Operador
 */
public class ReservaRepository implements Repository<Reserva>{
    private List<Reserva> reservas;
    
    public void add(Excursion entity){
        reservas.add(entity);
    }
    
    public void remove(int id){
        reservas.removeIf(r -> r.idExcursion == id);
    }
    public Optional<Reserva> findById(int id){
        return reservas.stream().filter(r -> r.idExcursion == id).findFirst();
    }
    public List<Reserva> findBy(Predicate<Excursion> criterio){
        return reservas.stream().filter(criterio).toList();
    }
    public List<Reserva> getAll (){
        return reservas;
    }
}
