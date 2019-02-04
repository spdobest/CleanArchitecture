package spinc.spcleanarchitecture.rest.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

@Parcel
public class Coord
{
    @SerializedName("lon")
    private Double longitude;

    @SerializedName("lat")
    private Double latitude;

    public Double getLongitude()
    {
        return longitude;
    }

    public Double getLatitude()
    {
        return latitude;
    }
}