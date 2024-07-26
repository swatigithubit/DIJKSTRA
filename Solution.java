
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> list, int S)
    {
        // Write your code here
        boolean  Explored[]=new boolean[V];
        int dist[]=new int [V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S]=0;
        
        for(int j=0;j<V-1;j++){
        int val=Integer.MAX_VALUE;
        int u=-1;
        for(int i=0;i<V;i++){
            if(!Explored[i] && dist[i]<val){
                val=dist[i];
                u=i;
            }
        }
        if(u==-1){
            break;
        }
        Explored[u]=true;
        for(int i=0;i<list.get(u).size();i++){
            ArrayList<Integer>li=list.get(u).get(i);
            int v=li.get(0);
            int wt=li.get(1);
            if(!Explored[v] && dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                dist[v]=dist[u]+wt;
            }
        }
        }
        return dist;
    }
}

