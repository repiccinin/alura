let amigosParticipantes = [];
let listaAmigos = document.getElementById('lista-amigos').textContent;

function adicionar(){
    if (amigosParticipantes.includes(document.getElementById('nome-amigo').value)){
        alert('Este nome já está no sorteio!');
        return;
    }
    if (document.getElementById('nome-amigo').value == ''){
        alert('Digite um nome');
        return;
    }

    amigosParticipantes.push(document.getElementById('nome-amigo').value);
    //listar amigos incluídos
    listaAmigosIncluidos();

    //limpar input
    document.getElementById('nome-amigo').value = '';
}

function sortear() {
    //limpar se já foi sorteado anteriormente
    document.getElementById('lista-sorteio').textContent = '';

    //é necessário ter ao menos 4 nomes para o sorteio funcionar
    if (amigosParticipantes.length < 4) {
        alert('É necessário ao menos 4 nomes para sortear!')
        return;
    } else {
        embaralhar(amigosParticipantes);
        let sorteio = document.getElementById('lista-sorteio');
    
        for (let i = 0; i < amigosParticipantes.length; i++){
            if (i == amigosParticipantes.length -1){
                sorteio.innerHTML = sorteio.innerHTML + amigosParticipantes[i] + '-->' + amigosParticipantes[0] + '<br>';
            } else {
                sorteio.innerHTML = sorteio.innerHTML + amigosParticipantes[i] + '-->' + amigosParticipantes[i+1] + '<br>';
            }
        }
    }

   
}

function reiniciar(){
    amigosParticipantes = [];
    listaAmigos = '';
    document.getElementById('lista-amigos').textContent = listaAmigos;
    sorteio = '';
    document.getElementById('lista-sorteio').textContent = sorteio;
}

function listaAmigosIncluidos(){
    for (let i = 0; i < amigosParticipantes.length; i++){
        if (i == 0) {
            listaAmigos = amigosParticipantes[i];
        } else {
            listaAmigos = `${listaAmigos}, ${amigosParticipantes[i]}`;
        }
    }
    document.getElementById('lista-amigos').textContent = listaAmigos;
    
}

function embaralhar(lista) {
    for (let indice = lista.length; indice; indice--) {
        const indiceAleatorio = Math.floor(Math.random() * indice);
        [lista[indice - 1], lista[indiceAleatorio]] = [lista[indiceAleatorio], lista[indice - 1]];
    }
}
