import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

 @Override
        public void paint(Graphics g) {
            super.paint(g); //clear

            g.setColor(Color.BLACK);

            int startX = 10;
            int startY = 10;
            int cellSize = 35;
            int cells = 20;

            //vertical
            for (int i = 0; i <= cells; i++) {
                int x = startX + i * cellSize;
                g.drawLine(x, startY, x, startY + cells * cellSize);
            }

            //horizontal
            for (int i = 0; i <= cells; i++) {
                int y = startY + i * cellSize;
                g.drawLine(startX, y, startX + cells * cellSize, y);
            }
        }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
