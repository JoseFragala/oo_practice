/*
Essa classe representa "um Pet do mundo real" com:
Estado: name, clean
Comportamento: getters e setters
*/

public class Pet { // declara a classe.

    private String name = ""; // atributo (field/property) chamado name de tipo string
    // e private (encapsulamento - impede o acesso direto ao estado interno do objeto.)

    private boolean clean; // estado do pet (true - limpo | false - sujo)

    //contrutor
    public  Pet(final String name){ //contructor, executado automaticamente ao usar "new"
// inicializa o objeto e garante o estado válido.
// final string name (final - parametro não pode ser alterado dentro do construtor)
        this.name =  name; // name (parametro do construtor ) this.name(atributo do objeto)
        this.clean = false; //this indica o objeto que está sendo criado agora.
    }

    // Getter (método de acesso) - permite ler o nome e não permite alterar diretamente.
    public String getName() { // get - obter | getName() - obter nome.
        return name;
    }

    // Por que isClean() e não getClean()?
    // para boolean usa is --- 
    public boolean isClean() { //isClean() soa como uma pergunta: "Está limpo?"
        return clean;
    }
    
    //Setter (método de modificação)
    // permite alterar o estado. (Aqui está feito pela máquina, não pelo usuário)
    // -- Quem muda o  estado de um objeto deve ser quem tem responsabilidade sobre isso --
    // PetMachine decide quando o pet fica limpo e o Pet apenas aceita a mudança.
     public void setClean(boolean clean) {
        this.clean = clean;
    }


}