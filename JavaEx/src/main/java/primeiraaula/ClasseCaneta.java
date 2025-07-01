package primeiraaula;

public class ClasseCaneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // método (função) sem retorno
    void rabiscar(){

        if(this.tampada==true){
            System.out.println("Erro!! A caneta está tampada!");
        } else {
            System.out.println("Estou rabiscando");
        }
        }
        void desenhar(){
            if(this.tampada==true){
            System.out.println("Não dá pra desenhar, pois eu estou tampada!");
        } else {
            System.out.println("Estou desenhando");
        }
        }

    void pintar() {
        if (this.tampada == true) {
            System.out.println("Não dá pintar,help Leon! estou tampada!");
        } else {
            System.out.println("Estou pintando e fazendo obras de arte >:)");
        }
    }

        void tampar(){
            this.tampada = true;

    }

        void destampar(){
            this.tampada = false;
        }

        void estado_atual(){
            System.out.println("Esta caneta é do modelo: " + this.modelo);
            System.out.println("Esta caneta tem a cor: " + this.cor);
            System.out.println("Esta caneta tem a ponta: " + this.ponta);
            System.out.println("Esta caneta esta com carga em: " + this.carga + "%");
            System.out.println("Esta caneta está tampada? " + this.tampada);

        }

}

