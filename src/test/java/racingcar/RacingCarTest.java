package racingcar;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    @Test
    @DisplayName("생성된 자동차의 기본 포지션은 0 이어야 한다.")
    void initCarPositionIs1() {
        Car car = new Car("g80");
        assertThat(car.getCarPosition()).isEqualTo(0);
    }

    @ParameterizedTest
    @DisplayName("4 이상인 경우 자동차는 전진한다.")
    @CsvSource(value = {"5,1", "9, 1"}, delimiter = ',')
    void racingCarMoveForward(int value, int expected) {
        Car car = new Car("g80");
        car.tryMove(value);
        assertThat(car.getCarPosition()).isEqualTo(expected);
    }

}
