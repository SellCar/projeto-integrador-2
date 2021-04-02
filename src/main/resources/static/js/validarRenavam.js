/**
 * Função para validar sequencia de digitos de Renavam  
 * 
 * @link http://blog.victorjabur.com/2010/05/28/renavam_veiculos_java/ Função baseada em uma de java retirada desse link
 * @param string|int renavam Sequencia de digitos do renavam
 * @return boolean
 */
function verificaRenavam( renavam ) {

  var d = renavam.split("");
  soma = 0,
  valor = 0,
  digito = 0,
  x = 0;

  for (var i = 5; i >= 2; i--) {
    soma += d[x] * i;
    x++;
  }

  valor = soma % 11;

  if (valor == 11 || valor == 0 || valor >= 10) {
    digito = 0;
  } else {
    digito = valor;
  }

  if (digito == d[4]) {
    return true;
  } else {
    return false;
  }
}

console.log('197073212');