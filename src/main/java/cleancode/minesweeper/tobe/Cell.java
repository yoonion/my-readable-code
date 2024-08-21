package cleancode.minesweeper.tobe;

public class Cell {

    private final String sign;

    private Cell(String sign) {
        this.sign = sign;
    }

    // 정적 팩토리 메서드
    public static Cell of(String sign) {
        return new Cell(sign);
    }

    public boolean equalsSign(String sign) {
        return this.sign.equals(sign);
    }

    public boolean doesNotEqualSign(String sign) {
        return !equalsSign(sign);
    }

    public String getSign() {
        return sign;
    }
}
