import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    int row;
    int col;
    int x; 
    int y; 
    int size;
    Color color;

    public Cell(int row, int col, int x, int y, int size) {
        this.row = row;
        this.col = col;
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = Color.WHITE;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

    public void setColor(Color c) {
        this.color = c;
    }
}
