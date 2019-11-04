package Lista;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Lista lista = new Lista();
        int tama=0;
        int tamaaux=0;

        do{
                System.out.print("Proporcione el tamaño de la lista ligada: ");
                Scanner ta =new Scanner(System.in);
                tama=ta.nextInt();
      
        if(tama<2) 
                System.out.print("\nEl tamaño de la lista debe ser mayor a 1\n");
        }while(tama<2);
        
                tamaaux=tama;
                System.out.println("\n¡¡¡Se ha creado una lista!!!...\n");
                
        for(int i=0;i<tama;i++) {
            lista.agregarAlInicio(999999999);
        }
        	lista.listar();
        	System.out.print(" | Tamaño: ");
                System.out.println(lista.getTamanio());
                int contador=0,opcion=0;
             
        while(opcion!=4) {
      		System.out.print("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*\n");
                System.out.println("Menu:");
                System.out.println("1.-Insertar valor");
                System.out.println("2.-Vaciar nodos");
                System.out.println("3.-Mostrar lista");
                System.out.println("4.-Salir");
                System.out.println("Proporcione una opcion:");
      		//System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*\n");
                Scanner opc =new Scanner(System.in);
                opcion=opc.nextInt();
             switch(opcion) {
             	case 1:
             		System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*\n");
             		if(tamaaux>0) {
                 		
                                System.out.print("Proporcione el numero a ingresar en la lista ligada\n");
                                Scanner nume = new Scanner(System.in);
                                int numero=nume.nextInt();
                                tamaaux=tamaaux-1;
                                lista.editarPorPosicion(contador, numero);
                                lista.listar();
                                System.out.print("\n");
                                lista.ordena();
             		}
             		else {
             			System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Error lista ligada  llena*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
             		}
             		break;
             		
             	case 2:
             		//System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*\n");
             		if(tamaaux>0) {
             			System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Error! primero debe llenar la lista ligada*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
             		}
             		else{
             			for(int i=0;i<tama;i++) {
                                    lista.eliminaFinal();
                                    lista.ordenaDespuesDeEliminar();
             			}   		
             			tamaaux=tama;
             		}
             	break;
             	
             	case 3:
            		System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*\n");
             		lista.listar();
             		break;
             		
             	case 4:
            		System.out.print("Adios!!!!!\n");
            		break;
             		
             	default:
            		System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Error!! ingrese una opcion valida*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
             		break;
            }
        }//fin mientras
    }   
}