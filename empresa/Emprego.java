package empresa;

public class Emprego {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Double reajuste){
        salario -= (salario * reajuste/100);
    }

}
