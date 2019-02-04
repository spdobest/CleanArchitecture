package spinc.spcleanarchitecture.rest.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

@Parcel
public class MainInfos
{
    @SerializedName("temp")
    private Double temp;

    @SerializedName("pressure")
    private Double pressure;

    @SerializedName("humidity")
    private Double humidity;

    @SerializedName("temp_min")
    private Double tempMin;

    @SerializedName("temp_max")
    private Double tempMax;

    public Double getTemp()
    {
        return temp;
    }

    public Double getPressure()
    {
        return pressure;
    }

    public Double getHumidity()
    {
        return humidity;
    }

    public Double getTempMin()
    {
        return tempMin;
    }

    public Double getTempMax()
    {
        return tempMax;
    }
}