



window.onload = function () {
    aux = '';


    console.log(localStorage.nome);
    console.log(localStorage.cidade);
    console.log(localStorage.escola);
    console.log(localStorage.cep);
    console.log(localStorage.estado);
    console.log(localStorage.matricula);

    $inputsHidden = $(".inputsHidden");
    $inputsHidden.html(function () {
        aux = `<input type="hidden" name="infoAluno.nomeAluno" value="${localStorage.nome}">`
        aux += `<input type="hidden" name="infoAluno.matricula" value="${localStorage.matricula}">`
        aux += `<input type="hidden" name="infoEscola.nomeEscola" value="${localStorage.escola}">`
        aux += `<input type="hidden" name="infoEscola.cepEscola" value="${localStorage.cep}">`
        aux += `<input type="hidden" name="infoEscola.estadoEscola" value="${localStorage.estado}">`
        aux += `<input type="hidden" name="infoEscola.cidadeEscola" value="${localStorage.cidade}">`
        return aux;
    }
    );




    divMater = document.getElementById("listaMater");
    materiais =
        [
            "Lápis de Cor - 12 Cores",
            "Lápis de Cor - 24 Cores",
            "Caneta Esferográfica Azul ou Preta",
            "Caneta Esferográfica Vermelha",
            "Lápis Preto",
            "Cola Líquida",
            "Tesoura sem Ponta",
            "Cola Bastão",
            "Borracha",
            "Apontador",
            "Régua",
            "Caderno Universtário",
            "Caderno de 20 materias",
            "Mochila Escolar",
            "Alcool em Gel",
            "Agenda"
        ];
    /*etch('materiais.json')
            .then(res => res.json())
            .then(data => carregarMateriais(data))
    */
    carregarMateriais(materiais);


    function carregarMateriais(infos) {
        infos.forEach(info => {



            //divMater.innerHTML += `<label for=""> ${info} </label> <br>
            //<input type="checkbox" id="itens" name="itens" value="${info}" value="${info}">`;

            divMater.innerHTML += `<li><input type="checkbox" name="itens" id="${info}" value="${info}"><label
        for="${info}">${info}</label></li>`

        });

    }
};
