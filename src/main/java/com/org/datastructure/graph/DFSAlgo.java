package com.org.datastructure.graph;

import java.util.LinkedList;
import java.util.Stack;

public class DFSAlgo {

    public boolean dfs(LinkedList<Integer> adj[],int source,int destination){

        boolean [] visited = new boolean[adj.length];
        visited[source] =true;
        return dfsUtils(adj,source,destination,visited);
    }

    private boolean dfsUtils(LinkedList<Integer>[] adj, int source, int destination, boolean[] visited) {
        if(source == destination) return true;
        for(int neighbor : adj[source]){
            if(!visited[source]){
                visited[source] = true;
                boolean isConnected = dfsUtils(adj,neighbor,destination,visited);
                if(isConnected)
                    return true;
            }
        }
        return false;
    }

    boolean dfsStack(LinkedList<Integer> adj[], int source, int destination){

        boolean [] visited = new boolean[adj.length];
        visited[source] =true;
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while(!stack.isEmpty()){
            int curr = stack.pop();
            if(curr == destination) return true;

            for (int neighbor : adj[curr]){
                if(!visited[neighbor]){
                    visited[neighbor] =true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }
}
