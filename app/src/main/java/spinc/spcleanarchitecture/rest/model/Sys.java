package spinc.spcleanarchitecture.rest.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

@Parcel
public class Sys
{
    @SerializedName("country")
    private String strCountry;

    @SerializedName("sunrise")
    private Long sunriseTime;

    @SerializedName("sunset")
    private Long sunsetTime;

    public String getStrCountry()
    {
        return strCountry;
    }

    public void setStrCountry(String strCountry)
    {
        this.strCountry = strCountry;
    }

    public Long getSunriseTime()
    {
        return sunriseTime;
    }

    public Long getSunsetTime()
    {
        return sunsetTime;
    }
}