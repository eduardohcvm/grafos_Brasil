package app;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo();
        Vertice v1 = new Vertice ("1");
        g.adicionarVertice(v1);
        Vertice v2 = new Vertice ("2");
        g.adicionarVertice(v2);

        Aresta a1 = new Aresta("a1", v1, v2);
        g.adicionarAresta(a1);
        Aresta a2 = new Aresta ("a2", v2, v1);
        g.adicionarAresta(a2);


        System.out.println(g);

    }
}