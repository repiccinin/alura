
alert('Boas vindas ao jogo do número secreto!');
let limite = 1000;
let numeroSecreto = parseInt(Math.random() * limite + 1);
//console.log(`numeroSecreto = ${numeroSecreto}`);
let chute //= prompt('Escolha um número entre 1 e 30');
//console.log('chute = ', chute);
let tentativas = 1;

//enquanto chute não for igual ao número secreto
while (chute != numeroSecreto) {
    chute = prompt(`Escolha um número entre 1 e ${limite}`);
    // se o chute for igual ao número secreto
    //console.log('chute = numeroSecreto? ', chute==numeroSecreto);
    if (numeroSecreto == chute) {
        break;
    } else {
        if (numeroSecreto > chute){
            alert(`O número secreto é maior que ${chute}`);
        } else {
            alert(`O número secreto é menor que ${chute}`);
        }
        tentativas++; //= tentativas + 1;
    }
}

//operador ternário
let palavraTentativa = tentativas > 1 ? 'tentativas' : "tentativa";
alert(`Isso ai! Você descobriu o número secreto (${numeroSecreto}) com ${tentativas} ${palavraTentativa}`);
  


/* 
//DESAFIO 1

//1. Mostre um alerta com a mensagem "Boas vindas ao nosso site!".
alert('Boas vindas ao nosso site!');

//2. Declare uma variável chamada nome e atribua a ela o valor "Lua".
let nome = 'Lua';

//3. Crie uma variável chamada idade e atribua a ela o valor 25.
let idade = 25;

//4. Defina uma variável numeroDeVendas e atribua a ela o valor 50.
let numeroDeVendas = 50;

//5. Defina uma variável saldoDisponivel e atribua a ela o valor 1000.
let saldoDisponivel = 1000;

//6. Exiba um alerta com o texto "Erro! Preencha todos os campos"
alert('Erro! Preencha todos os campos');

//7. Declare uma variável chamada mensagemDeErro e atribua a ela o valor "Erro! Preencha todos os campos" 
//Agora exiba um alerta com o valor da variável mensagemDeErro.
let mensagemDeErro = 'Erro! Preencha todos os campos';
alert(mensagemDeErro);

//8. Use um prompt para perguntar o nome do usuário e armazená-lo na variável nome.
nome = prompt('Nome do usuário: ');

//9. Peça ao usuário para digitar sua idade usando um prompt e armazene-a na variável idade.
idade = prompt('Digite sua idade: ');

//10. Agora, caso a idade seja maior ou igual que 18, exiba um alerta com a mensagem "Pode tirar a habilitação!".
if (idade >= 18) {
    alert('Pode tirar habilitação');
}
*/

/*
//Desafios 2
//1. Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". 
//Caso contrário, mostre "Boa semana!".
let diaDaSemana = prompt('Qual é o dia da semana?');
if (diaDaSemana=='Sábado') {
    alert('Bom fim de semana!');
} else {
    if (diaDaSemana=='Domingo'){
        alert('Bom fim de semana!');
    } else {
        alert('Boa semana');
    }
}

//Solução com operadores
let diaDaSemana = prompt('Qual é o dia da semana?');
if (diaDaSemana=='Sábado' || diaDaSemana=='Domingo') {
    alert('Bom fim de semana!');
} else {
    alert('Boa semana');
    }

//2. Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.
let numeroDigitado = prompt('Escolha um número');
if (numeroDigitado >= 0){
    alert('Número positivo');
} else {
    alert('Número Negativo');
}
//3. Crie um sistema de pontuação para um jogo. Se a pontuação for maior ou igual a 100, mostre "Parabéns, você venceu!". 
//Caso contrário, mostre "Tente novamente para ganhar.".
let pontuacao = prompt('Digite um número:');
if (pontuacao>=100){
    alert('Parabéns, você venceu!');
} else {
    alert('Tente novamente para ganhar');
}
//4. Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo.
let saldo = 356459;
alert(`Saldo ${saldo}`);
//5. Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome.
let nomeUsuario = prompt('Digite seu nome:');
alert(`Bem vindo(a) ${nomeUsuario}`);
*/

/*
//Desafios 3
//1. Crie um contador que comece em 1 e vá até 10 usando um loop while. Mostre cada número.
let contador = 1;
while (contador < 11) {
    alert(`Contador ${contador}`);
    contador++;
}
//2. Crie um contador que começa em 10 e vá até 0 usando um loop while. Mostre cada número.
let contador = 10;
while (contador != 0) {
    alert(`Contador ${contador}`);
    contador--;
}
//3. Crie um programa de contagem regressiva. Peça um número e conte deste número até 0, usando um loop while no console do navegador.
let contador = prompt('Digite um número: ');
while (contador != 0) {
    alert(`Contador ${contador}`);
    contador--;
}
//4. Crie um programa de contagem progressiva. Peça um número e conte de 0 até esse número, usando um loop while no console do navegador.
let contador = 1
let numeroDigitado = prompt('Digite um número');
while (contador <= numeroDigitado) {
    alert(`Contador ${contador}`);
    contador++;
}
*/



/*
//Desafios finais
//1. Crie um programa que utilize o console.log para exibir uma mensagem de boas-vindas.
console.log("Bem-vindo(a)");

//2. Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o console.log para exibir a mensagem 
//"Olá, [seu nome]!" no console do navegador.
let nome = "Regiane";
console.log(`Olá, ${nome}!`);

//3. Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o alert para exibir a mensagem 
//"Olá, [seu nome]!" .
let nome = "Regiane";
alert(`Olá, ${nome}!`);

//4. Utilize o prompt e faça a seguinte pergunta: Qual a linguagem de programação que você mais gosta?. Em seguida, 
//armazene a resposta em uma variável e mostre no console do navegador.
let linguagem = prompt('Qual a linguagem de programação que você mais gosta?');
console.log(linguagem);

//5. Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, 
//realize a soma desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para 
//mostrar a mensagem "A soma de [valor1] e [valor2] é igual a [resultado]." no console.
let valor1 = 5;
let valor2 = 9;
let resultado = valor1 + valor2;
console.log(`A soma de [${valor1}] e [${valor2}] é igual a [${resultado}].`);

//6. Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, 
//realize a subtração desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log 
//para mostrar a mensagem "A diferença entre [valor1] e [valor2] é igual a [resultado]." no console.
let valor1 = 5;
let valor2 = 2;
let resultado = valor1 - valor2;
console.log(`A diferença entre [${valor1}] e [${valor2}] é igual a [${resultado}].`);

//7. Peça ao usuário para inserir sua idade com prompt. Com base na idade inserida, utilize um if para verificar se a pessoa é maior 
//ou menor de idade, exibindo uma mensagem apropriada no console.
let idade = prompt('Digite sua idade');
if (idade < 18) {
    console.log('Menor de idade');
} else {
    console.log('Maior de idade');
}

//8. Crie uma variável "numero" e peça um valor com prompt verifique se é positivo, negativo ou zero. Use if-else para imprimir a 
//respectiva mensagem.
let numero = prompt('Digite um número');
if (numero == 0) {
    alert('Número é zero');
} else {
    if (numero > 0) {
        alert('Número é positivo');
    } else {
        alert('Número é negativo');
    }
}

//9. Use um loop while para imprimir os números de 1 a 10 no console.
let contador = 1;
while (contador < 11) {
    console.log(contador);
    contador++;
}

//10. Crie uma variável "nota" e atribua um valor numérico a ela. Use if-else para determinar se a nota é maior ou igual a 7 e exiba 
//"Aprovado" ou "Reprovado" no console.
let nota = 8;
if (nota >= 7) {
    console.log('Aprovado');
} else {
    console.log('Reprovado');
}

//11. Use o Math.random para gerar qualquer número aleatório e exiba esse número no console.
let numero = Math.random();
console.log(numero);

//12. Use o Math.random para gerar um número inteiro entre 1 e 10 e exiba esse número no console.
let numeroInteiro = parseInt(Math.random() * 10 + 1);
console.log(numeroInteiro);

//13. Use o Math.random para gerar um número inteiro entre 1 e 1000 e exiba esse número no console.
let numeroInteiro = parseInt(Math.random() * 1000 + 1);
console.log(numeroInteiro);

*/