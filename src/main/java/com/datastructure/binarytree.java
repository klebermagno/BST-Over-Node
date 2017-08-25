package com.datastructure;

public class binarytree {
    
    int[] tree;
    
    public binarytree(int[] tree) {
        if(tree == null)
            throw new RuntimeException("The tree can't start null.");
        this.tree= tree; 
    }
    public void insert(int i){
        
    }
    
    public int findValue(int i ){
        return i;
    }
    
    public int[] balance(){
        
        return this.tree;
    }
    
    public void main(String[] args){
        
        System.out.println("Hello!");
    }
}
