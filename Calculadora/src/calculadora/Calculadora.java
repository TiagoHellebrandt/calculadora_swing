package calculadora;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class Calculadora extends JFrame {
    
    private final TextField txt = new TextField(); // Campo de texto
    private final String[] names = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "+", "c", "0", "=", "-"}; // Nomes dos botões
    private final ArrayList<JButton> btns = new ArrayList(); // Botões
    
    public Calculadora () {
        this.setLayout(new GridLayout(5, 1)); // Define o layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação de fechar
        this.setSize(400, 600); // Define o tamanho da janela
        this.setVisible(true); // Define que a janela aparecerá
        // ADDs
        this.add(txt); // Adiciona o campo de texto na janela
        this.configTeclado(); // Adiciona os botões do teclado
    }
    
    public void configTeclado() {
        for (String name : names) {
            JButton btn = new JButton(name); // Cria o botão
            btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if ("=".equals(btn.getText()) || "c".equals(btn.getText())) {
                        if ("=".equals(btn.getText())) {
                            txt.setText("Imagine aqui a resposta!");
                        } else {
                            txt.setText("");
                        }
                    } else {
                        txt.setText(txt.getText()+btn.getText());
                    }
                }
            });
            btns.add(btn); // Cria os botões do teclado
        }
        for (int i=0,x=0;i<4;i++) {
            JPanel pn = new JPanel(); // Cria um painel para cada linha
            pn.setLayout(new GridLayout(1, 4)); // Define o layout do painel da linha
            for (int j=0;j<4;j++) {
                pn.add(btns.get(x)); // adiciona os botões aos seus paineis de linha
                x++;
            }
            this.add(pn); // Adiciona cada painel de linha na janela
        }
    }
    
    public static boolean isNumber(String x) {
        if (!"+".equals(x) || !"-".equals(x) || !"*".equals(x) || !"/".equals(x)) {
            return true;
        } else {
            return false;
        }
    }
    
    public double calc(String input) {
        double res = 0;
        // CALCULA
        return res;
    }
}
