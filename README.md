Este projeto é uma API REST desenvolvida para o gerenciamento de estoque de uma loja de roupas. A aplicação permite o cadastro e a listagem de produtos através de uma interface web integrada com um back-end robusto em Java.

Tecnologias Utilizadas
    Back-end
    Java 25: Linguagem principal do projeto.
    
    Spring Boot 4.0.0: Framework para agilizar o desenvolvimento da aplicação.
    
    Spring Data JPA: Para persistência de dados e mapeamento objeto-relacional.
    
    MySQL: Banco de dados relacional utilizado.
    
    Lombok: Biblioteca para redução de código boilerplate (getters, setters, etc.).

    Maven: Gerenciador de dependências e build.

Front-end
    HTML5 / CSS3: Estrutura e estilização da interface.
    
    JavaScript (Fetch API): Comunicação assíncrona com o back-end.
    
    Bootstrap 5: Framework CSS para garantir um design responsivo e moderno.

 Estrutura do Projeto
    ControllerRoupa: Gerencia as rotas HTTP (GET, POST) e define o endpoint principal /roupas.
    
    Roupa: Entidade que representa a tabela no banco de dados.
    
    DadosRoupas: Um Java Record utilizado como DTO (Data Transfer Object) para transporte seguro de dados.
    
    RoupaRepository: Interface que estende JpaRepository, fornecendo métodos prontos para operações CRUD.
