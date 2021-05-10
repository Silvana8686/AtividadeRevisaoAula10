
package Model;

public abstract class Cliente {
public  String nome,endereco;
String telefone;
public int id;
  
  public Cliente(){
   
  }
  
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
  public Cliente(int id, String nome,String endereco, String telefone){
      
  this.id = id; 
  this.nome = nome;
  this.endereco= endereco;
  this.telefone = telefone; 
  
}

  public abstract void Cadastrar ();
  
  public abstract void Excluir ();
  
 
  public String Imprimir(){
        return "{'id': '" + id + " 'nome': '" + nome + "' , 'Endereco': " +endereco + " , 'Telefone': " + this.getTelefone()+" }";
    }
            
}
