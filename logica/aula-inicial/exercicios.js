function raiz() {
    var numero = Number(numQ.value);
    if (numero >= 1) {
        resultado.innerHTML = (numero * numero).toFixed(2);
        resultado.style.display = 'block';
    }

}

function outraraiz() {
    var numero1 = Number(numSq.value);
    var numero2 = Number(numSq2.value);
    var numero3 = Number(numSq3.value);
    var soma = numero1 + numero2 + numero3;
    var raiz = soma * soma;
    if (soma > 1) {
        resultado.innerHTML = raiz.toFixed(2);
        resultado.style.display = 'block';
    }

}
function calculo() {
    var numero1 = Number(numC.value);
    var numero2 = Number(numC2.value);
    var numero3 = Number(numC3.value);
    var numero4 = Number(numC4.value);
    var multi = numero1 * numero3;
    var soma = numero2 + numero4;
    if (numero1 > 0 && numero2 > 0 && numero3 > 0 && numero4 > 0) {
        resultMult.innerHTML = multi.toFixed(2);
        resultSoma.innerHTML = soma.toFixed(2);
        resultMult.style.display = 'block';
        resultSoma.style.display = 'block';
    }

}

function cota() {
    var dolar = Number(vDolar.value);
    var real = Number(vReal.value);
    var convertido = (real / dolar);
    if (dolar > 0 && real > 0) {
        resultado.innerHTML = convertido.toFixed(2);
        resultado.style.display = 'block';
    }

}



function abastecendo(){
    var gasolina = Number(combustivel.value);
    var pagamento = Number(dinheiro.value);
    var litro = pagamento / gasolina ;
    if (gasolina > 1 && dinheiro > 1) {
        resultado.innerHTML = litro;
        resultado.style.display = 'block';

    }


}
/*
function tempera(){

}
function volum(){

}
function prestar(){

}
function rico(){

}
*/