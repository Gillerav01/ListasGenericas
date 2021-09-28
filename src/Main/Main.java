package Main;

import Entidades.ListaFinal;
import Entidades.Persona;

public class Main {

    public static void main(String[] args) {
        Persona Guillermo = new Persona(23, "Guillermo ", "Illera ", "21141255T. " );
        Persona Alex = new Persona(18, "Alex ", "Ramales  ", "21141543T. " );
        Persona Nina = new Persona(19, "Nina ", "Cojones ", "21141123H. " );
        
        ListaFinal lf = new ListaFinal();
        lf.add(Guillermo);
        lf.add(Alex);
        lf.add(Nina);
        
        lf.leer();
        
        
        
    }
    
}
