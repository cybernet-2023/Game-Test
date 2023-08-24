import javax.swing.*;

public class Main {
  public static void main(String[] args)
  {
    JFrame win = new JFrame("Game Test");
    JButton btn = new JButton("Play");

    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    win.getContentPane().add(btn);
    win.setSize(800, 600);
    win.setVisible(true);
  }
}
