
package Model;

import javax.swing.JOptionPane;

public class PessoaFisica extends Cliente{
   
    public String cpf;
    
   
   public PessoaFisica(){
    
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
     
 public PessoaFisica(int id,String nome,String endereco, String telefone,String cpf) {
        
  super(id,nome,endereco,telefone);
  this.id = id; 
  this.nome = nome;
  this.endereco= endereco;
  this.telefone = telefone;
  this.cpf= cpf;
  
    }
  
    @Override
    public String Imprimir() {
       return "{'id': '" + id + " 'nome': '" + nome + "' , 'Endereco': " +endereco + " , 'Telefone': " + this.getTelefone()+ "'CPF': " +cpf + " }";
    }

    @Override
    public void Cadastrar(){
        
    }
    
    @Override
    public void Excluir(){      
    
    }

}
