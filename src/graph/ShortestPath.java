package graph;

import java.io.IOException;
import java.util.*;

public class ShortestPath extends GreedyGraph {
	
	
	
	
	public ShortestPath(String name) throws IOException {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void shortpath(int beg, int dest){
		String s = "";
		int v = dest;
		
		System.out.println(this);
		this.greedy(beg);
		
		s = v + s;
		while(v != beg) {
			v = this.getVertex(v).getParent();
			s = v + "->" + s;
		}
		s = beg + "->" + s;
		
		System.out.println(s);

		System.out.println(this.getVertex(dest).getCost());
		
	}	
	public static void main(String[] args) throws IOException {
		ShortestPath s;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter graph file: ");
		String graphName = read.nextLine();
		s = new ShortestPath(graphName);
		
		System.out.println("Enter source vertex: ");
		int start = read.nextInt();
		System.out.println("Enter destination vertex: ");
		int end = read.nextInt();
		
		s.shortpath(start,end);
		
	
	}
	public double newCost(int v, int w){
		return costOf(v) + weightOf(new Edge(v, w, directed));
	}
	

			
}
		
		

