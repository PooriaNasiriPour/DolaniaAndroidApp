package egs.dolania.models.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hosein on 6/7/16.
 */
public class Hotelphotos {


    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("ItemId")
    @Expose
    private int itemId;
    @SerializedName("ItemType")
    @Expose
    private String itemType;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("InsertDateTime")
    @Expose
    private String insertDateTime;
    @SerializedName("UpdateDateTime")
    @Expose
    private String updateDateTime;
    @SerializedName("DeleteDateTime")
    @Expose
    private String deleteDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getInsertDateTime() {
        return insertDateTime;
    }

    public void setInsertDateTime(String insertDateTime) {
        this.insertDateTime = insertDateTime;
    }

    public String getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getDeleteDateTime() {
        return deleteDateTime;
    }

    public void setDeleteDateTime(String deleteDateTime) {
        this.deleteDateTime = deleteDateTime;
    }
}
