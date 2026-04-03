document.getElementById("produtoForm").addEventListener("submit", function (event) {
    event.preventDefault();

    const produto = {
        tipo: document.getElementById("tipo").value,
        tamanho: document.getElementById("tamanho").value,
        quantidade: Number(document.getElementById("quantidade").value),
        preco: Number(document.getElementById("valor").value),
        marca: document.getElementById("marca").value
    };

    fetch("https://pedropaulosil.github.io/LojaRoupa_SpringAPI_Rest/", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(produto)
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById("resultado").textContent =
            JSON.stringify(data, null, 4);
    })
    .catch(error => {
        document.getElementById("resultado").textContent =
            "Erro ao enviar dados: " + error;
    });
});
