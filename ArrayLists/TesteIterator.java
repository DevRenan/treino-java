import java.util.*;

class TesteIterator{
    public static void main( String[] args ) {
        ArrayList<String> l = new ArrayList<>();
        l.add(0,"a");
        l.add(1,"b");

        for(Iterator<String> i = l.iterator(); i.hasNext(); i.next()){
            String element = i.next();
            System.out.println(element);
        }

    }
}

//O código compila e imprime somente a.
// Isso porque ele executa um next durante o passo de iteração do laço for, o que acaba consumindo o segundo elemento sem imprimi-lo.