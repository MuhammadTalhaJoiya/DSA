import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
//  * @author msale
//  */
// public class DirectedAdjaList {
//     private int V;
//     private int E;
//     LinkedList<Integer> [] ll;

//     public DirectedAdjaList(int vertices) {
//         this.V = vertices;
//         this.E = 0;
//         ll = new LinkedList[vertices];
//         for(int i=0; i<V; i++){
//             ll[i] = new LinkedList<>();
//         }        
//     }
//     public void addEdges(int u, int v){
//         ll[u].add(v);
//         E++;
//     }
//     public void display(){
//         System.out.println("Directed Adajcency List");
//         System.out.println("Vertices:   "+V);
//         System.out.println("Edges:  "+E);
//         char ch='A';
//         for(int i=0; i<V; i++){
//             // System.out.print(ch++ +": ");
//             for(int x:ll[i]){
//                 System.out.print(x );
//             }
//             // System.out.print("NULL");
//             // System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         // TODO code application logic here
//         //DirectedGraphAdjacencyMatrix dgm = new DirectedGraphAdjacencyMatrix(5);
//         //DirectedAdjaList dgm = new DirectedAdjaList(5);
//        // WeightedDirectedAdjMatrix dgm = new WeightedDirectedAdjMatrix(5);
//        DirectedAdjaList dgm = new DirectedAdjaList(5);
//         dgm.addEdges(0, 1);
//         dgm.addEdges(1, 2);
//         dgm.addEdges(1, 4);
//         dgm.addEdges(0, 3);
//         dgm.addEdges(3, 2);
//         dgm.addEdges(4, 2);
//         dgm.display();
//     }
    
    
// }

// import java.util.LinkedList;

// class DirectedAdjaList{
//     int V;
//     int E;
//     LinkedList<Integer>[] l1;
//     DirectedAdjaList(int v){
//         this.V=v;
//         E++;
//         this.l1=new LinkedList[v];
//         for(int i=0;i<v;i++){
//             l1[i]=new LinkedList<>();
//         }
//     }
//     public void addEdges(int u,int v){
//         l1[u].add(v);
//         E++;
//     }
//     public void display(){
//         System.out.println("Directed Adajcency List");
//         System.out.println("Vertices:   "+V);
//         System.out.println("Edges:  "+E);
//         char ch='A';
//         for(int i=0;i<V;i++){
//             System.out.print(ch++ +": ");
//             for(int x:l1[i])
//             {

//                             System.out.print(x );
//                 }
//                             System.out.print("NULL");
//                             System.out.println("");

//         }
//     }

//     public static void main(){
//         //DirectedGraphAdjacencyMatrix dgm = new DirectedGraphAdjacencyMatrix(5);
//         //DirectedAdjaList dgm = new DirectedAdjaList(5);
//        // WeightedDirectedAdjMatrix dgm = new WeightedDirectedAdjMatrix(5);
//        DirectedAdjaList dgm = new DirectedAdjaList(5);
//         dgm.addEdges(0, 1);
//         dgm.addEdges(1, 2);
//         dgm.addEdges(1, 4);
//         dgm.addEdges(0, 3);
//         dgm.addEdges(3, 2);
//         dgm.addEdges(4, 2);
//         dgm.display();
//     }
// }

// class DirectedAdjaList{
//     int V;
//     int E=0;
//     LinkedList<Integer>[] list;
//     DirectedAdjaList(int v){
//         this.V=v;
//         this.E++;
//         list=new LinkedList[v];
//         for(int i=0;i<v;i++){
//             list[i]=new LinkedList<Integer>();
//         }
//     }
//     public void addEdges(int u,int v){
//         list[u].add(v);
//         E++;
//     }
//     public void display(){
//         System.out.println("Directed Adajcency List");
//         System.out.println("Vertices:   "+V);
//         System.out.println("Edges:  "+E);
//         char ch='A';
//         for(int i=0; i<V; i++){
//             System.out.print(ch++ +": ");
//             for(int x:list[i]){
//                 System.out.print(x + "-->");
//             }
//             System.out.print("NULL");
//             System.out.println("");}
//     }
//     public static void main(){
//         DirectedAdjaList obj=new DirectedAdjaList(5);
//         obj.addEdges(1,2);
//         obj.addEdges(1,4);
//         obj.addEdges(4,2);

//         obj.addEdges(0,3);
//         obj.addEdges(3,2);
//         obj.addEdges(0, 1);

//         obj.display();
//         // dgm.addEdges(0, 1);
//         // dgm.addEdges(1, 2);
//         // dgm.addEdges(1, 4);
//         // dgm.addEdges(0, 3);
//         // dgm.addEdges(3, 2);
//         // dgm.addEdges(4, 2);
//     }
// }

// class DirectedAdjaList{
//     int V;
//     int E;
//     LinkedList<Integer>[] list;
//     DirectedAdjaList(int v){
//         this.V=v;
//         this.E=0;
//         this.list=new LinkedList[v];
//         for(int i=0;i<v;i++){
//             list[i]=new LinkedList<Integer>();
//         }
//     }
//     public void addEdges(int v,int j){
//         list[v].add(j);
//         E++;
//     }
//     public void display(){
//         char Char='A';
//         for(int i=0;i<V;i++){
//             System.out.print(Char++ +": ");
//             for(int x:list[i]){
//                 System.out.print(x+"-->");
//             }
//             System.out.print("NULL");
//             System.out.print(" ");
//         }
//     }
//     public static void main(){
//         DirectedAdjaList obj=new DirectedAdjaList(5);
//         obj.addEdges(0,1);
//         obj.addEdges(1,2);
//         obj.addEdges(1,4);
//         obj.addEdges(0,3);
//         obj.addEdges(3,2);
//         obj.addEdges(4,2);
//         obj.display();

// //         // dgm.addEdges(1, 2);
// //         // dgm.addEdges(1, 4);
// //         // dgm.addEdges(0, 3);
// //         // dgm.addEdges(3, 2);
// //         // dgm.addEdges(4, 2);
//     }
// }




// class AdjacencyList{
    
//     int V;
//     int E;
//     LinkedList<Edges>[] list;

//     class Edges{
//         int dest1;
//         int weight1;
//         Edges(int dest,int weight){
//             this.dest1=dest;
//             this.weight1=weight;
//         }
//     }
//     public AdjacencyList(int v){
//         this.V=v;
//         this.E=0;
//         this.list=new LinkedList[v];
//         for(int i=0;i<v;i++){
//             list[i]=new LinkedList<>();
//         }
//     }
    
    
//     public void addEdges(int u,int v,int weight){
//         list[u].add(new Edges(v,weight));
//         E++;
//     }

//     public void display(){
//         char Char='A';
//         for(int i=0;i<V;i++){
//             System.out.print(Char++ + ": ");
//             for(Edges x:list[i]){
//                 System.out.print(x.dest1 + "(" + x.weight1 + ")-->");
//             }
//             System.out.print("NULL");
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args){
//         AdjacencyList obj=new AdjacencyList(5);
//         obj.addEdges(0,1,4);
//         obj.addEdges(1,2,7);
//         obj.addEdges(1,4,1);
//         obj.addEdges(0,3,9);
//         obj.addEdges(3,2,12);
//         obj.addEdges(4,2,11);
//         obj.display();
//     }
// }


// class AdjacencyList{
//     class Edges{
//         int dest;
//         int weight;
//         Edges(int dest,int weight){
//             this.dest=dest;
//             this.weight=weight;

//         }
//     }
//     int V;
//     int E;
//     LinkedList<Edges>[] list;

//     AdjacencyList(int v){
//         this.V=v;
//         this.E=0;
//         this.list=new LinkedList[v];
//         for(int i=0;i<v;i++){
//             list[i]=new LinkedList<Edges>();
//         }
//     }
//     public void addEdges(int u,int v,int w){
//         list[u].add(new Edges(v, w));
//         E++;
//     }
//     public void display(){
//         char Char='A';
//         for(int i=0;i<V;i++){
//             System.out.print(Char++ + ": ");

//             for(Edges obj:list[i]){
//                 System.out.print(obj.dest + "(" + obj.weight +")-->");
//             }
//             System.out.print("NULL");
//             System.out.println("");
//         }
//     }

//     public static void main(String[] args){
//         AdjacencyList obj=new AdjacencyList(5);
//         obj.addEdges(0,1,4);
//         obj.addEdges(1,2,7);
//         obj.addEdges(1,4,1);
//         obj.addEdges(0,3,9);
//         obj.addEdges(3,2,12);
//         obj.addEdges(4,2,11);
//         obj.display();
//     }
// }