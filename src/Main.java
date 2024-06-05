public class Main {

    public static void main(String[] args) {
        // Criando um grafo com 5 vértices
        Grafo grafo = new Grafo(5);

        // Adicionando algumas arestas
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(2, 0);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(3, 4);

        // Exibindo o grafo
        System.out.println("Matriz de Adjacência:");
        grafo.exibirGrafo();

        // Verificando se o grafo possui ciclo
        boolean possuiCiclo = grafo.verificarCiclo();
        System.out.println("\nGrafo contém ciclo? " + possuiCiclo);
    }
}
