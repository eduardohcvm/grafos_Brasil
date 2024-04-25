package app;

public class Main {
    public static void main(String[] args) {

        Grafo g = new Grafo();
        CriarGrafo cg = new CriarGrafo(g);
        g.verificaAdjacencias();
        g.printaMatrizAdjacencias();
        g.printaMatrizIncidencia();

        System.out.println(g);
    }


}