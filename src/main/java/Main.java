//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Main implements MainInterface {
    String[][] sign = new String[20][20];
    String PlayerX = "X";
    String PlayerO = "O";
    String EMPTY = " ";
    int count;
    int randCol;
    int randRow;

    public void init() {
        for(int i = 0; i < this.sign.length; ++i) {
            for(int j = 0; j < this.sign.length; ++j) {
                this.sign[i][j] = this.EMPTY;
            }
        }

    }

    public Main() {
        this.init();
    }

    public boolean markFirstPlayer(String figure, int col, int row) {
        return this.sign[col][row].equals(figure);
    }

    public boolean markSecondPlayer(String figure, int col, int row) {
        return this.sign[col][row].equals(figure);
    }

    public boolean RandomCell(String figure) {
        return this.sign[this.randCol][this.randRow].equals(figure);
    }

    public int WinCell(String figure) {
        return this.count;
    }

    public int ThreeCell(String figure) {
        return this.count;
    }

    public int TwoCell(String figure) {
        return this.count;
    }
}
