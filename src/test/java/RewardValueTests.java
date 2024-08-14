import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        String cashValue = "100.00";
        double cashValue2 = 100;
        double rewardValue = RewardValue.getMilesValue(cashValue2);
        assertEquals(cashValue, RewardValue.getCashValue(rewardValue));
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        String rewardValue = RewardValue.getCashValue(milesValue);
        double rewardValue2 = Double.parseDouble(rewardValue);
        assertEquals(milesValue, RewardValue.getMilesValue(rewardValue2));
    }

    @Test
    void convert_from_cash_to_miles() {
        String cashValue = "50.00";
        double cashValue2 = 50;
        double rewardValue = RewardValue.getMilesValue(cashValue2);
        assertEquals(cashValue, RewardValue.getCashValue(rewardValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 50000;
        String rewardValue = RewardValue.getCashValue(milesValue);
        double rewardValue2 = Double.parseDouble(rewardValue);
        assertEquals(milesValue, RewardValue.getMilesValue(rewardValue2));
    }
}
