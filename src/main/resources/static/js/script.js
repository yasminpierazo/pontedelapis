window.onload = function(){
    
    selectEstado = document.getElementById("estado");
    selectCidade = document.getElementById("cidade");

    fetch('https://servicodados.ibge.gov.br/api/v1/localidades/estados/')
        .then(res => res.json())
        .then(data => selecionarCidadesEstados(data))


    var $estado = $(".estado");

    function selecionarCidadesEstados(infos) {

        $estado.select2();
        $estado.html(function () {
            let opcoes = '<option value="" selected></option>';
            infos.forEach(info => {

                opcoes += `<option value="${info.sigla}">${info.nome}</option>`;

            }
            );
            return opcoes;
        });
        var $cidade = $(".cidade").select2();
        $estado.change(function () {

            //selectCidade.disabled = false;
            var seleci = $estado.val();
            console.log(seleci);
            fetch(`https://servicodados.ibge.gov.br/api/v1/localidades/estados/${seleci}/municipios`)
                .then(res => res.json())
                .then(data2 => foda(data2))

            function foda(infos) {

                $cidade.prop('disabled', false);
                $cidade.html(function () {
                    let opcoes = '<option value="" selected></option>';
                    infos.forEach(info => {
        
                        opcoes += `<option value="${info.nome}">${info.nome}</option>`;
        
                    }
                    );
                    return opcoes;
                });


            }
        });
    }
};