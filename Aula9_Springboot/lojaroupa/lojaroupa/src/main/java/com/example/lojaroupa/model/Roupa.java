package com.example.lojaroupa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Informa qual tabela do banco de relaciona a entidade
@Table (name = "roupa")
//Informa que a class Roupa é uma entidade JPA
//Mapea a classe para o banco
@Entity(name = "roupa")
//Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {

    @Id //informa que o id é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //informa que o banco gera o id
    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double preco;

    public Roupa(DadosRoupas dadosRoupas) {
        this.marca = dadosRoupas.marca();
        this.tipo = dadosRoupas.tipo();
        this.tamanho = dadosRoupas.tamanho();
        this.quantidade = dadosRoupas.quantidade();
        this.preco = dadosRoupas.preco();
    }
}
