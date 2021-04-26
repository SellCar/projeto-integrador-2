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

  //const chassi = document.querySelector("#chassi");
  //chassi.addEventListener("keyup", () => {
  //let value = chassi.value.replace(/[^0-9A-Z]/g, "").replace(/^([\d]{3})([\d]{5})?([\d]{1})?([\d]{8})?/, "$1.$2.$3.$4");
  //cpf.value = value;});

  function sair(){
    var sair = window.confirm('Deseja sair do sistema?');
    if (sair == true){
      window.alert("Volte Sempre!!!");
    } else {
      window.location("menu-principal.html");
    }
  }

  function entrar(){
    var entrar = confirm("Deseja entrar no sistema?");
    if(entrar == true){
      var nome = document.getElementById("login").value;
      window.alert("Seja Bem Vindo, " + nome);
    }
  }

  // Alteraçoes feitas -- Botao excluir funcionando
  function excluir(){
   var exclude = confirm('Confirmar exclusão')
   if(exclude == true){
     alert("Item excluído com sucesso!");
     return true
   }
   else{
     return false
   }
  }
