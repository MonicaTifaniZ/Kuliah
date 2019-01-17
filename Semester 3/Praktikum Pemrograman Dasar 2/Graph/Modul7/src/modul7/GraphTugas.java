
package modul7;

import java.util.*;

public class GraphTugas {

    static class GraphAdj{

        int simpul;
        LinkedList<Integer> adjListArray[];

        GraphAdj(int Simp) {
            this.simpul = Simp;

            adjListArray = new LinkedList[Simp];

            for (int i = 0; i < Simp; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
    }

    static void add_Edge(GraphAdj graph, int node_awal, int node_tujuan) {
        graph.adjListArray[node_awal].add(node_tujuan);

        graph.adjListArray[node_tujuan].add(node_awal);
    }

    static void print(GraphAdj node_graph) {
        for (int i = 0; i < node_graph.simpul; i++) {
            System.out.println("Angka tetangga dari " + i + " yaitu : ");
            System.out.println("--------------------------------------");
            System.out.print("Head "+ i + " == ");
            for (Integer node_list : node_graph.adjListArray[i]) {
                System.out.print(" -> " + node_list);
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        int simpulnya = 5;
        GraphAdj graph = new GraphAdj(simpulnya);
        add_Edge(graph, 0, 3);
        add_Edge(graph, 0, 4);
        add_Edge(graph, 1, 4);
        add_Edge(graph, 1, 2);
        add_Edge(graph, 1, 4);
        add_Edge(graph, 2, 3);
        add_Edge(graph, 3, 4);

        System.out.println("Adjacency List pada Graph");
        System.out.println("============================");
        print(graph);
    }
}
