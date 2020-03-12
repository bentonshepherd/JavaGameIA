public class Board {

    int size = 8;
    String[][] grid = new String[size][size];


    //constructor initializes the whole
    // grid with 0's when created
    public Board() {

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                grid[row][col] = "0";

            }
        }

    }

    public void printBoard() {
        System.out.println("Updated board:");
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                System.out.print(grid[row][col] + " ");

            }
            System.out.print("\n");
        }


    }

    //************ ALGORITHM #2 ***************
    //makes a move on the board - changes a position to "token value"
    public void makeMove(int row, int col, String token) {

        grid[row][col] = token;  // for Connect-4 you will need to determine the row value
        // based on the existing values in the grid (where does the token "drop" to)
    }


    //************ ALGORITHM #3 ***************
    // return true if there are 4 in a row anywhere on the board
    // for now, any move at 0,0 ends game
    public boolean checkWin() {
        for (int i = 7; i >= 0; i--) {
            if (grid[i][col].equals("_")) {
                grid[i][col] = token;
                return true;
            }
        }
        return false;
    }



}