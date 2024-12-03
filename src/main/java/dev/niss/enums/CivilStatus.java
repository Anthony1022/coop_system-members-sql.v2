package dev.niss.enums;

public enum CivilStatus {
    SINGEL(0),
    MARRIED(1),
    WIDOW(2);

    private int code;

    private CivilStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static CivilStatus fromCode(int code) {
        return switch (code) {
            case 0 -> CivilStatus.SINGEL;
            case 1 -> CivilStatus.MARRIED;
            case 2 -> CivilStatus.WIDOW;
            default -> null;
        };
    }
}
