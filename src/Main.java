public class Main
{
	public static void main(String[] args) {
	    // criando uma fila de pedidos
	    Fila pedidos = new Fila(5);
	    pedidos.enfileirar(101);
	    pedidos.enfileirar(102);
	    pedidos.enfileirar(103);
        System.out.println("Pedido Atendido: "+pedidos.desenfileirar());

	    pedidos.enfileirar(104);
	    pedidos.enfileirar(105);
	    pedidos.imprimir();
	}
}

