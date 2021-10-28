package com.org.datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSAlgo {

    int bfs(LinkedList<Integer> adj[],int source,int destination){

        boolean [] visited = new boolean[adj.length];
        int [] parent = new int[adj.length];
        Queue<Integer> q = new LinkedList();

        q.add(source);
        parent[source] = -1;
        visited[source] =true;
        while(q.isEmpty()){
            int curr = q.poll();
             if(curr == destination) break;
             for (int neigbour : adj[curr]){
                 if(!visited[neigbour]) {
                     visited[neigbour] = true;
                     q.add(neigbour);
                     parent[neigbour] =curr;
                 }
             }
        }

        int curr =destination;
        int distance =0;
        while (parent[curr] != -1) {
            System.out.println(curr + "->" );
            curr = parent[curr];
            distance++;
        }
        return  distance;
    }
}
