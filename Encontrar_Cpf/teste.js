const pessoas = [
  {
    nome: "Alessandro Vitorio",
    cpf: "222.333.444-55",
    dataNasc: "06/03/1981",
    habilitado: true
  },
  {
    nome: "Mariana Costa",
    cpf: "123.456.789-00",
    dataNasc: "15/09/1990",
    habilitado: false
  },
  {
    nome: "Roberto Almeida",
    cpf: "987.654.321-99",
    dataNasc: "22/11/1985",
    habilitado: true
  },
  {
    nome: "Fernanda Silva",
    cpf: "321.654.987-33",
    dataNasc: "01/02/1993",
    habilitado: false
  },
  {
    nome: "Carlos Henrique",
    cpf: "111.222.333-44",
    dataNasc: "30/07/1978",
    habilitado: true
  }
];


function BuscarPorCpf(cpf){
    for(let i = 0; i < pessoas.length; i++){
        if (pessoas[i].cpf==cpf){
            return pessoas[i]
        }
    }
    
    return console.log("Não cadastrado !")
    
}

console.log(BuscarPorCpf("111.222.333-44"))