window.onload = function () {
    nome1 = document.getElementById("nomeAluno1");
    nome2 = document.getElementById("nomeAluno2");;
    escola1 = document.getElementById("Escola1");
    escola2 = document.getElementById("Escola2");
    cep1 = document.getElementById("cepEscola1");
    cep2 = document.getElementById("cepEscola2");
    estado1 = document.getElementById("Estado1");
    estado2 = document.getElementById("Estado2");
    cidade1 = document.getElementById("Cidade1");
    cidade2 = document.getElementById("Cidade2");
    matricula1 = document.getElementById("matricula1");
    matricula2 = document.getElementById("matricula2");

    $botao = $(".botaopadrao");
    var $menuu = $(".nav-placeholder");

    $menuu.load("/menuu");


}
counter=0;
window.onchange = function () {
        counter = 0;
    
        if (nome1.value == '') {
            localStorage.nome = nome2.value;

        
            
        }if (nome2.value == '') {
            localStorage.nome = nome1.value;
    
        } 

        if (escola1.value == '') {
            localStorage.escola = escola2.value;
          
        } else if (escola2.value == '') {
            localStorage.escola = escola1.value;
          
        }

        if (cep1.value == '') {
            localStorage.cep = cep2.value;
           
        } else if (cep2.value == '') {
            localStorage.cep = cep1.value;
        
        }

        if (estado1.value == '') {
            localStorage.estado = estado2.value;
            
        } else if (estado2.value == '') {
            localStorage.estado = estado1.value;
          
        } 


        if (cidade1.value == '') {
            localStorage.cidade = cidade2.value;
          
        } else if (cidade2.value == '') {
            localStorage.cidade = cidade1.value;
         
        }

        if (matricula1.value == '') {
            localStorage.matricula = matricula2.value;
          
        } else if (matricula2.value == '') {
            localStorage.matricula = matricula1.value;
            
        } 

        if(nome1.value != '' || nome2.value != ''){
            counter++;
        }
        if(escola1.value != '' || escola2.value != ''){
            counter++;
        }
        if(cep1.value != '' || cep2.value != ''){
            counter++;
        }
        if(estado1.value != '' || estado2.value != ''){
            counter++;
        }
        if(cidade1.value != '' || cidade2.value != ''){
            counter++;
        }

        if(matricula1.value != '' || matricula2.value != ''){
            counter++;
        }


        console.log(counter);
        if(counter >= 6){
            $botao.attr('href', '/cadastro_materiais');
        }else{
            $botao.attr('href', '');
        }


    };