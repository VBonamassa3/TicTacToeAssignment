public class LinkedList {

    private Node head;  // Head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(String data) {
        // To be implemented
    }

    // Method to update a specific position in the list
    public void updatePosition(int position, String data) {
        // To be implemented
    }

    // Method to get the value at a specific position
    public String getPositionValue(int position) {
        // To be implemented
        return "";
    }

    // Method to display the Tic Tac Toe board
    public void displayBoard() {
        String content = "";
        for(int i= 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                content += board[i][j]+ "\t";
            }
            content+="\n";
        }
        System.out.println(content);
    }

    // Method to check for a win
    public boolean checkWinCondition() {
        if (Node0.getValue().equals(Node1.getValue()) && Node0.getValue().equals(Node2.getValue())){
            return true;
        }
        return false;
    }

    // Method to check if the board is full (for draw condition)
    public boolean isBoardFull() {
        // To be implemented
        return false;
    }

    // Method to reset the board
    public void resetBoard() {
        // To be implemented
    }
}