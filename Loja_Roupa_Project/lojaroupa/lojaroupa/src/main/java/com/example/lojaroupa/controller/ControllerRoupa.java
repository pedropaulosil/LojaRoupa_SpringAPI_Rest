package com.example.lojaroupa.controller;


import com.example.lojaroupa.model.DadosRoupas;
import com.example.lojaroupa.model.Roupa;
import com.example.lojaroupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// Identificar que essa classe é um Controller - responsável por receber as requisições em http
// Rest - API rest

// Funcionamento da API REST - Usa metodos do protocolo HTTP para definir ações.
// Metodo GET - Busca Dados
// Metodo POST - Criar Dados
// PUT - Atualizar
// DELETE - Excluir dados

//Define a URL do Controller
//Nosso controle terá seguinte endpoint
//http/localhost:8080/roupas
@RestController
@RequestMapping("/roupas")
//Liberar Acesso
@CrossOrigin(origins = "*")
public class ControllerRoupa {

    @Autowired
    private RoupaRepository roupaRepository;

   @PostMapping
    public void cadastrarRoupa(@RequestBody DadosRoupas dadosRoupas){
       System.out.println(dadosRoupas);
       roupaRepository.save(new Roupa(dadosRoupas));

   }
   @GetMapping
    public Lits<Roupa> ListarRoupas(){
       return roupaRepository.findAll();

   }

}
