import java.util.Stack;

public class IterativeDeepening {




    public Vertex deepeningSearch(Vertex start, Vertex target) {
        for (int depth = 0; true; depth++) {
            Vertex found = DLS(start, depth, target);
            System.out.println();
            if (found != null) {
                return found;
            }
        }
    }

    private Vertex DLS(Vertex vertex, int depth, Vertex target) {
        System.out.print(vertex + " ");
        if(depth==0 && vertex.getData().equals(target.getData())) {
            return vertex;
        }
        if (depth > 0) {
            for (Vertex v: vertex.getAdjacencies()) {
                    Vertex found = DLS(v, depth-1, target);
                    if (found != null) {
                        return found;
                    }
                }
            }
        return null;
    }

}
