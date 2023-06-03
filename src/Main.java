import java.util.ArrayList;
public class Main ListaElemetoexpecifico {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
    lista.add(10);
    lista.add(20);
    lista.add(30);
    lista.add(40);
    System.out.println("Lista de antes de inserir : "+lista );
    int elemento = 25;
    int posicao = 2;
    lista.add(posicao,elemento);

    System.out.println("Lista apos a inserçao: "+lista);
}}