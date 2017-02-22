

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Acyclicity {
    public static int acyclic(ArrayList<Integer>[] adj) {
        
    	Integer[] oneInteger = new Integer[1];
    	oneInteger[0] = new Integer(0);
    	
    	//ArrayList<Integer> visitedVertices = new ArrayList();
    	
    	Map<Integer,Boolean> visited = new HashMap(adj.length,1); 
    	for(int i=0 ; i < adj.length; i++){
        	visited.put(i, false);
        }
    	Map<Integer,Boolean> temporaryVisited = new HashMap(adj.length,1); 
    	for(int i=0 ; i < adj.length; i++){
        	temporaryVisited.put(i, false);
        }
    	
    	
    	
    	for(int i =0;i<adj.length;i++){
    		
    		if(oneInteger[0] == 1){
    			break;
    		}
    		if(adj[i].size() ==0 ){
    			continue;
    		}
    		
    		explore(i,visited,temporaryVisited,adj,oneInteger);
    	}
    	
    	
        return oneInteger[0].intValue();
    }
    
    
    public static void explore(int value, Map<Integer,Boolean> visited,Map<Integer,Boolean> temporaryVisited,ArrayList<Integer>[] adj,Integer[] oneInteger){
    	
    	int current = value;
    	
    	if(temporaryVisited.get(new Integer(current))== true){
    		oneInteger[0] = new Integer(1);
    	}
    	else {
    		temporaryVisited.put(new Integer(current), true);
    		
    		ArrayList<Integer> list = adj[current];
    		
    		for(int j =0; j < list.size();j++){
    			int number = list.get(j);
    			if(visited.get(new Integer(number)) == false){
    				explore(number,visited,temporaryVisited,adj,oneInteger);
    			}
    		}
    		temporaryVisited.put(new Integer(current),false);
    		visited.put(new Integer(current), true);
    	}
    	
    }
    

    public static void main(String[] args) {
        
    	
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n < 1 || n > 1000){
        	n = scanner.nextInt();
        }
        
        int m = scanner.nextInt();
        while(m < 0 || m > 1000){
        	m = scanner.nextInt();
        }
        
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            while(x < 0 || x > 1000){
            	x = scanner.nextInt();
            }
            
            y = scanner.nextInt();
            while(y < 0 || y > 1000){
            	y = scanner.nextInt();
            }
            
            adj[x - 1].add(y - 1);
        }
        System.out.println(acyclic(adj));
    }
}
