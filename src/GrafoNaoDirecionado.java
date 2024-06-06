import java.util.ArrayList;
import java.util.List;

public class GrafoNaoDirecionado {

    private int numeroVertices;
    private int[][] matrizAdjacencia;

    public GrafoNaoDirecionado(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        this.matrizAdjacencia = new int[numeroVertices][numeroVertices];
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem < 0 || verticeOrigem >= numeroVertices ||
                verticeDestino < 0 || verticeDestino >= numeroVertices) {
            throw new IllegalArgumentException("Vértices inválidos");
        }

        matrizAdjacencia[verticeOrigem][verticeDestino] = 1;
        matrizAdjacencia[verticeDestino][verticeOrigem] = 1;
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem < 0 || verticeOrigem >= numeroVertices ||
                verticeDestino < 0 || verticeDestino >= numeroVertices) {
            throw new IllegalArgumentException("Vértices inválidos");
        }

        matrizAdjacencia[verticeOrigem][verticeDestino] = 0;
        matrizAdjacencia[verticeDestino][verticeOrigem] = 0;
    }

    public void exibirGrafo() {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarCiclo() {
        boolean[] visitados = new boolean[numeroVertices];
        for (int i = 0; i < numeroVertices; i++) {
            if (!visitados[i]) {
                if (verificarCicloDFS(i, visitados)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean verificarCicloDFS(int verticeAtual, boolean[] visitados) {
        visitados[verticeAtual] = true;

        for (int proximoVertice : obterAdjacentes(verticeAtual)) {
            if (visitados[proximoVertice]) {
                return true;
            } else {
                if (verificarCicloDFS(proximoVertice, visitados)) {
                    return true;
                }
            }
        }

        return false;
    }

    private List<Integer> obterAdjacentes(int vertice) {
        List<Integer> adjacentes = new ArrayList<>();
        for (int j = 0; j < numeroVertices; j++) {
            if (matrizAdjacencia[vertice][j] == 1) {
                adjacentes.add(j);
            }
        }
        return adjacentes;
    }
}
