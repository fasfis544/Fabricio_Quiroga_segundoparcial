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
public class GestorExcursiones {
    private Repository<Excursion> repository;
    
    public GestorExcursiones(Repository<Excursion> repository){
        this.repository = repository;
    }
    
    public boolean agregarExcursion(Excursion excursion){
        try{
            repository.add(excursion);
            System.out.println("escursion tipo" + excursion.getClass().getSimpleName() + "agregada con id" + excursion.id + ".");
            return true;
        } catch (Exception e) {
            System.out.println("error al agregar excursion");
            return false;
        }
    }
    public Optional <Excursion> buscarPorId(int id){
        return repository.findById(id);
    }
    public List<Excursion> filtrarExcursiones (Predicate<Excursion> criterio){
        return repository.findBy(criterio);
    }
    public List<Excursion> consultarExcursionesPorPrecio(double precioMin){
        return repository.findBy(excursion -> excursion.calcularPrecioFinal() >= precioMin);
    }
}
