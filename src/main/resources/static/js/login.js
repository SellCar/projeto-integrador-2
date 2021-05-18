function Login(){
    var done=0;
   
    var username=document.getElementById('inputusername').value;
    username=username.toLowerCase();
    var password=document.getElementById('inputPassword').value;
    password=password.toLowerCase();

    if (username=="booruno" && password=="bruno123") { window.location="/menu-principal"; done=1; }
    if (username=="michel" && password=="michel123") { window.location="/menu-principal"; done=1; }
    if (username=="emmanuel" && password=="emmanuel123") { window.location="/menu-principal"; done=1; }
    if (username=="davi" && password=="davi123") { window.location="/menu-principal"; done=1; }
    if (username=="test" && password=="test") { window.location="/menu-principal"; done=1; }
    if (done==0) { alert("Senha ou Usuário inválido."); }
    
    // var entrar = confirm("Deseja entrar no sistema?");
    // if(entrar == true){
    //   var nome = document.getElementById("login").value;
    //   alert("Seja Bem Vindo, " + nome);
    //   return true
    // } else{
    //   return false
    // }

}