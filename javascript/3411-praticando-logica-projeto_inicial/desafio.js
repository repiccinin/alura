
//Crie uma função que valide se um número é positivo, negativo ou zero.
validaNumero(5);

function validaNumero(numero){
    if (numero == 0){
        alert('Número é zero');
    } else {
        if (numero > 0) {
            alert('Número é positivo');
        } else {
            alert('Número é negativo');
        }
    }
}

//Implemente uma função que verifique se uma pessoa é maior de idade.
validaIdade(36);

function validaIdade(idade) {
    if (idade >= 18){
        alert('Maior de idade');
    } else {
        alert('Menor de idade');
    }
}

//Desenvolva uma função que valide se uma string é vazia ou não.
console.log(validaVazio(''));

function validaVazio(string){
    return string === '' ? 'String está vazia' : 'String não está vazia';
    }
}

//Crie uma função que determine se um ano é bissexto
validaAnoBissexto(2024);

function validaAnoBissexto(ano){
    if ((ano % 4 === 0 && ano % 100 !== 0) || ano % 400 === 0) {
        alert(`${ano} é bissexto`);
    } else {
        alert(`${ano} não é bissexto`);
    }
}

//Implemente uma função que calcule a média de dois números, interrompendo a execução se algum dos números não for válido.
let mediaAluna = calculaMedia(7,8);

function calculaMedia(num1, num2){
    if (isNaN(num1) || (num1 <= 0)) {
        alert('Número 1 é inválido');
        return;
    }
    if (isNaN(num2) || (num2 <= 0)) {
        alert('Número 2 é inválido');
        return;
    }

    let media = (num1 + num2) / 2;
    return media;
}

//Desenvolva uma função que receba um array como parâmetro e retorne o seu tamanho.
let lista = [5,6,7,8];
let tamanhoLista = verificaTamanhoArray(lista);

function verificaTamanhoArray(lista){
    let tamanho = lista.length;
    return tamanho;
}

//Crie um array e utilize a função includes para verificar se um elemento específico está presente
let lista = [];
lista.push('Cida','Maria','João');
let elemento = 'José';
verificaItemArray1(lista, elemento);

function verificaItemArray1(lista, elem){
    if (lista.includes(elem)){
        alert('Item consta na lista');
    } else {
        alert('Item não consta na lista');
    }
}

//Implemente uma função que receba um array e um elemento, e retorne se o elemento está presente no array.
let lista = [];
lista.push('Cida','Maria','João');
let elemento = 'José';
 if verificaItemArray2(lista, elemento){
    alert('Item consta na lista');
 } else {
    alert('Item não consta na lista');
 }

function verificaItemArray2(lista, string){
    if (lista.includes(string)){
        return true;
    } else {
        return false;
    }
}

//Crie um array de strings e utilize includes para verificar se uma determinada string está presente.
let lista = [];
lista.push('Cida','Maria','João');
let elemento = 'José';
if (lista.includes(string)){
    alert('Item consta na lista');
} else {
    alert('Item não consta na lista');
}

//Desenvolva uma função que receba um array de objetos representando estudantes de um curso e um objeto que 
//representa um estudante procurado. Depois retorne se o objeto está presente no array.
const dadosAlfredo = {
    nome: 'Alfredo',
    idade: 27
}
const dadosRegiane = {
    nome: 'Regiane',
    idade: 36
}
let lista = [];
lista.push(dadosAlfredo);
lista.push(dadosRegiane);
let temObj = verificaItemArrayObj(lista, dadosRegiane);

function verificaItemArrayObj(,lista, obj){
    return lista.some(item => JSON.stringify(item) === JSON.stringify(obj));
}


//Crie uma função que receba um array de números e retorne a soma dos elementos pares e o produto dos elementos ímpares.
let lista = [];
lista.push(50,30,40,55,65,75);
alert(verificaImpares(lista));

function verificaImpares(lista){
    let soma
    for (let i = 0; i < lista.length; i++){
        if (lista[i] % 2 > 0){
            soma = soma + lista[i];
        }
    }
    return soma;
}
