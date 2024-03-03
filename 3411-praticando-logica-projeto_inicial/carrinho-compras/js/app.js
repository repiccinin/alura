limpar();

function adicionar() {
    //recuperar valores de nome do produto, quantidade e valor
    let quantidade = parseInt(document.getElementById('quantidade').value);
    let produto = document.getElementById('produto');
    let comboSelecionado = produto.options[produto.selectedIndex].value;
    let nomeProduto = comboSelecionado.split('-')[0];
    let valorUnitario = parseInt(comboSelecionado.split('$')[1]);
    
    //calcular o preço, o nosso subtotal
    let subtotal = quantidade * valorUnitario;
    
    //adicionar no carrinho
    let carrinho = document.getElementById('lista-produtos');
    carrinho.innerHTML = carrinho.innerHTML +`<section class="carrinho__produtos__produto">
    <span class="texto-azul">${quantidade}x</span> ${nomeProduto} <span class="texto-azul">R$${subtotal}</span>
  </section>`

    //atualizar o valor total
    valorTotal = valorTotal + subtotal;
    let total = document.getElementById('valor-total')
    total.innerText = `R$${valorTotal}`;

    //limpar quantidade após adicionar
    document.getElementById('quantidade').value = 0;
}

function limpar(){
    valorTotal = 0;
    document.getElementById('lista-produtos').innerHTML = '';
    document.getElementById('valor-total').innerText = `R$0`;
}