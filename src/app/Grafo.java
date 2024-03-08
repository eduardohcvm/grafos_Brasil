package app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Grafo {
    private List<Vertice> vertices;
    private List<Aresta> arestas;
    private boolean eDirecionado;

    public Grafo(){
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
    }

    public void adicionarVertice(Vertice vertice) {
        if (vertice == null) System.out.println("Vértice nulo não pode ser adicionado!");
        else if (vertices.contains(vertice)) System.out.println("Vértice " + vertice.getNome() + " já existe!");
        else if (vertice.getNome().isEmpty()) System.out.println("Vértice sem nome não pode ser adicionado!");
        else {
            vertices.add(vertice);
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
            arestas.add(aresta);
            System.out.println("Aresta " + aresta.getNome() + " adicionada com sucesso!");
        }
    }
}
