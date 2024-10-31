package lotto;

public enum ErrorMessage {

    MONEY_IS_NOT_NUMBER("[ERROR] 돈은 숫자만 가능합니다."),
    MONEY_IS_NOT_DIVIDE_PRICE("[ERROR] 천원 단위로만 입력하세요."),
    LOTTO_IS_NOT_FIT_SIZE("[ERROR] 로또 번호는 6개여야 합니다.");

    private String msg;

    ErrorMessage(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}