public class Turma{

      private String nome;
      private String curso;
      private int quantidadeAlunos;
      private int serie;
      
      public Turma(String n, String c, int q, int s){
         nome = n;
         curso = c;
         quantidadeAlunos = q;
         serie = s;
      }
      
      
      public String getNome(){
         return nome;
      }
       public String getCurso(){
         return curso;
      }
       public int getQuantidadeAlunos(){
         return quantidadeAlunos;
      }
       public int getSerie(){
         return serie;
      }
      public void setNome(String n){
         nome = n;
      }
      public void setCurso(String c){
         curso = c;
      }
      public void setQuantidadeAlunos(int q){
         quantidadeAlunos = q;
      }
      public void setSerie(int s){
         serie = s;
      }
   }   