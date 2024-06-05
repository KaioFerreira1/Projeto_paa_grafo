import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoDirecionado {

    private int numeroVertices;
    private Map<Integer, List<Integer>> listasAdjacencia;

    public GrafoDirecionado(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        this.listasAdjacencia = new HashMap<>();

        // Inicializando as listas de adjacência
        for (int i = 0; i < numeroVertices; i++) {
            listasAdjacencia.put(i, new ArrayList<>());
        }
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem < 0 || verticeOrigem >= numeroVertices ||
                verticeDestino < 0 || verticeDestino >= numeroVertices) {
            throw new IllegalArgumentException("Vértices inválidos");
        }

        listasAdjacencia.get(verticeOrigem).add(verticeDestino);
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem < 0 || verticeOrigem >= numeroVertices ||
                verticeDestino < 0 || verticeDestino >= numeroVertices) {
            throw new IllegalArgumentException("Vértices inválidos");
        }

        listasAdjacencia.get(verticeOrigem).remove(Integer.valueOf(verticeDestino));
    }

    public void exibirGrafo() {
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print("Vértice " + i + ": ");
            for (int verticeAdjacente : listasAdjacencia.get(i)) {
                System.out.print(verticeAdjacente + " ");
            }
            System.out.println();
        }
    }

    // Método para verificar ciclo usando busca em profundidade (a ser implementado)
    public boolean verificarCiclo() {
        // Implementar algoritmo de busca em profundidade para detecção de ciclo
        return false; // Substituir por implementação real
    }

    // Método auxiliar para obter os vértices adjacentes a um vértice específico (implementado)
    private List<Integer> obterAdjacentes(int vertice) {
        return listasAdjacencia.get(vertice);
    }
}
