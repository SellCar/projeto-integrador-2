  function confirmar(){
  window.confirm('Deseja salvar os dados?');
}

  const cpf = document.querySelector("#cpf");
  cpf.addEventListener("keyup", () => {
  let value = cpf.value.replace(/[^0-9]/g, "").replace(/^([\d]{3})([\d]{3})?([\d]{3})?([\d]{2})?/, "$1.$2.$3-$4");
  cpf.value = value;});

  const cep = document.querySelector("#cep");
  cep.addEventListener("keyup", () => {
  let value = cep.value.replace(/[^0-9]/g, "").replace(/^([\d]{2})([\d]{3})?([\d]{3})?/, "$1.$2-$3");
  cep.value = value;});

  const telefone = document.querySelector("#telefone");
  telefone.addEventListener("keyup", () => {
  let value = telefone.value.replace(/[^0-9]/g, "").replace(/^([\d]{2})([\d]{5})?([\d]{4})?/, "($1)$2-$3");
  telefone.value = value;});