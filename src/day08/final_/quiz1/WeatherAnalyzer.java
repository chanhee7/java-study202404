package day08.final_.quiz1;

import static day08.final_.quiz1.WeatherConstants.*;

public class WeatherAnalyzer {

    public static boolean checkTemperatureAlert(double temperature) {
        return (temperature > MAX_TEMPERATURE_ALERT.getNumericData()
                || temperature < MIN_TEMPERATURE_ALERT.getNumericData());
    }

    public static boolean checkPrecipitationAlert(double precipitation) {
        return (precipitation > PRECIPITATION_ALERT.getNumericData());
    }
}