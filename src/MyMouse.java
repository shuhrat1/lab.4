import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMouse extends JFrame
{
    JLabel lbl = new JLabel("");
    JLabel lbl2 = new JLabel("");
    public MyMouse()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400); //размер
        GridLayout gridLayout = new GridLayout(5, 2); //строки колонки
        setLayout(gridLayout);
        lbl.setHorizontalAlignment(SwingConstants.CENTER); //положение
        add(lbl);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {
                lbl.setText("X="+a.getX()+" Y="+a.getY());
                lbl2.setText("X="+a.getX()+" Y="+a.getY());
            } //вывод
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}