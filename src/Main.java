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
      private Grid grid;
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
        grid = new Grid(720, 720, 20, 20, 30, 10, 10);
        grid.initialiseCells();
      }

 @Override
        public void paint(Graphics g) {
            super.paint(g);
            grid.paint(g);
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
            try {
                Thread.sleep(16); 
            } catch (InterruptedException e) {
                e.printStackTrace();
      }
    }
}
}