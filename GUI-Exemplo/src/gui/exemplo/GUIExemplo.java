package gui.exemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIExemplo {

    public static void main(String[] args) {
        /*
        Tela1 tela = new Tela1();
        tela.setVisible(true);
         */

        JFrame tela = new JFrame();

        JPanel painel = new JPanel();
        JLabel texto = new JLabel("Digite o seu nome: ");
        JTextField input = new JTextField(10);
        JButton botao = new JButton("Entrar");

        // Adicionando um ouvinte de ação ao botão
        botao.addActionListener(
                new ActionListener() {
            @Override
            // Quando o botão é clicado, é executado este código
            public void actionPerformed(ActionEvent e) {
                String nome = input.getText();

                if (nome.equalsIgnoreCase("Lucas")) {
                    JOptionPane.showMessageDialog(null, "Olá, tutor " + nome + ".", "Boas-vindas!", 1);
                } else if (nome.isBlank() || nome.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nome inválido!", "Erro!", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Olá, aluno " + nome + ".", "Boas-vindas!", 1);
                }
            }
        }
        
        );
        
        
        painel.add(texto);
        painel.add(input);
        painel.add(botao);
        tela.add(painel);

        tela.setVisible(true);
        tela.setSize(800, 600);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();

        /* USO DO JOPTIONPANE */
 /* Opções do JOptionPane
            showConfirmDialog = apresentar uma pergunta de confirmação com sim/não/cancelar
            showInputDialog = janela com entrada de dados (input)
            showMessageDialog = janela com mensagem para o usuário
            showOptionDialog = janela customizavel a nosso gosto utilizando os recursos das 3 opções acima
        
        
        //JOptionPane.showConfirmDialog(null, "Mensagem de confirmação");
        //JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Tela de confirmação", 0, 0);
        //JOptionPane.showInputDialog("Essa uma mensagem. Por favor, preencha o campo abaixo: ");
        //JOptionPane.showMessageDialog(null, "Essa é uma mensagem de diálogo.");
        //JOptionPane.showOptionDialog(parentComponent, args, title, 0, 0, icon, args, args);
        
        int resposta = 0;
        // Resposta 0 = SIM , Resposta 1  = NÃO
        do {
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");

            if (nome.equalsIgnoreCase("Lucas")) {
                JOptionPane.showMessageDialog(null, "Olá, tutor " + nome + ".", "Boas-vindas!", 1);
            } else if (nome.isBlank() || nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome inválido!", "Erro!", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Olá, aluno " + nome + ".", "Boas-vindas!", 1);
            }
            resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        } while (resposta == 0);
         */
    }

}
