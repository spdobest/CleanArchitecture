package spinc.spcleanarchitecture.rest.service;


import android.support.v7.util.SortedList;
import retrofit2.http.GET;
import retrofit2.http.Query;
import spinc.spcleanarchitecture.rest.model.ApiResponse;

public interface WeatherService
{
    @GET("/data/2.5/weather")
    public void getWeather(@Query("q") String strCity, SortedList.Callback<ApiResponse> callback);

}


