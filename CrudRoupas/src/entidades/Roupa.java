package entidades;
import entidades.GerenciarRoupas;

    public class Roupa {

        String marca;
        String tipo;
        String tamanho;
        int quantidade;
        double valor;

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getTamanho() {
            return tamanho;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
            this.marca = marca;
            this.tipo = tipo;
            this.tamanho = tamanho;
            this.quantidade = quantidade;
            this.valor = valor;

        }
        public double valorTotal(){
            return this.quantidade * this.valor;
        }

        public void venda(int quantidade){
            if (quantidade > 0 && quantidade <= this.quantidade) {
                this.quantidade -= quantidade;
            } else {
                System.out.println("Informe um valor válido");
            }
        }

        public void abastecer(int quantidade){
            if(quantidade > 0){
                this.quantidade += quantidade;
                System.out.println("Estoque abastecido com sucesso");
            } else {
                System.out.println("Valor inválido");
            }

        }

        @Override
        public String toString() {
            return "Roupa{" +
                    "marca: '" + marca + '\'' +
                    ", tipo: '" + tipo + '\'' +
                    ", tamanho: '" + tamanho + '\'' +
                    ", quantidade: " + quantidade +
                    ", valor total:" + valorTotal()+
                    '}';
        }
    }
