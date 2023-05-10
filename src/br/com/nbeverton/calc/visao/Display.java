package br.com.nbeverton.calc.visao;

import br.com.nbeverton.calc.modelo.Memoria;
import br.com.nbeverton.calc.modelo.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);

         label = new JLabel(Memoria.getInstancia().getTextoAtual());

         setBackground(new Color(46, 49, 50));
         label.setForeground(Color.WHITE);
         label.setFont(new Font("courier", Font.PLAIN, 30));

         setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

         add(label);
    }

    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }

}
