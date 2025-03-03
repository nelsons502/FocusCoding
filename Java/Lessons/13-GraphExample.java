import java.util.*;

class Node {
    String name;
    List<Node> neighbors;

    public Node(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor) {
        this.neighbors.add(neighbor);
    }
}

class Graph {
    private Map<String, Node> nodes = new HashMap<>();

    public void addNode(String name) {
        nodes.putIfAbsent(name, new Node(name));
    }

    public void addEdge(String name1, String name2) {
        Node node1 = nodes.get(name1);
        Node node2 = nodes.get(name2);
        if (node1 != null && node2 != null) {
            node1.addNeighbor(node2);
            node2.addNeighbor(node1); // Undirected graph
        }
    }

    public void printGraph() {
        for (Node node : nodes.values()) {
            System.out.print(node.name + " -> ");
            for (Node neighbor : node.neighbors) {
                System.out.print(neighbor.name + " ");
            }
            System.out.println();
        }
    }
}

/*public class GraphExample {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        graph.printGraph();
    }
}*/

/*
 * Exercise 1:
 * - Modify the graph to be directed (edges go one way).
 *
 * Exercise 2:
 * - Implement a Breadth-First Search (BFS) method.
 *
 * Exercise 3:
 * - Implement a Depth-First Search (DFS) method.
 */