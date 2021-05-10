
package Model;

import javax.swing.JOptionPane;


public class PessoaJuridica extends Cliente {
    
    public String cnpj;
    
    public PessoaJuridica(){
       
    }  
    
   public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public PessoaJuridica(int id,String nome,String endereco, String telefone,String cnpj ) {
    super(id,nome,endereco,telefone);
    this.id = id; 
    this.telefone=telefone;
    this.nome = nome;
    this.endereco= endereco;
    this.cnpj= cnpj;
    }

    @Override
    public String Imprimir() {
       return "{'id': '" + id + " 'nome': '" + nome + "' , 'Endereco': " +endereco + " , 'Telefone': " + this.getTelefone()+ "'CNPJ': " +cnpj + " }";
    }

    @Override
    public void Cadastrar(){
    
    }
    
    @Override
    public void Excluir(){
       
      }

   
}
    

