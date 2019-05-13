package co.braren.graphs.algorithm;

import co.braren.graphs.model.Node;

import java.util.List;

public class DepthFirstSearch {
    private String graphNodes = "";

    public String init(Node node) {

        graphNodes += node.getData() + " - ";

        // Se obtienen los elementos vecinos relacionados con el nodo raiz actual.
        List<Node> neighbors = node.getNeighbors();

        // Se marca el nodo raíz como visitado.
        node.setVisited(true);

        // Recorremos todos los vértices del grafo.
        for (int i = 0; i < neighbors.size(); i++) {
            Node n = neighbors.get(i);
            if (n != null && !n.isVisited()) {
                init(n);
            }
        }

        return graphNodes;
    }
}
