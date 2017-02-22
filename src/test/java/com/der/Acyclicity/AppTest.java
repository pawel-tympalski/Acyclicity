package com.der.Acyclicity;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
    public void haveCycleSmallDataInput()
    {
    	
    	String input = "4 4 1 2 4 1 2 3 3 1";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
        int n = scanner.nextInt();
        
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
    }
	
	
	@Test
    public void NoCycleSmallDataInput()
    {
    	
    	String input = "5 7 1 2 2 3 1 3 3 4 1 4 2 5 3 5";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(0,output);
    }
	
	@Test
	public void massiveData(){
		
		StringBuilder sb = new StringBuilder();
		sb.append("100 ");
		sb.append("100 ");
		
		for(int i = 1; i <= 99; i++){
			int j = i;
			sb.append(i + " ");
			++j;
			sb.append(j + " ");
		}
		
		sb.append("100 ");
		sb.append("1");
		
		String input = sb.toString();
		
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
		
	}
	
	@Test
	public void constrainVerticesLowThanOneTestHaveCycle(){
		String input = "0 4 4 1 2 4 1 2 3 3 1";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
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
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
	}
	
	@Test
	public void constrainVerticesHigherThan1000TestHaveCycle(){
		String input = "1001 4 4 1 2 4 1 2 3 3 1";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
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
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
	}
	
	@Test
	public void constrainEdgesLowThanZeroTestHaveCycle(){
		String input = "4 -1 4 1 2 4 1 2 3 3 1";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
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
            while(x < 1 || x > 1000){
            	x = scanner.nextInt();
            }
            y = scanner.nextInt();
            while(y < 1 || y > 1000){
            	y = scanner.nextInt();
            }
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
	}
	
	@Test
	public void constrainVerticesLowThanZeroTestHaveCycle(){
		String input = "0 4 4 1 2 4 1 2 3 3 1";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
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
            while(x < 1 || x > 1000){
            	x = scanner.nextInt();
            }
            y = scanner.nextInt();
            while(y < 1 || y > 1000){
            	y = scanner.nextInt();
            }
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
	}
	
	@Test
	public void constrainEdgeHigherThan1000TestHaveCycle(){
		String input = "4 1001 4 1 2 4 1 2 3 3 1";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
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
            while(x < 1 || x > 1000){
            	x = scanner.nextInt();
            }
            y = scanner.nextInt();
            while(y < 1 || y > 1000){
            	y = scanner.nextInt();
            }
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
	}
	
	@Test
	public void constrainVerticesLowThanZeroInTheMiddleTestHaveCycle(){
		String input = "4 4 0 1 2 4 1 2 3 3 1";
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
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
            while(x < 1 || x > 1000){
            	x = scanner.nextInt();
            }
            y = scanner.nextInt();
            while(y < 1 || y > 1000){
            	y = scanner.nextInt();
            }
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
	}
	
	@Test
	public void theirData() throws FileNotFoundException{
		
		ArrayList<Integer> arr = new ArrayList();
		Scanner take = new Scanner(new File("E://daitainput2.txt")).useDelimiter(" ,\n");
		while(take.hasNext()){
		String n = take.nextLine();
		String[] ar = n.split(" "); 
		for(int i=0; i<ar.length;i++){
			arr.add(new Integer(ar[i]));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("100 100 ");
		
		for(int i=0; i<arr.size();i++){
			if(i == arr.size() - 1){
				sb.append(arr.get(i));
			}
			else {
			sb.append(arr.get(i) + " ");
			}
		}
		
		String input = sb.toString();
		
		Scanner scanner = new Scanner(input).useDelimiter(" ");
		
		
        int n = scanner.nextInt();
        
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
        }
       
       int output = Acyclicity.acyclic(adj);
       assertEquals(1,output);
		
	}
}
