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
public class ExcursionRepository implements Repository<Excursion> {
    private List<Excursion> excursiones;
    
    public void add(Excursion entity){
        excursiones.add(entity);
    }
    
    public void remove(int id){
        excursiones.removeIf(e -> e.id == id);
    }
    public Optional<Excursion> findById(int id){
        return excursiones.stream().filter(e -> e.id == id).findFirst();
    }
    public List<Excursion> findBy(Predicate<Excursion> criterio){
        return excursiones.stream().filter(criterio).toList();
    }
    public List<Excursion> getAll (){
        return excursiones;
    }
}
