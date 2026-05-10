package main;
import entidades.Roupa;
    public class Main {

        public static void main(String[] args) {
            Roupa roupa = new Roupa("Nike", "Blusa", "M", 10, 200);

            roupa.venda(10);
            roupa.abastecer(50);
            roupa.setQuantidade(50);

            System.out.println(roupa.toString());
        }
    }

