
window.onload = function () {

    /*   menu = document.getElementById("nav-placeholder");
  
      menu.innerHTML = "";
      menu.innerHTML += `<div class="vercaomobil">
      <input type="checkbox" id="check">
      <label for="check" class="checkbtn">
          <i class="fas fa-bars"></i>
      </label>
      <img class="mobilelogo" src="/img/logoMobile.png">
      <img class="logo" src="/img/Logo 1.png">
      <ul class="vercaomobil">
          <li><a href="/">Home</a></li>
          <li><a href="/about">Sobre Nós</a></li>
          <li class="botao" ><a href="/login">Login</a></li>
          <li class="botao" ><a href="/cadastro_usuario">Cadastro</a></li>
      </ul>
  </div>
  <div class="flex-container invisivel">
      <div class="flex-container">
          <div>
              <img src="/img/logo.png" id="logoG">
          </div>
          <div class="home">
              <a href="/">Home</a>
  
          </div>
      </div>
      <div class="sobrenos">
          <a href="about">Sobre nós</a>
      </div>
      <div class="flex-container" class="espacoentre">
          <a href="/login">
              <div id="login">
                  Login
              </div>
          </a>
          <a href="cadastro_usuario">
              <div id="registro">
                  Cadastro
              </div>
          </a>
      </div>
  </div>`; */


    var radios = document.querySelectorAll('input[type=radio][name="idLista"]');
    buttns = document.getElementsByClassName("doar");
    var pai, pai2;
    pai2 = document.querySelectorAll('input[type=checkbox][class="cards"]');

    for (var i = 0; i < pai2.length; i++) {
        pai2[i].disabled = true;

    }



    idLista = 0;

    window.onchange = function () {
        console.log(radios.length)
        for (var i = 0; i < radios.length; i++) {
            if (radios[i].checked) {
                console.log(`checou ${i}`);
                idLista = radios[i].value;
                buttns[i].disabled = false;
                pai = radios[i].parentNode;
                nome = pai.getElementsByClassName("nome").innerHTML;
                matricula = pai.getElementsByClassName("matricula").value;
                endereco = pai.getElementsByClassName("endereco").innerHTML;
                console.log(endereco);
                console.log(matricula);
                console.log(nome);
                checadas = pai.querySelectorAll('input[type=checkbox][class="cards"]:checked');
                pai = pai.querySelectorAll('input[type=checkbox]');

                for (var x = 0; x < pai.length; x++) {
                    pai[x].disabled = false;

                }

                var itens = {};
                for (var p = 0; p < checadas.length; p++) {
                    itens[p] = checadas.value;
                }


                console.log(itens);
                console.log(checadas.length);

            } else {
                buttns[i].disabled = true;
                pai = radios[i].parentNode;
                pai = pai.querySelectorAll('input[type=checkbox]');
                for (var y = 0; y < pai.length; y++) {
                    pai[y].checked = false;
                    pai[y].disabled = true;


                }



            }

        }






    };
}