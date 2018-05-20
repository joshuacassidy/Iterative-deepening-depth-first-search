import java.util.ArrayList;
import java.util.List;

public class Vertex {

    public String data;
    private int depthLevel = 0;
    private List<Vertex> adjacencies;


    public Vertex(String data) {
        this.data = data;
        adjacencies = new ArrayList<>();
    }

    public void addAdjacency(Vertex vertex) {
        adjacencies.add(vertex);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public List<Vertex> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(List<Vertex> adjacencies) {
        this.adjacencies = adjacencies;
    }

    @Override
    public String toString() {
        return data;
    }
}
