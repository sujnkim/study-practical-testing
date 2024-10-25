package sample.cafekiosk.unit.beverages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {

    @Test
    public void getName() {
        // given
        // when
        Americano americano = new Americano();

        // then
        //assertEquals(americano.getName(), "아메리카노"); //Junit
        assertThat(americano.getName()).isEqualTo("아메리카노"); //AssertJ
    }

    @Test
    public void getPrice() {
        // given
        // when
        Americano americano = new Americano();

        // then
        assertThat(americano.getPrice()).isEqualTo(4000);
    }

}