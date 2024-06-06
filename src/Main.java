public class Main {

    public static void main(String[] args) {
        GrafoNaoDirecionado grafo = new GrafoNaoDirecionado(5);

        System.out.println("Grafo não direcionado");
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(3, 4);
        grafo.exibirGrafo();
        boolean contemCiclo = grafo.verificarCiclo();
        System.out.println("Grafo contém ciclo? " + contemCiclo);
        System.out.println("");
        System.out.println("");

        System.out.println("Grafo direcionado");
        GrafoDirecionado grafo2 = new GrafoDirecionado(5);

        grafo2.adicionarAresta(0, 1);
        grafo2.adicionarAresta(0, 2);
        grafo2.adicionarAresta(1, 3);
        grafo2.adicionarAresta(2, 4);
        grafo2.adicionarAresta(3, 4);
        grafo2.exibirGrafo();
    }
}
