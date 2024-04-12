package app;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo();


        Vertice v1 = new Vertice ("1");
        g.adicionarVertice(v1);
        Vertice v2 = new Vertice ("2");
        g.adicionarVertice(v2);
        Vertice v3 = new Vertice ("3");
        g.adicionarVertice(v3);
        Vertice v4 = new Vertice ("4");
        g.adicionarVertice(v4);


        g.adicionarAresta(new Aresta("a1", v1, v2));

        g.adicionarAresta(new Aresta("a2", v1, v4));
        g.adicionarAresta(new Aresta("a3", v2, v1));
        g.adicionarAresta(new Aresta("a4", v3, v4));

        g.verificaAdjacencias();
        g.printaMatrizAdjacencias();
        g.printaMatrizIncidencia();
        System.out.println(g);

    }
}