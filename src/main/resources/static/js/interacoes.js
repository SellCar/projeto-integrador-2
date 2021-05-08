  function confirmar(){
    var confirmar = confirm('Deseja salvar os dados?');
  if(confirmar == true){
    alert("Dados salvos com sucesso!")
    return true
  } else {
    return false
  }
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
    var sair = confirm('Deseja sair do sistema?');
    if (sair == true){
      alert("Volte Sempre!!!");
      return true
    } else {
      return false
    }
  }

  function entrar(){
    var entrar = confirm("Deseja entrar no sistema?");
    if(entrar == true){
      var nome = document.getElementById("login").value;
      alert("Seja Bem Vindo, " + nome);
      return true
    } else{
      return false
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

  function alterar(){
    var alterar = confirm("Deseja alterar o item?")
    if(alterar == true){
      return true
    } else {
      return false
    }
  }
  function fonte(e){
    var elemento = $("#bgWhite");
    var fonte = elemento.css('font-size');
    if (e == 'a') {
        elemento.css("fontSize", parseInt(fonte) + 5);
    } else if('d'){
        elemento.css("fontSize", parseInt(fonte) - 5);
    }
}

