package com.currency.dollar;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author abhar
 * @date 22/03/2019
 */
public class DollarTest {

    @Test
    public void should_compare_money_to_string_representation() {
        assertThat("USD 2,00").isEqualTo(new Dollar(2).toString());
        assertThat("USD 7,50").isEqualTo(new Dollar(7.50).toString());
    }

    @Test
    public void should_test_equality_dollar_object() {
        Dollar sevenFifty = new Dollar(7.50);
        Dollar sevenFiftyToo = new Dollar(7.50);
        assertThat(sevenFifty).isEqualTo(sevenFiftyToo);
    }

    @Test
    public void should_test_inequality_dollar_object() {
        Dollar sevenDollars = new Dollar(7);
        Dollar threeDollars = new Dollar(3);
        assertThat(sevenDollars).isNotEqualTo(threeDollars);
    }


    @Test
    public void should_test_money_subtraction() {
        assertThat(new Dollar(1)).isEqualTo(new Dollar(3).minus(new Dollar(2)));
        assertThat(new Dollar(2)).isEqualTo(new Dollar(5).minus(new Dollar(3)));
    }


    @Test
    public void should_test_numeric_safety() {
        assertThat(new Dollar(0.61)).isEqualTo(new Dollar(1.03).minus(new Dollar(0.42)));
    }
}
