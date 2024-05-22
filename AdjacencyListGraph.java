import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdjacencyListGraph {
    private Map<Integer, List<Integer>> adjacencyList;
    // constructor
    public AdjacencyListGraph(){
        this.adjacencyList = new HashMap<>();
    }
    // Add a vertex to the graph
    public void addVertex (int vertex){
        adjacencyList.put(vertex, new LinkedList<>());
    }
    public void removeVertex(int vertex){
        adjacencyList.remove(vertex);
        // remove edges pointing to removed vertex
        for (List<Integer> neighbors : adjacencyList.values()){
            neighbors.remove((Integer) vertex);
        }
    }
    public void addEdge(int source, int destination){
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }
    public void removeEdge(int source, int destination){
        adjacencyList.get(source).remove((Integer) destination);
        adjacencyList.get(destination).remove((Integer) source);
    }
}
