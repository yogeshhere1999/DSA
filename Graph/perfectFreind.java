import java.io.*;
import java.util.*;

public class perfectFreind {
   
static int count = 0;
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      ArrayList<Integer>[] graph = new ArrayList[n];

      for(int i = 0; i < n; i++){
         graph[i] = new ArrayList<>();
      }

      for(int i = 0; i < k; i++){
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(v2);
         graph[v2].add(v1);
      }

   
     ArrayList<Integer> coms = new ArrayList<>();
     boolean[] visited = new boolean[n];
      for(int i = 0; i < n; i++){
         if(visited[i] == false){
            count = 0;
            connectedFriend(graph, i, visited);
            coms.add(count);
         }
      }

     int pair = 0;

     for(int i = 0; i < coms.size() - 1; i++){
       for(int j = i + 1; j < coms.size(); j++){
          pair += coms.get(i)* coms.get(j);
       }
     } 

     System.out.println(pair);
     
   }

   public static void connectedFriend(ArrayList<Integer>[] graph, int src, boolean[] visited){
 
      visited[src] = true;
      count++;
      for(int nbr : graph[src]){
         if(visited[nbr] == false){
            connectedFriend(graph, nbr, visited);
         }
      }
   }

}