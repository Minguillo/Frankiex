/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.frankie.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.enumeradores.Dificultad;
import mx.itson.frankie.entidades.Ingrediente;
import mx.itson.frankie.entidades.Receta;

/**
 *
 * @author beltr
 */
public class Main {
    public static void main(String[] args) {
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Prepara unos deliciosos brownies al estilo Frankie");
        receta.setNumeroPorciones(6);
        receta.setDuracion(62);
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("3 cucharadas de agua");
        Ingrediente ingrediente2 = new Ingrediente ();
        ingrediente2.setNombre("1 caja de harina para brownie de chocolate de 519 gr");
        
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        receta.setDificultad(Dificultad.LEGENDARIO);
    }
}
