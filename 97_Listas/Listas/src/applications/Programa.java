package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

    public static void main(String[] args) {

        /*lista <de numeros inteiros> - nome da lista
        *classe ArrayList para implementar a Lista - instanciar*/
        List<String> list = new ArrayList<>();

        list.add("Yuran"); //posição 0
        list.add("Clebson");
        list.add("Mabeth");
        list.add("Medro");
        list.add(2, "Jacqueline");

        System.out.println(list.size());

        //pode remover um dado, comparando ele com um outro

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("---------------");
        //FUNÇÃO PREDICADO para remover qualquer palavra que comece com 'M'
        list.removeIf(x -> x.charAt(0)=='Y');
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("---------------");
        System.out.println("Index of Clebson " + list.indexOf("Clebson"));
        System.out.println("Index of Marco " + list.indexOf("Marco"));

        System.out.println("---------------");
        //para achar os membros da lista que começam com M
        List<String> result = list.stream().filter(x -> x.charAt(0)=='M').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }

        System.out.println("---------------");
        String name = list.stream().filter(x->x.charAt(0)=='M').findFirst().orElse(null);
        System.out.println(name);
    }

}
