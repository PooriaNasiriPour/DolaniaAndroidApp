package egs.dolania.models.hotel;

/**
 * Created by hosein on 6/7/16.
 */
public class HotelAllMain {
    private hotelMain data;
    private String error;
    private egs.dolania.models.meta meta;

    public hotelMain getData() {
        return data;
    }

    public void setData(hotelMain data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public egs.dolania.models.meta getMeta() {
        return meta;
    }

    public void setMeta(egs.dolania.models.meta meta) {
        this.meta = meta;
    }
}
