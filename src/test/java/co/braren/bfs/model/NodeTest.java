package co.braren.bfs.model;

import co.braren.bfs.commons.MockData;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for NodeTest model.
 */
public class NodeTest {

    @Test
    public void shouldInstanceNotNull() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        Assert.assertNotNull(nodeA);
    }

    @Test
    public void shouldInstanceData() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        Assert.assertEquals(MockData.TEST_DATA_A, nodeA.getData());
    }

    @Test
    public void shouldVisitedWithFalse() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        Assert.assertFalse(nodeA.isVisited());
    }

    @Test
    public void shouldVisitedChangeWithTrue() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        nodeA.setVisited(true);
        Assert.assertTrue(nodeA.isVisited());
    }

    @Test
    public void addNeighborToRoot() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        Node nodeB = new Node(MockData.TEST_DATA_B);

        nodeA.setNeighbor(nodeB);

        Assert.assertNotNull(nodeA.getNeighbors());
        Assert.assertEquals(nodeB, nodeA.getNeighbors().get(0));
    }

    @Test
    public void addNeighborsListToRoot() {
        Node nodeA = new Node(MockData.TEST_DATA_A);
        Node nodeB = new Node(MockData.TEST_DATA_B);
        Node nodeC = new Node(MockData.TEST_DATA_C);

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodeB);
        nodes.add(nodeC);

        nodeA.setNeighbors(nodes);

        Assert.assertNotNull(nodeA.getNeighbors());
        Assert.assertEquals(nodes, nodeA.getNeighbors());
    }
}
