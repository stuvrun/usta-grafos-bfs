package co.braren.graphs.algorithm;

import co.braren.graphs.commons.MockData;
import co.braren.graphs.model.Node;
import org.junit.Assert;
import org.junit.Test;

public class DepthFirstSearchTest {

    @Test
    public void shouldInstanceNotNull() {
        DepthFirstSearch dfsExample = new DepthFirstSearch();
        Assert.assertNotNull(dfsExample);
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
        Node nodeJ = new Node(MockData.TEST_DATA_J);
        Node nodeK = new Node(MockData.TEST_DATA_K);

        nodeA.setNeighbor(nodeB);
        nodeA.setNeighbor(nodeF);
        nodeB.setNeighbor(nodeC);
        nodeB.setNeighbor(nodeD);
        nodeD.setNeighbor(nodeE);
        nodeF.setNeighbor(nodeG);
        nodeG.setNeighbor(nodeH);
        nodeG.setNeighbor(nodeK);
        nodeH.setNeighbor(nodeI);
        nodeH.setNeighbor(nodeJ);

        DepthFirstSearch dfsExample = new DepthFirstSearch();
        String graphNodes = dfsExample.init(nodeA);
        Assert.assertEquals(MockData.ALG_DFS_FULL_RESULT, graphNodes);
    }
}
