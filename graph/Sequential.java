// Sequential Representation Of Graph
// UnDirected Graph
// class Sequential {
//     int V;
//     int E;
//     int[][] ar;
//     Sequential(int v){
//         this.V=v;
//         this.E=0;
//         this.ar=new int[v][v];
//     }
//     public void addEdges(int i,int j){
//         ar[i][j]=1;
//         ar[j][i]=1;
//         E++;
//     }
//     public void display(){
//         for(int[] a:ar){
//             for(int x:a){
//                 System.out.print(x + "");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         Sequential obj=new Sequential(5);
//         obj.addEdges(0, 1); 
//         obj.addEdges(0, 3); 
//         obj.addEdges(1,2); 
//         obj.addEdges(1,3); 
//         obj.addEdges(2,4); 
//         obj.addEdges(3,4); 
//         obj.display();
//     }
// }


// Sequential representation of graph 
// Directed Graph
// class Sequential{
//     int V;
//     int E;
//     int[][] ar;
//     Sequential(int v){
//         this.V=v;
//         this.E=0;
//         this.ar=new int[v][v];
//     }
//     public void addEdges(int i,int j){
//         ar[i][j]=1;
//         E++;
//     }
//     public void display(){
//         for(int[] a:ar){
//             for(int x:a){
//                 System.out.print(x+"");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         Sequential obj=new Sequential(5);
//         obj.addEdges(0, 1); 
//         obj.addEdges(0, 3); 
//         obj.addEdges(1,2); 
//         obj.addEdges(1,3); 
//         obj.addEdges(2,4); 
//         obj.addEdges(3,4); 
//         obj.display();
//     }
// }


// Sequential Representation of Graph
// Directed Weighted Graph
// class Sequential{
//     int V;
//     int E;
//     int[][] ar;
//     Sequential(int v){
//         this.V=v;
//         this.E=0;
//         this.ar=new int[v][v];
//     }
//     public void addEdges(int i,int j,int w){
        
//         ar[i][j]=w;
//         // ar[j][i]=w;
//         E++;
//     }
//     public void display(){
//         for(int[] a:ar){
//             for(int x:a){
//                 System.out.print(x+" ");
//             }
//         System.out.println("");

//         }
//     }
//     public static void main(String[] args){
//         Sequential obj=new Sequential(5);
//         obj.addEdges(0, 1,5); 
//         obj.addEdges(0, 3,8); 
//         obj.addEdges(1,2,6); 
//         obj.addEdges(1,3,12); 
//         obj.addEdges(2,4,0); 
//         obj.addEdges(3,4,34); 
//         obj.display();
//     }
// }

// Sequential Representaion of Graph
// Weighted undirected grapgh
class Sequential{
    int V;
    int E;
    int[][] ar;
    Sequential(int v){
        this.V=v;
        this.E=0;
        this.ar=new int[v][v];
    }
    public void addEdges(int i,int j,int w){
        ar[i][j]=w;
        ar[j][i]=w;
        E++;
    }
    public void display(){
        for(int[] a:ar){
            for(int x:a){
                System.out.print(x+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Sequential obj=new Sequential(5);
        obj.addEdges(0, 1,5); 
        obj.addEdges(0, 3,8); 
        obj.addEdges(1,2,6); 
        obj.addEdges(1,3,12); 
        obj.addEdges(2,4,0); 
        obj.addEdges(3,4,34); 
        obj.display();
    }
} 