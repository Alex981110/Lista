package Lista;

public class Lista {
  
    private Nodo inicio;
    private int tamanio;
 
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia(){
        return inicio == null;
    }

    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    public int getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamanio){
            if (posicion == 0) {
                return inicio.getValor();
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }

 
    public void editarPorPosicion(int posicion , int valor){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio.setValor(valor);
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                    aux.setValor(valor);
            }
        }
    }

    public void removerPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }
    }

    public void listar(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
    
   public void ordena() throws Exception {
       
        int valor1,valor2,posicion1=0,posicion2=1;
        Nodo ini =inicio,aux =ini.getSiguiente();
	   
        while(aux!=null) {
                valor1=ini.getValor();
                valor2=aux.getValor();
            if(valor1<valor2) {

                editarPorPosicion(posicion2, valor1);
                editarPorPosicion(posicion1, valor2);
                listar();
                System.out.println(""); 
                    
            }
                ini=aux;
                aux=ini.getSiguiente();
                posicion1=posicion1+1;
                posicion2=posicion2+1;
        }
   }
   
   public void ordenaDespuesDeEliminar() throws Exception {
	
        int valor1,valor2,posicion1=0,posicion2=1;
	Nodo ini =inicio,aux =ini.getSiguiente();
	   
	while(aux!=null) {
                valor1=ini.getValor();
                valor2=aux.getValor();
            if(valor1<valor2) {

                editarPorPosicion(posicion2, valor1);
                editarPorPosicion(posicion1, valor2);
            }
                ini=aux;
                aux=ini.getSiguiente();
                posicion1=posicion1+1;
                posicion2=posicion2+1;
        }
   }
   
   public void eliminaFinal(){
       
    if (inicio==null)
        System.out.print("Lista Vacía...\n");
    else{
          Nodo aux=inicio; 
          for(int i=1;i<tamanio;i++)
               aux=aux.getSiguiente();
          System.out.print("[ " + aux.getValor() + " ]" + " ->  ");
          aux.setValor(99999999);
        }
   }		
}