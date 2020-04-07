import javax.swing.JOptionPane;
public class TesteTurma
{
   public static void main (String [] args)
   {
      // coletando dados
      
      String nome = JOptionPane.showInputDialog("Digite o Nome: ");
      String curso = JOptionPane.showInputDialog("Informe o Curso: ");
      int quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: " ));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Série do aluno: " ));
      
      //objeto 
      Turma turma = new Turma(nome, curso, quantidadeAlunos, serie);
      
      // String de saida
      
      String resultado = " Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQuantidadeAlunos() + "\nSerie: " + turma.getSerie();
      
      // Mostra aluno
      
      JOptionPane.showMessageDialog(null, resultado);
      
      // Altere informações 
      quantidadeAlunos = Integer.parseInt( JOptionPane.showInputDialog ("Quantidade de alunos: " ));
      
      // muda usando os metodo modificadores
      
      turma.setQuantidadeAlunos(quantidadeAlunos);
      
      // mostra novamente o cadastro do aluno
      // monta a String de saida chamando os metodos de acesso do aluno
      resultado =  " Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade: " + turma.getQuantidadeAlunos() + "\nSerie: " + turma.getSerie();
      
      
      // Mostra aluno
      
      JOptionPane.showMessageDialog(null, resultado);
   }
   
}