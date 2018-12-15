import java.util.LinkedList;

public class Graph {
    private int vertexCount;
    private int edgeCount = 0;
    private LinkedList<Integer>[] adjLists;

    public Graph(int vertexCount) {
        if (vertexCount < 0) {
            throw new IllegalArgumentException("РљРѕР»-РІРѕ РІРµСЂС€РёРЅ РЅРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РѕС‚СЂРёС†Р°С‚РµР»СЊРЅС‹Рј");
        }
        this.vertexCount = vertexCount;
        adjLists = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public int vertexCount() {
        return vertexCount;
    }

    public int edgeCount(){
        return edgeCount;
    }

    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0) {
            throw new IllegalArgumentException("РќРѕРјРµ РІРµСЂС€РёРЅС‹ РЅРµ РѕР¶РµС‚ Р±С‹С‚СЊ РѕС‚СЂРёС†Р°С‚РµР»СЊРЅС‹Рј");
        }
        adjLists[v1].add(v2);
        adjLists[v2].add(v1);
    }

    public LinkedList<Integer> adjList(int vertex) {
        return adjLists[vertex];
    }
}