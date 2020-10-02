import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NullLayout extends JFrame {
    JButton acMilan = new JButton("AC Milan");
    JButton realMadrid = new JButton("Real Madrid");
    Counter counter = new Counter();
    JButton result = new JButton(counter.getCount());
    JButton lastScorer = new JButton("Last Scorer");
    JButton winner = new JButton("Winner: DRAW");


    public NullLayout() {
        setLayout(null);
        acMilan.setBounds(0, 00, 400, 100);
        acMilan.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter.acMilanPoints++;
                        result.setText(counter.getCount());
                        lastScorer.setText("AC Milan");
                        counter.getWinner();
                        winner.setText(counter.getWinner());


                    }
                }
        );
        realMadrid.setBounds(0, 100, 400, 100);
        realMadrid.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter.realMadridPoints++;
                        result.setText(counter.getCount());
                        lastScorer.setText("Real Madrid");
                        winner.setText(counter.getWinner());
                    }
                }
        );
        result.setBounds(0, 200, 400, 100);
        lastScorer.setBounds(0, 300, 400, 100);
        winner.setBounds(0, 400, 400, 100);

// those two steps can be combined in one setBounds method call
        add(acMilan);
        add(realMadrid);
        add(result);
        add(lastScorer);
        add(winner);
        setSize(500, 600);
    }

    public static void main(String[] args) {
        new NullLayout().setVisible(true);
    }
}