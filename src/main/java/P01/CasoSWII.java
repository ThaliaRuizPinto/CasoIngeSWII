package P01;

public class CasoSWII {
    public static void main(String[] args) {

        Comida pizza = ComidaFactory.crearComida("pizza");
        Comida ensalada = ComidaFactory.crearComida("ensalada");
        Comida hamburguesa = ComidaFactory.crearComida("hamburguesa");

        System.out.println("Comidas creadas:");
        System.out.println("- " + pizza.getNombre() + " S/." + pizza.getPrecio());
        System.out.println("- " + ensalada.getNombre() + " S/." + ensalada.getPrecio());
        System.out.println("- " + hamburguesa.getNombre() + " S/." + hamburguesa.getPrecio());

        Pedido pedido = new Pedido();
        pedido.agregarComida(pizza);
        pedido.agregarComida(ensalada);
        pedido.agregarComida(hamburguesa);

        System.out.println("\nTotal del pedido: S/." + pedido.getTotal());
        System.out.println("Estado inicial: " + pedido.getEstado().toString().toLowerCase());

        pedido.setEstado(EstadoPedido.EN_PREPARACION);
        System.out.println("Estado actualizado: " + pedido.getEstado().toString().toLowerCase());

        GestorPedidos gestor1 = GestorPedidos.getInstancia();
        gestor1.registrarPedido(pedido);

        System.out.println("\nPedidos registrados en el sistema:");
        for (Pedido p : gestor1.getPedidos()) {
            System.out.println("- " + p);
        }

        GestorPedidos gestor2 = GestorPedidos.getInstancia();
        System.out.println("\n¿Gestores son iguales? " + (gestor1 == gestor2));
    }
}
