package app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aresta {
    private String nome;
    private Vertice origem;
    private Vertice destino;
}
