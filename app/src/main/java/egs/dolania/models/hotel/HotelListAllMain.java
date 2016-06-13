package egs.dolania.models.hotel;

import java.util.List;

import egs.dolania.models.Pagination;

/**
 * Created by hosein on 6/7/16.
 */
public class HotelListAllMain {
    private List<hotelMain> data;
    private String error;
    private egs.dolania.models.meta meta;
    private Pagination pagination;

    public List<hotelMain> getData() {
        return data;
    }

    public void setData(List<hotelMain> data) {
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

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
