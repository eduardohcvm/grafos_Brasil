package app;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

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
    public int getDistanciaMinimaEstados(Vertice inicio, Vertice fim) {
        if (!vertices.contains(inicio) || !vertices.contains(fim)) {
            System.out.println("Um dos vértices não existe no grafo!");
            return -1;
        }

        PriorityQueue<Aresta> pq = new PriorityQueue<>((a1, a2) -> a1.getDistancia() - a2.getDistancia());
        Set<Vertice> visitados = new HashSet<>();
        Map<Vertice, Aresta> predecessor = new HashMap<>();
        Map<Vertice, Integer> distancia = new HashMap<>();

        // Inicializar distância de todos os vértices como infinito
        for (Vertice vertice : vertices) {
            distancia.put(vertice, Integer.MAX_VALUE);
        }

        // Inicializar distância do vértice de início como 0
        distancia.put(inicio, 0);

        // Adicionar todas as arestas ao heap
        for (Aresta aresta : arestas) {
            pq.add(aresta);
        }

        // Enquanto houverem arestas no heap
        while (!pq.isEmpty()) {
            Aresta aresta = pq.poll();
            Vertice vertice1 = aresta.getOrigem();
            Vertice vertice2 = aresta.getDestino();

            // Verificar se os vértices já foram visitados
            if (visitados.contains(vertice1) || visitados.contains(vertice2)) {
                continue;
            }

            // Atualizar a distância dos vértices
            // Atualizar a distância dos vértices
            int novaDistancia1 = distancia.get(vertice1) + aresta.getDistancia();
            int novaDistancia2 = distancia.get(vertice2) + aresta.getDistancia();

            distancia.put(vertice1, Math.min(distancia.get(vertice1), novaDistancia1));
            distancia.put(vertice2, Math.min(distancia.get(vertice2), novaDistancia2));

            predecessor.put(vertice1, aresta);
            predecessor.put(vertice2, aresta);

            // Marcar os vértices como visitados
            visitados.add(vertice1);
            visitados.add(vertice2);

            // Verificar se a distância do vértice de fim foi atualizada
            if (visitados.contains(fim)) {
                break;
            }
        }

        // Calcular a distância final
        int distanciaFinal = distancia.get(fim);

        return distanciaFinal;
    }

    public String toString() {

        return "Grafo " +
                (eDirecionado ? "direcionado" : "não direcionado") +
                ", pois não importa o sentido da distância entre dois estados, de ordem " +
                ordem +
                " e tamanho " +
                tamanho +
                ".\n" +
                "Vértice de Maior Grau:\n" +
                encontrarVerticeMaiorGrau() +
                "\nVértices:\n" +
                vertices +
                "\nArestas:\n" +
                arestas;
    }

    public Vertice encontrarVerticeMaiorGrau() {
        int maiorGrau = 0;
        Vertice verticeMaiorGrau = null;

        for (Vertice vertice : vertices) {
            int grauVertice = 0;
            for (Vertice adjacente : vertice.getAdjacencias()) {
                grauVertice++;
            }
            vertice.setGrau(grauVertice);

            if (grauVertice > maiorGrau) {
                maiorGrau = grauVertice;
                verticeMaiorGrau = vertice;
            }
        }

        return verticeMaiorGrau;
    }

}
