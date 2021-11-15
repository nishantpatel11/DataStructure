package com.org.datastructure.graph;

import java.util.LinkedList;

public class Graph {

    private LinkedList<Integer> adj[];

    public Graph(int v){
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i] = new LinkedList();
    }
    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

}
