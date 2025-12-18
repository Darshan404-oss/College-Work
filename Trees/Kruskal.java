//Write a Java program to find the Minimum Spanning Tree using Kruskal’s Algorithm.

import java.util.Scanner;

class Edge {
    int u, v, w;
}

public class Kruskal {

    // find parent
    static int find(int parent[], int i) {
        while (parent[i] != i) {
            i = parent[i];
        }
        return i;
    }

    // union of two sets
    static void union(int parent[], int x, int y) {
        int a = find(parent, x);
        int b = find(parent, y);
        parent[a] = b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, e;

        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        e = sc.nextInt();

        Edge[] edges = new Edge[e];

        for (int i = 0; i < e; i++) {
            edges[i] = new Edge();
            System.out.print("Enter edge (u v weight): ");
            edges[i].u = sc.nextInt();
            edges[i].v = sc.nextInt();
            edges[i].w = sc.nextInt();
        }

        // sort edges by weight (simple sorting)
        for (int i = 0; i < e - 1; i++) {
            for (int j = i + 1; j < e; j++) {
                if (edges[i].w > edges[j].w) {
                    Edge temp = edges[i];
                    edges[i] = edges[j];
                    edges[j] = temp;
                }
            }
        }

        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int count = 0;
        int minCost = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (int i = 0; i < e && count < n - 1; i++) {

            int u = edges[i].u;
            int v = edges[i].v;

            if (find(parent, u) != find(parent, v)) {
                union(parent, u, v);
                System.out.println(u + " - " + v + " : " + edges[i].w);
                minCost += edges[i].w;
                count++;
            }
        }

        System.out.println("Minimum Cost = " + minCost);

        sc.close();
    }
}
//Output:
Enter number of vertices: 4
Enter number of edges: 5
Enter edge (u v weight): 0 1 10
Enter edge (u v weight): 0 2 6
Enter edge (u v weight): 0 3 5
Enter edge (u v weight): 1 3 15
Enter edge (u v weight): 2 3 4

Edges in Minimum Spanning Tree:
2 - 3 : 4
0 - 3 : 5
0 - 1 : 10
Minimum Cost = 19

