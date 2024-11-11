public class Node {
    private boolean visited;
    private boolean aboveBlocked = false;
    private boolean belowBlocked = false;
    private boolean leftBlocked = false;
    private boolean rightBlocked = false;
    private char symbol;

    public Node() {
        this.symbol = 'X';
        this.visited = false;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isAboveBlocked() {
        return aboveBlocked;
    }

    public void setAboveBlocked(boolean aboveBlocked) {
        this.aboveBlocked = aboveBlocked;
    }

    public boolean isBelowBlocked() {
        return belowBlocked;
    }

    public void setBelowBlocked(boolean belowBlocked) {
        this.belowBlocked = belowBlocked;
    }

    public boolean isLeftBlocked() {
        return leftBlocked;
    }

    public void setLeftBlocked(boolean leftBlocked) {
        this.leftBlocked = leftBlocked;
    }

    public boolean isRightBlocked() {
        return rightBlocked;
    }

    public void setRightBlocked(boolean rightBlocked) {
        this.rightBlocked = rightBlocked;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
