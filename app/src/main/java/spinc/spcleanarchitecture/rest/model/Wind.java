package spinc.spcleanarchitecture.rest.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

@Parcel
public class Wind
{
    @SerializedName("speed")
    private Double speed;

    public Double getSpeed()
    {
        return speed;
    }
}