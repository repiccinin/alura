/*Crie um programa que verifica se uma palavra ou frase é um palíndromo.*/
exibirMensagemInicial();


function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
    responsiveVoice.speak(texto, 'Brazilian Portuguese Female',{rate:1.2});
}

function exibirMensagemInicial() {
    exibirTextoNaTela('h1', 'Verifica Palíndromo');
    exibirTextoNaTela('p', 'Digite uma palavra ou frase:'); 
}

function verificarPalindromo() {
    let frase = document.querySelector('input').value;
    var re = /[\W_]/g;
    var lowRegStr = frase.toLowerCase().replace(re, '');
    var reverseStr = lowRegStr.split('').reverse().join(''); 
    alert(reverseStr === lowRegStr ? "A palavra/frase digitada é um Palíndromo" : "A palavra/frase digitada não é um Palíndromo");
    document.getElementById('reiniciar').removeAttribute('disabled');
}


function limparCampo() {
    frase = document.querySelector('input');
    frase.value = '';
}
function reiniciarJogo() {
    limparCampo();
    exibirMensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled', true);
}