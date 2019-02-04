package spinc.spcleanarchitecture.rest.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

@Parcel
public class Weather
{
    @SerializedName("description")
    private String strDesc;

    @SerializedName("icon")
    private String strIconName;

    public String getStrDesc()
    {
        return strDesc;
    }

    public void setStrDesc(String strDesc)
    {
        this.strDesc = strDesc;
    }

    public String getStrIconName()
    {
        return strIconName;
    }

    public void setStrIconName(String strIconName)
    {
        this.strIconName = strIconName;
    }
}