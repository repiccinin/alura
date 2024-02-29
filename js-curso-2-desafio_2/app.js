/*
Desafios
Criar uma função que exibe "Olá, mundo!" no console.

Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.

Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

Criar uma função que recebe três números como parâmetros e retorna a média deles.

Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo
*/

imprimeOlaMundo();
imprimeNome('Regiane');
let dobro = calculaDobro(5);
console.log(dobro);
let media = calculaMedia(1, 5, 10);
console.log(`A média é ${media}`);   
let maior = verificaMaior(15, 6);
console.log(`O maior número é ${maior}`);
let quadrado = calculaQuadrado(5);
console.log(`O quadrado de 5 é ${quadrado}`);


function imprimeOlaMundo() {
    console.log('Olá, Mundo!');
}

function imprimeNome(nome) {
    console.log(`Olá, ${nome}`);
}

function calculaDobro(numero) {
    return numero * 2;
}

function calculaMedia(numero1, numero2, numero3) {
    let soma = numero1 + numero2 + numero3;
    let media = soma / 3;
    return media;
}

function verificaMaior(numero1, numero2) {
    if (numero1 > numero2) {
        return numero1
    } else {
        if (numero2 > numero1) {
            return numero2
            } 
    }
//return numero1 > numero2 ? numero1 : numero2;

}

function calculaQuadrado(numero1) {
    return numero1 * numero1;
}