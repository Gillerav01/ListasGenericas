package Main;

import Entidades.Cola1;
import Entidades.Iterador;
import Entidades.Lista;
import Entidades.ListaFinal;
import Entidades.Persona;
import Entidades.Pila;

public class Main {

    public static void main(String[] args) {
        Persona Guillermo = new Persona(23, "Guillermo ", "Illera ", "21141255T. " );
        Persona Alex = new Persona(18, "Alex ", "Ramales  ", "21141543T. " );
        Persona Nina = new Persona(19, "Nina ", "Cojones ", "21141123H. " );
        
//        ListaFinal lf = new ListaFinal();
//        lf.add(Guillermo);
//        lf.add(Alex);
//        lf.add(Nina);
//        
////        lf.leer();
//        
//        Iterador it = new Iterador(lf);
//        while (it.hasNext()) {
//            System.out.println(it.dameValor());
//            it.setActual(it.next());
//        }
//    Cola1 c1 = new Cola1();
//    
//    c1.encolar(Guillermo);
//    c1.encolar(Nina);
//    c1.encolar(Alex);
//    
//    System.out.println(c1.desencolar());
//    System.out.println(c1.desencolar());
//    System.out.println(c1.desencolar());
//    
//    c1.encolar(Guillermo);
//    c1.encolar(Nina);
//    c1.encolar(Alex);
//    
//    Cola2 c2 = new Cola2();
//    
//    Persona Mario = new Persona(23, "Mario ", "ASd2 ", "21141255T. " );
//    Persona Adrian = new Persona(18, "Adrian ", "Fasd  ", "21141543T. " );
//    Persona Pedro = new Persona(19, "Pedro ", "OAksd ", "21141123H. " );
//    
//    c2.encolar(Mario);
//    c2.encolar(Adrian);
//    c2.encolar(Pedro);
//    
//    System.out.println(c2.desencolar());
//    System.out.println(c2.desencolar());
//    System.out.println(c2.desencolar());
//
//      Lista l = new Lista();
//      l.añadir(Guillermo);
//      l.añadir(Alex);
//      l.añadir(Nina);
//      l.leer();
//    
//      Pila p = new Pila();
//      p.push(Guillermo);
//      p.push(Alex);
//      p.push(Nina);
//            
//      p.leer();

        Cola1 c = new Cola1();
        c.encolar(Guillermo);
        c.encolar(Alex);
        c.encolar(Nina);
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        

    }
    
}