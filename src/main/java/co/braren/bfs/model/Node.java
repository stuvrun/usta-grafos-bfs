package co.braren.bfs.model;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String data;
    private boolean visited;
    List<Node> neighbors;

    public Node(String data) {
        this.data = data;
        this.neighbors = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbor(Node neighbor) {
        this.neighbors.add(neighbor);
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }
}
