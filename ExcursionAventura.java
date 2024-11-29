/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Operador
 */
public class ExcursionAventura extends Excursion{
   private int nivelDificultad;
   private double seguroAdicional;

    public ExcursionAventura(int nivelDificultad, double seguroAdicional, int id, String titulo, double precioBase, int cupoMaximo) {
        super(id, titulo, precioBase, cupoMaximo);
        this.nivelDificultad = nivelDificultad;
        this.seguroAdicional = seguroAdicional;
    }
    public double calcularPrecioFinal(){
        return (precioBase * (1 + 0.1 * nivelDificultad)) + seguroAdicional;
    }
    public String consejosSeguridad(){
        switch(nivelDificultad){
            case 1: return "nivelfacil: usar equipo basico";
            case 2: return "nivelmoderado: resistencia fisica + 12 años - 65 años";
            case 3: return "nivelmedio: tener buena condicion fisica";
            case 4: return "niveldificil: resistencia fisica +18 años - 50 años";
            case 5: return "nivelexperto: requiere pasar pruebas de habilidades fisicas";
            default: return "niveldesconocido";
        }
    }
}
