package graph;

import java.io.IOException;
import java.util.*;

public class ShortestPath extends GreedyGraph {
	
	
	
	
	public ShortestPath(String name) throws IOException {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void shortpath(int beg, int dest){
		System.out.println(this);
		this.greedy(beg);
		
		System.out.println(this.getVertex(dest).getCost());
		
	}	
	public static void main(String[] args) throws IOException {
		ShortestPath s = new ShortestPath(args[0]);
		s.shortpath(0,5);
	}
	public double newCost(int v, int w){
		return costOf(v) + weightOf(new Edge(v, w, directed));
	}
	

			
}
		
		

