package CoreHW7;

import java.io.IOException;

public interface WeatherModel {
    void getWeather(String selectedCity, Variant period) throws IOException;

    void getSavedWeather();
}
