package clima.api;

import java.util.List;
import java.util.Map;

public interface AccuWeatherAPI {
    Map<String, Object> getWeather(String location);
}
