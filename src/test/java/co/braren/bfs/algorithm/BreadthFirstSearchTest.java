package co.braren.bfs.algorithm;

import co.braren.bfs.commons.MockData;
import co.braren.bfs.model.Node;
import org.junit.Assert;
import org.junit.Test;

public class BreadthFirstSearchTest {

    @Test
    public void shouldInstanceNotNull() {
        BreadthFirstSearch bfsExample = new BreadthFirstSearch();
        Assert.assertNotNull(bfsExample);
    }

    @Test
    public void shouldNotThrow() {
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
        String graphNodes = bfsExample.init(nodeA);
        Assert.assertEquals(MockData.ALG_BFS_FULL_RESULT, graphNodes);
    }
}
