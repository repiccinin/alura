/*
Crie um programa com uma função que receba três números como argumentos e os retorne em ordem crescente. 
Exiba os números ordenados.

*/

let listaDeNumerosSorteados = [];

function sortearNumeros() {
    listaDeNumerosSorteados = [];
    for (let i = 0; i < 3; i++) {
        gerarNumeroAleatorio();
    }

    ordenarLista();
    alert(listaDeNumerosSorteados);
}

function gerarNumeroAleatorio() {
    let numeroEscolhido = parseInt(Math.random() * 100 + 1);
    if (listaDeNumerosSorteados.includes(numeroEscolhido)){
        return gerarNumeroAleatorio();
    } else {
        listaDeNumerosSorteados.push(numeroEscolhido);
        console.log(listaDeNumerosSorteados);
    }
}

function compareNumbers(a, b) {
    return a - b;
  }

function ordenarLista() {
    listaDeNumerosSorteados.join();
    listaDeNumerosSorteados.sort(); 
    listaDeNumerosSorteados.sort(compareNumbers); 
}