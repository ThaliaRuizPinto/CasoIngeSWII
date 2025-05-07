package P01;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contador = 1;
    private int id;
    private List<Comida> comidas;
    private EstadoPedido estado;

    public Pedido() {
        this.id = contador++;
        this.comidas = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
    }

    public void agregarComida(Comida comida) {
        comidas.add(comida);
    }

    public double getTotal() {
        return comidas.stream().mapToDouble(Comida::getPrecio).sum();
    }

    public int getCantidadComidas() {
        return comidas.size();
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + ": " + comidas.size() + " comidas, estado: " + estado.toString().toLowerCase();
    }
}
