/*
Desafios
*/

//1. Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, 
//que serão recebidos como parâmetro. IMC = peso / (altura x altura).
console.log(`Seu IMC é ${calculaIMC(1.72,104.4)}`);

function calculaIMC(altura, peso) {
    let IMC = peso / (altura * altura);
    return IMC;
}

//2. Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.
let numero1 = 5;
let resultado = calculaFatorial(numero1);
console.log(`Fatorial de ${numero1} é ${calculaFatorial(numero1)}`);

function calculaFatorial(numero1){
    if (numero1 === 0 || numero1 === 1) {
        return 1;
      }
    
      let fatorial = 1;
      for (let i = 2; i <= numero1; i++) {
        fatorial *= i;
      }
    
      return fatorial;
}

//3. Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a 
//cotação do dólar igual a R$4,80.
let dolares = 3500;
const valorDolar = 4.8;
console.log(`${dolares} dolares é igual a ${converteDolarParaReal(dolares,valorDolar)} reais`);

function converteDolarParaReal(dolares,valorDolar) {
    let totalReais = dolares * valorDolar;
    return totalReais
}

//4. Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.
//P=2(b+h)
let largura = 5;
let altura = 2;
console.log(`O perimetro de ${largura} e ${altura} é ${perimetroRetangulo(largura,altura)}`);

function perimetroRetangulo(largura,altura) {
    return 2 * (largura + altura);
}

//5. Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. 
//Considere Pi = 3,14. C = 2 * π * r

let raio = 6;
console.log(`O perimetro de ${raio} é ${perimetroCirculo(raio)}`);

function perimetroCirculo(r) {
    return 2 * 3.14 * r
}

//6. Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.
let tabuada = 9;
exibirTabuada(tabuada);

function exibirTabuada(tabuada) {
    let multiplicar = 1;
    while (multiplicar < 11){
        console.log(`${tabuada}x${multiplicar}=${calcularTabuada(tabuada,multiplicar)}`);
        multiplicar++;
    }
}

function calcularTabuada(tabuada,multiplicar){
    return tabuada * multiplicar
}
