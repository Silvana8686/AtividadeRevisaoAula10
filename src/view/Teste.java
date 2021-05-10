                                                                                                                                    
package view;

import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        
         String opcao = "s";
        

        List<PessoaFisica> listaPessoa = new ArrayList<>();
        List<PessoaJuridica> listaP = new ArrayList<>();
        
       
 
        while( ! opcao.equalsIgnoreCase( "n" )){
            String texto = "Digite sua opção: \n" + 
                    "1 - Cadastrar Pessoa Fisica \n" + 
                    "2 - Excluir Pessoa Fisica \n" + 
                    "3 - Listar de Pessoas Cadatradas \n" + 
                    "4- Cadastrar Pessoa Juridica \n"+
                    "5 - Ecluir Pessoa Juridica \n" +
                    "6 - Lista de Pessoas Juridicas \n" +
                    "n - Sair ";
            opcao =  JOptionPane.showInputDialog(texto);

            switch( opcao ){
                case "1":
                    PessoaFisica p = new PessoaFisica();
                   
                    String id = JOptionPane.showInputDialog("Id  Pessoa Fisica");
                    id = id.replace(",", ".");
                    p.setId(Integer.valueOf( id ) );
                
                    String nome = JOptionPane.showInputDialog("Nome Pessoa Fisica");
                    p.setNome(nome);
                    
                     String cpf = JOptionPane.showInputDialog("CPF  Pessoa Fisica");
                     p.setCpf(cpf);
                    
                    
                    String endereco = JOptionPane.showInputDialog("Endereco Pessoa Fisica");
                    p.setEndereco(endereco);
                    
                    String telefone = JOptionPane.showInputDialog("Telefone  Pessoa Fisica  ");
                    p.setTelefone(telefone);
                    
                    
                    listaPessoa.add( p );
                    break;
                    
                case "2":
                    int posicao = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    listaPessoa.remove(posicao -1 );
                    break;
                    
                    
                case "3":
                    
                   String conteudo = "";
                  for (PessoaFisica pessoafisica : listaPessoa) {
                       conteudo += pessoafisica.Imprimir()+ "\n";
                       
                       }
                   
                  JOptionPane.showMessageDialog(null, conteudo);
                     
                    break;
                    
                case "4":
                
                    PessoaJuridica PJ = new PessoaJuridica();
                   
                    String idd = JOptionPane.showInputDialog("Id  Pessoa Juridica");
                    idd = idd.replace(",", ".");
                    PJ.setId(Integer.valueOf( idd ) );
                
                    String nomee = JOptionPane.showInputDialog("Nome  Pessoa Juridica");
                    PJ.setNome(nomee);
                    
                   String cnpj = JOptionPane.showInputDialog("CNPJ  Pessoa juridca");
                   PJ.setCnpj(cnpj);
                   
                    String enderecoo = JOptionPane.showInputDialog("Endereco  Pessoa juridica");
                    PJ.setEndereco(enderecoo);
                    
                    String telefonee = JOptionPane.showInputDialog("Telefone  Pessoa juridica");
                    PJ.setTelefone(telefonee);
                    
                    listaP.add( PJ );
                    
                    break;  
                   
                    case "5":
                    int pos = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaP.remove(pos -1 );
                    break;
                    
                     case "6":
                         
                    String cont = "";
                    for (PessoaJuridica pj : listaP) {
                        cont += pj.Imprimir()+ "\n";
                    }
                   JOptionPane.showMessageDialog(null, cont);
                  
                    break;
                    
                case "n":
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");

            }
        }
   
    
    }
    
}
                                 

