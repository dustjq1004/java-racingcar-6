package racingcar;

import racingcar.validation.Validation;

public class RacingCar {

    private String name;
    private int position;

    public RacingCar(String name) {
        this.name = name;
        this.position = 0;
    }

    public boolean moveBy(int random) {
        if (Validation.isNumberInRange(random) && random > 4) {
            position++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "name : " + name;
    }
}