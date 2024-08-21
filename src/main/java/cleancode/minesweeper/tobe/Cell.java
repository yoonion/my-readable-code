package cleancode.minesweeper.tobe;

public class Cell {

    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String CLOSED_CELL_SIGN = "□";
    private static final String OPENED_CELL_SIGN = "■";

    private final String sign;

    private Cell(String sign) {
        this.sign = sign;
    }

    // 정적 팩토리 메서드
    public static Cell of(String sign) {
        return new Cell(sign);
    }

    // 정적 팩토리 메서드
    public static Cell ofFlag() {
        return of(FLAG_SIGN);
    }

    // 정적 팩토리 메서드
    public static Cell ofLandMine() {
        return of(LAND_MINE_SIGN);
    }

    // 정적 팩토리 메서드
    public static Cell ofClosed() {
        return of(CLOSED_CELL_SIGN);
    }

    // 정적 팩토리 메서드
    public static Cell ofOpened() {
        return of(OPENED_CELL_SIGN);
    }

    // 정적 팩토리 메서드
    public static Cell ofNearbyLandMineCount(int count) {
        return of(String.valueOf(count));
    }

    public String getSign() {
        return sign;
    }

    public boolean isClosed() {
        return CLOSED_CELL_SIGN.equals(this.sign);
    }

    public boolean doesNotClosed() {
        return !isClosed();
    }
}
