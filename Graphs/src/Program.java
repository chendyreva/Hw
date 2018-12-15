public class Program {
    public static void main(String[] args) {
        Graph g = new Graph(10);

        g.addEdge(0,6);
        g.addEdge(0,7);
        g.addEdge(0,8);
        g.addEdge(6,9);
        g.addEdge(8,1);
        g.addEdge(1,2);
        g.addEdge(2,3);

        g.addEdge(5,4);

        DepthFirstPaths dfs = new DepthFirstPaths(g, 0);
        System.out.println(dfs.hasPathTo(5));
        System.out.println(dfs.hasPathTo(3));
        System.out.println(dfs.pathTo(5));
        BreadthFirstPaths bfs = new BreadthFirstPaths(g, 0);
        System.out.println(bfs.hasPathTo(7));
        System.out.println(bfs.hasPathTo(9));
        System.out.println(bfs.pathTo(7));
        System.out.println(bfs.distTo(7));
    }
}