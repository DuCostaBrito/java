package lista9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Principal {
    public static void main(String args[]){

        //Monitores
        Monitor obj1 = new Monitor("Jose", 12031, 1062);
        Monitor obj2 = new Monitor("Mariana", 183113, 1055);
        Monitor obj3 = new Monitor("Eduardo", 1311232, 1055);

        TreeSet<Monitor> arvore = new TreeSet<Monitor>();
        arvore.add(obj1);
        arvore.add(obj2);
        arvore.add(obj3);

        Iterator<Monitor> i = arvore.iterator();
        while (i.hasNext()) {
            Monitor tmp = i.next();
            tmp.imprimir();
        }

        //Professores
        Professor prof1 = new Professor("Edinei", 0);
        Professor prof2 = new Professor("Josiane", 1);
        Professor prof3 = new Professor("Lucio", 2);
        Professor prof4 = new Professor("Ana", 3);
        Professor prof5 = new Professor("Tracer", 4);

        LinkedList<Professor> list = new LinkedList<Professor>();
        list.add(prof1);
        list.add(prof2);
        list.add(prof3);
        list.add(prof4);
        list.add(prof5);
    }
}
