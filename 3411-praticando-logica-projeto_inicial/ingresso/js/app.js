let qtdePista = parseInt(document.getElementById('qtd-pista').textContent);
let qtdeSuperior = parseInt(document.getElementById('qtd-superior').textContent);
let qtdeInferior = parseInt(document.getElementById('qtd-inferior').textContent);
console.log(`Cadeira Inferior ${qtdeInferior} Cadeira SUperior ${qtdeSuperior} Pista ${qtdePista}`);

function comprar() {
    if (isNaN(parseInt(document.getElementById('qtd').value))||parseInt(document.getElementById('qtd').value) < 0) {
        alert('Informe a quantidade');
        limpaQtd();
        return;
    }
    let quantidade = parseInt(document.getElementById('qtd').value);
    let comboSelecionado = document.getElementById('tipo-ingresso');
    let tipoIngresso = comboSelecionado.options[comboSelecionado.selectedIndex].value;
    console.log(`selecionado: ${tipoIngresso} qtde ${quantidade}`)

    if (tipoIngresso == 'pista'){
        compraPista(quantidade);
        limpaQtd();
    } else {
        if (tipoIngresso == 'superior'){
            compraSuperior(quantidade);
        } else {
            compraInferior(quantidade);
        }
        limpaQtd();
    }
}
function limpaQtd() {
    document.getElementById('qtd').value = 0;
}
function compraPista(qtde){
    if (qtde <= qtdePista) {
        qtdePista = qtdePista - qtde;
        document.getElementById('qtd-pista').textContent = qtdePista;
        alert('Compra realizada com sucesso!');
    } else {
        alert('Quantidade indisponível para o setor');
    }
}
function compraSuperior(qtde){
    if (qtde <= qtdeSuperior) {
        qtdeSuperior = qtdeSuperior - qtde;
        document.getElementById('qtd-superior').textContent = qtdeSuperior;
        alert('Compra realizada com sucesso!');
    } else {
        alert('Quantidade indisponível para o setor');
    }
}
function compraInferior(qtde){
    if (qtde <= qtdeInferior) {
        qtdeInferior = qtdeInferior - qtde;
        document.getElementById('qtd-inferior').textContent = qtdeInferior;
        alert('Compra realizada com sucesso!');
    } else {
        alert('Quantidade indisponível para o setor');
    }
}