class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[]=new boolean[V];
        boolean visit[]=new boolean[V];
        for(int  i=0;i<V;i++){
            if(!visited[i]){
                if(cycle(adj,visited,i,visit)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean cycle(ArrayList<ArrayList<Integer>>adj,boolean visited[],int curr,boolean visit[]){
        visited[curr]=true;
        visit[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
          int v=adj.get(curr).get(i);
        if(visited[v]==true){
            return true;
        }
        if(visit[v]==true){
            continue;
        }
        else{
            if(cycle(adj,visited,v,visit)){
                return true;
            }
        }
    }
    visited[curr]=false;
    return false;
}
}