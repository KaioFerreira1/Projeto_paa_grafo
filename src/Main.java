public class Main {

    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(2, 0);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(3, 4);

        System.out.println("Matriz de Adjacência:");
        grafo.exibirGrafo();

        boolean possuiCiclo = grafo.verificarCiclo();
        System.out.println("\nGrafo contém ciclo? " + possuiCiclo);
    }
}
