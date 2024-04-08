public class Prog {
//*********************************************//
    public static void desplegarMensaje(String m, int n) 
    {
        for(int i=0;i<n;i++);
        System.out.println(m);    
    }
    //Este metodo es polimorfismo

    public static void desplegarMensaje(String m)
    {
       System.out.println(m);
    }
//*********************************************//
    public static void main(String args[])//Arreglo de cadena
    {
        System.out.println(args[0]);
        desplegarMensaje(args[0]);
        desplegarMensaje(args[0],5);
    }
  
}

