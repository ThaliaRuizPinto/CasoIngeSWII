/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P01;

public class ComidaFactory {
    public static Comida crearComida(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "pizza" -> new Pizza();
            case "ensalada" -> new Ensalada();
            case "hamburguesa" -> new Hamburguesa();
            default -> throw new IllegalArgumentException("Tipo de comida desconocido");
        };
    }
}