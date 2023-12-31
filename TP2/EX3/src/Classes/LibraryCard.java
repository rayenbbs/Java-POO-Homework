package Classes;
//build a 'LibraryCard' class that should be composed within both 'Student' and 'Teacher'
//classes.

public class LibraryCard {
private int cardId;
    private int borrowCount;

    public LibraryCard(int cardId) {
        this.cardId = cardId;
        this.borrowCount = 0;
    }

    public int getCardId() {
        return cardId;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public void incrementBorrowCount() {
        this.borrowCount++;
    }

}
