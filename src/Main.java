import Empresa.Funcionario;
import Empresa.Gerente;

public class Main {
    public static void main(String[] args)
    {
        Livro livro = new Livro("Olá mundo!", "Programador", 1990);
        System.out.println(livro.informacoesLivro());

        Livro livro2 = new Livro();
        livro2.setTitulo("Tchau mundo!");
        livro2.setAutor("IA");
        livro2.setAnoPublicacao(2137);
        System.out.println(livro2.informacoesLivro());

        Funcionario funcionario = new Funcionario("Primeiro", 1500.00);
        System.out.println("\nNome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        funcionario.aumentarSalario(250.00);
        System.out.println("Salario + Aumento: " + funcionario.getSalario());

        Funcionario funcionario1 = new Gerente("Segundo", 1500.00, "Recepção");
        System.out.println("\nNome: " + funcionario1.getNome());
        System.out.println("Salario: " + funcionario1.getSalario());
        funcionario1.aumentarSalario(100.00);
        System.out.println("Salario + Aumento: " + funcionario1.getSalario());
    }
}