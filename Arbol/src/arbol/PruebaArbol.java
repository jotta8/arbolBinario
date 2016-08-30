/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Jota
 */
public class PruebaArbol {
    
    public static void main(String args[])
{
    Arbol arbol = new Arbol();
    int valor;

    System.out.println( "Insertando los siguientes valores: ");

    //insertando 10 numeros aleatorios del 0 al 99 en el arbol
    for (int i = 1; i<=10 ; i++)
    {
        valor = (int) (Math.random() * 100);
        System.out.print(valor + " ");
        arbol.insertarNodo(valor);
    }

    System.out.println("\n\nRecorrido preorden");
    arbol.recorridoPreorden();

    System.out.println("\n\nRecorrido inorden");
    arbol.recorridoInorden();

    System.out.println("\n\nRecorrido posorden");
    arbol.recorridoPosorden();
 }

}
