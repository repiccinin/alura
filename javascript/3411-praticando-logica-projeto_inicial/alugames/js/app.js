let jogosAlugados = 1;

function alterarStatus(numeroJogo){
    
    let jogoClicado = document.getElementById(`game-${numeroJogo}`);    
    let imagem = jogoClicado.querySelector('.dashboard__item__img');
    let botao = jogoClicado.querySelector('.dashboard__item__button');

    if (botao.classList.contains('dashboard__item__button--return')) {
        botao.classList.remove('dashboard__item__button--return');
        imagem.classList.remove('dashboard__item__img--rented');
        botao.textContent = 'Alugar';
        alert('Jogo devolvido com sucesso!');
        jogosAlugados--;
    } else {
        botao.classList.add('dashboard__item__button--return');
        imagem.classList.add('dashboard__item__img--rented');    
        botao.textContent = 'Devolver';
        alert('Jogo alugado com sucesso!');
        jogosAlugados++;
    }
    console.log(`${jogosAlugados} jogos estão alugados`);
}
