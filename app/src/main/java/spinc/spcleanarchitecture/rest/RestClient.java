package spinc.spcleanarchitecture.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import spinc.spcleanarchitecture.rest.service.WeatherService;

/**
 * https://github.com/traex/RetrofitExample
 */
public class RestClient
{
    private static final String BASE_URL = "http://api.openweathermap.org/";
    private WeatherService apiService;

    public RestClient()
    {
        Gson gson = new GsonBuilder()
            .registerTypeAdapterFactory(new ItemTypeAdapterFactory())
            .create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_URL)
                .setConverter(new GsonConverter(gson))
                .build();

        apiService = restAdapter.create(WeatherService.class);
    }

    public WeatherService getWeatherService()
    {
        return apiService;
    }
}