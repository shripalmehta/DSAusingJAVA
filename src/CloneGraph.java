// LC#133 Blind75

import java.util.*;
import java.lang.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


public class CloneGraph {
    Map<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        if (!visited.containsKey(node)) {
            Node cloneNode = new Node(node.val);
            visited.put(node, cloneNode);
            List<Node> nei = new ArrayList<>();
            cloneNode.neighbors = nei;

            for (Node neighbor: node.neighbors) {
                nei.add(cloneGraph(neighbor));
            }
        } else {
            return visited.get(node);
        }

        return visited.get(node);
    }

    public static void main(String[] args) {
        // adjList = [[2,4],[1,3],[2,4],[1,3]]

    }
}