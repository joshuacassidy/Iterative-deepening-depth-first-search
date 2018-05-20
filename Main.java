public class Main {

    public static void main(String[] args) {

        Vertex vertex0 = new Vertex("A");
        Vertex vertex1 = new Vertex("B");
        Vertex vertex2 = new Vertex("C");
        Vertex vertex3 = new Vertex("D");
        Vertex vertex4 = new Vertex("E");

        vertex0.addAdjacency(vertex1);
        vertex0.addAdjacency(vertex2);
        vertex1.addAdjacency(vertex3);
        vertex3.addAdjacency(vertex4);


        IterativeDeepening iterativeDeepening = new IterativeDeepening();
        System.out.println(iterativeDeepening.deepeningSearch(vertex0,vertex4).getData() + " has been found");
    }

}
