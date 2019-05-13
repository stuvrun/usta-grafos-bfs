package co.braren.graphs;

import co.braren.graphs.algorithm.BreadthFirstSearch;
import co.braren.graphs.commons.MockData;
import co.braren.graphs.model.Node;

/**
 * Hello world!
 */
public class App {
    static String text = "Por favor indique el grafo a probar... -bfs -dfs";

    public static void main(String[] args) {

        if (args == null || args.length == 0) {
            args = new String[1];
            args[0] = "";
        }

        switch (args[0]) {
            case "-bfs":
                text = "El resultado del análisis de los nodos con BFS fue:\n\t" + App.initBFS() + "\n";
                break;
            case "-dfs":
                text = "En proceso...";
                break;
        }

        System.out.println(text);
    }

    public static String initBFS() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        Node nodeB = new Node(MockData.TEST_DATA_B);
        Node nodeC = new Node(MockData.TEST_DATA_C);
        Node nodeD = new Node(MockData.TEST_DATA_D);
        Node nodeE = new Node(MockData.TEST_DATA_E);
        Node nodeF = new Node(MockData.TEST_DATA_F);
        Node nodeG = new Node(MockData.TEST_DATA_G);
        Node nodeH = new Node(MockData.TEST_DATA_H);
        Node nodeI = new Node(MockData.TEST_DATA_I);

        nodeA.setNeighbor(nodeB);
        nodeA.setNeighbor(nodeF);
        nodeB.setNeighbor(nodeC);
        nodeB.setNeighbor(nodeD);
        nodeD.setNeighbor(nodeE);
        nodeF.setNeighbor(nodeG);
        nodeG.setNeighbor(nodeH);
        nodeG.setNeighbor(nodeI);

        BreadthFirstSearch bfsExample = new BreadthFirstSearch();
        return bfsExample.init(nodeA);
    }
}
