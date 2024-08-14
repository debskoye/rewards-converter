import java.text.DecimalFormat;

public class RewardValue
{
    static String getCashValue(double miles)
    {
        double cash1=miles*0.0035;
        DecimalFormat df = new DecimalFormat("#.00");
        String cash = df.format(cash1);
        return cash;
    }

    static double getMilesValue(double cash)
    {
        double miles=cash/0.0035;
        return miles;
    }
}

