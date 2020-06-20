
package automata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AutomataMain {
    //se define una variable global para la transicion epsilon
    public static String EPSILON = "e-";
    public static char EPSILON_CHAR = EPSILON.charAt(0);

    public static void main(String[] args) {
    	
    	
    	 Automata prueba = new Automata();
         
         Estado a = new Estado("a");
         prueba.setEstadoInicial(a);
         prueba.addEstados(a);
         
         Estado b = new Estado("b");
         Estado c = new Estado("c");


         a.setTransiciones(new Transicion(a,a,"1"));
         a.setTransiciones(new Transicion(a,b,"1"));
         b.setTransiciones(new Transicion(b,c,"0"));
         c.setTransiciones(new Transicion(c,c,"1"));
         c.setTransiciones(new Transicion(c,a,"1"));


         prueba.addEstados(b);
         prueba.addEstados(c);

  
         prueba.addEstadosAceptacion(c);
         HashSet alfabeto = new HashSet();
         alfabeto.add("0");
         alfabeto.add("1");
         
         prueba.setAlfabeto(alfabeto);
        

         
         	AFDConstructor constructor= new AFDConstructor();
//         
//         
         constructor.conversionAFN(prueba);
//       
        constructor.quitarEstadosTrampa(constructor.conversionAFN(prueba));

         
//         Estado a = new Estado("a");
//         prueba.setEstadoInicial(a);
//         prueba.addEstados(a);
//         Estado b = new Estado("b");
//         Estado c = new Estado("c");
//         Estado d = new Estado("d");
//         Estado e = new Estado("e");
//
//         a.setTransiciones(new Transicion(a,c,"1"));
//         a.setTransiciones(new Transicion(a,d,"1"));
//         a.setTransiciones(new Transicion(a,e,"1"));
//         a.setTransiciones(new Transicion(a,d,"4"));
//         d.setTransiciones(new Transicion(d,d,"4"));
//         c.setTransiciones(new Transicion(c,d,"2"));
//         d.setTransiciones(new Transicion(d,a,"2"));
//         e.setTransiciones(new Transicion(e,b,"3"));
//
//         prueba.addEstados(b);
//         prueba.addEstados(c);
//         prueba.addEstados(d);
//         prueba.addEstados(e);
//
//         prueba.addEstadosAceptacion(a);
//         prueba.addEstadosAceptacion(b);
//         prueba.addEstadosAceptacion(c);
//         HashSet alfabeto = new HashSet();
//         alfabeto.add("1");
//         alfabeto.add("2");
//         alfabeto.add("3");
//         alfabeto.add("4");
//         prueba.setAlfabeto(alfabeto);
    	
        // prueba.toString();
         
    }
    	
    	
  

}
