package app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Grafo {
    private List<Vertice> vertices;
    private List<Aresta> arestas;
    private boolean eDirecionado; //já é inicializado com false
    private int ordem = 0;
    private int tamanho = 0;
    private int[][] matrizAdjacencia;
    private int[][] matrizIncidencia;

    public Grafo(){
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
    }

    public Grafo(boolean eDirecionado) {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        this.eDirecionado = eDirecionado;
    }

    public void adicionarVertice(Vertice vertice) {
        if (vertice == null) System.out.println("Vértice nulo não pode ser adicionado!");
        else if (vertices.contains(vertice)) System.out.println("Vértice " + vertice.getNome() + " já existe!");
        else if (vertice.getNome().isEmpty()) System.out.println("Vértice sem nome não pode ser adicionado!");
        else {
            vertices.add(vertice);
            ordem++;
            System.out.println("Vértice " + vertice.getNome() + " adicionado com sucesso!");
        }
    }

    public void adicionarAresta(Aresta aresta) {
        if (aresta == null) System.out.println("Aresta " + aresta.getNome() + " é nula não pode ser adicionada!");
        else if (arestas.contains(aresta)) System.out.println("Aresta " + aresta.getNome() + " já existe!");
        else if (aresta.getNome().isEmpty()) System.out.println("Aresta sem nome não pode ser adicionada!");
        else if (!vertices.contains(aresta.getOrigem()) || !vertices.contains(aresta.getDestino()))
            System.out.println("Vértice de origem ou destino da aresta" +  aresta.getNome() + " não existe!");
        else {
            if (!this.eDirecionado)
                descobreSeEDigrafo(aresta);
            arestas.add(aresta);
            tamanho++;
            aresta.getOrigem().setGrau(aresta.getOrigem().getGrau() + 1);
            aresta.getDestino().setGrau(aresta.getDestino().getGrau() + 1);
            System.out.println("Aresta " + aresta.getNome() + " adicionada com sucesso!");
        }
    }

    private void descobreSeEDigrafo(Aresta aresta) {
        if (aresta.getOrigem() == aresta.getDestino())  //self-loop
            this.eDirecionado = true;
        else {
            for (Aresta arestaSalva : arestas) { //for-each -- para cada Aresta da lista faça o que está abaixo:
                if (aresta.getOrigem() == arestaSalva.getDestino()
                        && aresta.getDestino() == arestaSalva.getOrigem()) {
                    this.eDirecionado = true;
                    break;
                }
            }
        }
    }

    public void verificaAdjacencias() {
        matrizAdjacencia = new int[ordem][ordem]; //[0][1] = 1
        matrizIncidencia = new int[ordem][tamanho];
        Map<String, Integer> verticesIndices = new HashMap<>();
        for (int i = 0; i < ordem; i++) {
            verticesIndices.put(vertices.get(i).getNome(), i);
            //(A,0), (B, 1), (C, 2), (D, 3)
        }
        int aux = 0;
        if (this.eDirecionado) {
            for (Aresta aresta : arestas) {
                Vertice origem = aresta.getOrigem(); //A
                Vertice destino = aresta.getDestino(); //C
                if (!destino.getAdjacencias().contains(origem)) {
                    destino.getAdjacencias().add(origem);
                    matrizAdjacencia[verticesIndices.get(origem.getNome())][verticesIndices.get(destino.getNome())] = 1;
                    //matrizAdjacencia[0][2] = 1
                }
                matrizIncidencia[verticesIndices.get(origem.getNome())][aux] = -1;
                //matrizIncidencia[0][0] = -1
                matrizIncidencia[verticesIndices.get(destino.getNome())][aux] = 1;
                //matrizIncidencia[2][0] = 1
                aux++;
            }
        } else {
            for (Aresta aresta : arestas) {
                Vertice origem = aresta.getOrigem(); //A
                Vertice destino = aresta.getDestino(); //C
                origem.getAdjacencias().add(destino); //add C à lista de A
                matrizAdjacencia[verticesIndices.get(origem.getNome())][verticesIndices.get(destino.getNome())] = 1;
                //matrizAdjacencia[0][2] = 1
                destino.getAdjacencias().add(origem); //add A à lista de C
                matrizAdjacencia[verticesIndices.get(destino.getNome())][verticesIndices.get(origem.getNome())] = 1;
                //matrizAdjacencia[2][0] = 1

                matrizIncidencia[verticesIndices.get(origem.getNome())][aux] = 1;
                //matrizIncidencia[0][0] = 1
                matrizIncidencia[verticesIndices.get(destino.getNome())][aux] = 1;
                //matrizIncidencia[2][0] = 1
                aux++;
            }
        }
    }

    public void printaMatrizAdjacencias() {
        StringBuilder matriz = new StringBuilder("\nMatriz de adjacências\n");
        matriz.append("  ");
        for (int i = 0; i < ordem; i++) {
            matriz.append(vertices.get(i).getNome()).append(" ");
        }
        matriz.append("\n");
        for (int i = 0; i < ordem; i++) {
            matriz.append(vertices.get(i).getNome()).append(" ");
            for (int j = 0; j < ordem; j++) {
                matriz.append(matrizAdjacencia[i][j]).append(" ");
            }
            matriz.append("\n");
        }
        System.out.printf(matriz.toString());
    }

    public void printaMatrizIncidencia(){
        String espacamento = eDirecionado ? "   " : " ";
            StringBuilder matriz = new StringBuilder("\nMatriz de incidência\n");
        matriz.append("  ");
        for (int i = 0; i < tamanho; i++) {
            matriz.append(arestas.get(i).getNome()).append(espacamento);
        }
        matriz.append("\n");

        for (int i = 0; i < ordem; i++) {
            matriz.append(vertices.get(i).getNome()).append(espacamento);
            for (int j = 0; j < tamanho; j++) {
                matriz.append(matrizIncidencia[i][j]).append(espacamento);
            }
            matriz.append("\n");
        }
        System.out.printf(matriz.toString());
    }

    public String toString() {

        return "Grafo " +
                (eDirecionado ? "direcionado" : "não direcionado") +
                " com " +
                ordem +
                " vértices e " +
                tamanho +
                " arestas:\n" +
                "Vértices:\n" +
                vertices +
                "\nArestas:\n" +
                arestas;
    }

}
