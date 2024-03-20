package empresa;

public class TesteEmpregado {
    public static void main(String[] args) {
        Emprego joao = new Emprego();

        joao.salario = 5400.00;
        joao.cargo = "Analista de Sistema";
        joao.nome = "João";

        System.out.println("""
                Nome: %s
                Cargo: %s
                Salário: %.2f""".formatted(joao.nome, joao.cargo, joao.salario));
        joao.reajustarSalario(15.0);
        System.out.println("Salário com reajuste: %.2f".formatted(joao.salario));
    }
}
