package spinc.spcleanarchitecture.rest.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

import java.util.ArrayList;


@Parcel
public class ApiResponse
{
    @SerializedName("coord")
    private Coord coord;

    @SerializedName("sys")
    private Sys sys;

    @SerializedName("weather")
    private ArrayList<Weather> weather;

    @SerializedName("main")
    private MainInfos mainInfos;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("name")
    private String strCityName;

    public Coord getCoord()
    {
        return coord;
    }

    public Sys getSys()
    {
        return sys;
    }

    public ArrayList<Weather> getWeather()
    {
        return weather;
    }

    public MainInfos getMainInfos()
    {
        return mainInfos;
    }

    public Wind getWind()
    {
        return wind;
    }

    public String getStrCityName()
    {
        return strCityName;
    }
}