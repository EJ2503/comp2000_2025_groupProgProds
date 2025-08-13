import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid {
    int canvasWidth;
    int canvasHeight;
    int rows;
    int cols;
    int cellSize;
    int offsetX;
    int offsetY;
    Cell[][] cells;

    public Grid(int canvasHeight, int canvasWidth, int rows, int cols, int cellSize, int offsetX, int offsetY) {
        this.canvasHeight = canvasHeight;
        this.canvasWidth = canvasWidth;
        this.rows = rows;
        this.cols = cols;
        this.cellSize = cellSize;
        this.offsetX = offsetX;
        this.offsetY = offsetY;

        cells = new Cell[rows][cols];
    }


    public void initialiseCells() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Calculate x and y pixel position for each cell
                int x = offsetX + col * cellSize;
                int y = offsetY + row * cellSize;
                cells[row][col] = new Cell(row, col, x, y, cellSize);
            }
        }
    }


    // public void initialiseCells () {
    //     for(int i=0;i<maxCellNumbX();i++) {
    //         for(int j=0;j<maxCellNumbY();j++) {
    //             cells[i][j] = new Cell(i, j, this.offsetX, this.offsetY, this.cellSize);
    //         }
    //     }
    // }

  //   for (int i = 0; i <= cells; i++) {
   //             int x = startX + i * cellSize;
    //            g.drawLine(x, startY, x, startY + cells * cellSize);
    //        }

    // public int maxCellNumbX() {
    //     return ((this.canvasWidth - 2*offsetX)/rows);
    // }

    // public int maxCellNumbY() {
    //     return ((this.canvasHeight - 2*offsetY)/cols);
    // }

    public void paint(Graphics g) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col].paint(g);
            }
        }
    }

    public Cell getCell(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return cells[row][col];
        }
        return null;
    }

    //size
    //position
    //number of cells
    //cell size - maybe determined by how many you want only
    //set cell color
    //get cell

    //grid houses cell objects
    
    
    
    //run an array that can find specific cells/cells are marked
}
