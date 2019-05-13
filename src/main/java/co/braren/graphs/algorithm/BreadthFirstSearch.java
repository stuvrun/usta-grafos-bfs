package co.braren.graphs.algorithm;

import co.braren.graphs.model.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    private Queue<Node> queue;
    private String graphNodes;

    public String init(Node node) {
        // Nos aseguramos que la cola 'queue' está vacía
        queue = new LinkedList<>();
        graphNodes = "";

        // Añadimos el nodo raíz a la cola, por donde iniciará la exploración.
        queue.add(node);
        // Se marca el nodo raíz como visitado.
        node.setVisited(true);

        while (!queue.isEmpty()) {
            // Extraemos el nodo 'element' de la cola 'queue' y exploramos todos sus nodos adyacentes.
            Node element = queue.remove();

            graphNodes += element.getData() + " - ";

            // Se obtienen los elementos vecinos relacionados con el nodo raiz actual.
            List<Node> neighbors = element.getNeighbors();

            // Recorremos todos los vértices del grafo.
            for (int i = 0; i < neighbors.size(); i++) {
                Node n = neighbors.get(i);
                if (n != null && !n.isVisited()) {
                    queue.add(n);
                    // Se marca el nodo como visitado.
                    n.setVisited(true);
                }
            }
        }

        return graphNodes;
    }
}
