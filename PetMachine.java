// papel da classe:
/* 
representa a máquina de banho do petshop.
um objeto com estado que controla regras de negócio
*/

public class PetMachine {

    private boolean clean = true; // indica se a máquina está limpa

    private int water = 30;
                                // recursos e capacidade máxima da máquina
    private int shampoo =10;

    private Pet pet; // atributo que guarda a referência do pet atual 

  
// papel desse método é dar banho no pet, consumir recursos e alterar estados do pet e da máquina
    public void takeAShower(){ 
        if (pet == null){ // primeira validação (se não há pet não faz sentido continuar)
            System.out.println ("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        if (water < 10 || shampoo < 2) { // segunda validação: Há recursos suficientes?
        System.out.println("Recursos insuficientes para o banho");
        return;
    }
        // executa o banho
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true); // execução da ação, consome recursos e altera o estado do pet.
        clean = false; // após o banho, maquina fica suja.

        System.out.println("O pet " + pet.getName() + "está limpo"); // mensagem final.
         
    }

        public void addWater(){ // abastece água sempre em blocos de 2l.
            if (water == 30){
                System.out.println("A capacidade de água da máquina está no máximo");
                return;

            }
            water += 2;
        }

        public void addShampoo(){ // mesma lógica da água.
            if (shampoo == 10){
                System.out.println("A capacidade de shampoo da máquina está no máximo");
                return;

            }
            shampoo += 2;
        }

    public int getWater() {
        return water;
    }
                            // os Getters expoêm estado sem permitir alteração

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null; //deixa o código mais legivel, evita repetir pet != null
    }

    public void setPet(Pet pet) {
        if (!clean){ // validação de limpeza
            System.out.println("A máquina está suja, limpe para colocar o pet");
            return;
        }
        if (hasPet()){ // validação de pet existente.
            System.out.println("O pet" + this.pet.getName() + "está na máquina nesse momento");
            return;
        }
        this.pet = pet; // colocando o pet (a maquina agora "contém um pet")
    }

    public void removePet(){ //remove o pet da máquina e atualiza o estado da máquina.
        if (pet == null){
            System.out.println("Não há pet na máquina");
            return;
        }
        // se o pet saiu limpo, maquina fica limpa.
        clean = pet.isClean();
        System.out.println("O pet" + pet.getName() + "está limpo");
        this.pet = null; // fazer correção.
    }

    public void wash(){ // limpa a maquina, consumir recursos e permite novo pet.
        this.water -= 3;
        this.shampoo -= 1;
        clean =  true;
        System.out.println("A máquina está limpa");
    }

    }
