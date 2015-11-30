/**
 * Created by Phil on 11/16/2015.
 */
public class mosaics1 {

    static int currentRow;
    static int currentCol;

    public static void main(String[] args) {

        Mosaic.open(91,91,10,10);
        fillRandomColorRects();
        currentRow = 4;
        currentCol = 5;
        while (Mosaic.isOpen()) {
            changeToRandomColor(currentRow, currentCol);
            randMove();
            Mosaic.delay(1);
        }


    }


    static void fillRandomColorRects() {
        int row;
        int col;
        for (row = 0; row < 91; row++){
            for (col = 0; col < 91; col++){
                changeToRandomColor(row,col);
            }

        }
    }

    static void changeToRandomColor(int row, int col) {
        int red = (int)(Math.random()*256);
        int blue = (int)(Math.random()*135);
        int green = (int)(Math.random()*135);
        Mosaic.setColor(row,col,red,green,blue);
    }

    static void randMove() {
        int mover;
        mover = (int)(Math.random()*4);
        switch (mover) {
            case 0:
                currentRow--;
                if (currentRow < 0)
                    currentRow = 90;
                break;
            case 1:
                currentCol--;
                if (currentCol < 0)
                    currentCol = 90;
                break;
            case 2:
                currentRow++;
                if (currentRow >= 91)
                    currentRow = 0;
                break;
            case 3:
                currentCol++;
                if (currentCol >= 91)
                    currentCol = 0;
                break;
        }

    }
}
