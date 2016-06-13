package egs.dolania.models.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hosein on 6/7/16.
 */
public class HotelLocation {
    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("ParentId")
    @Expose
    private int parentId;
    @SerializedName("TypeId")
    @Expose
    private int typeId;
    @SerializedName("GeoPoint")
    @Expose
    private String geoPoint;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("DescriptionEn")
    @Expose
    private Object descriptionEn;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("PhotoId")
    @Expose
    private String photoId;
    @SerializedName("ThumbPhotoId")
    @Expose
    private String thumbPhotoId;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("NameEn")
    @Expose
    private String nameEn;
    @SerializedName("Zoom")
    @Expose
    private int zoom;
    @SerializedName("InsertDateTime")
    @Expose
    private String insertDateTime;
    @SerializedName("UpdateDateTime")
    @Expose
    private String updateDateTime;
    @SerializedName("DeleteDateTime")
    @Expose
    private String deleteDateTime;
    @SerializedName("Parent")
    @Expose
    private String parent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(String geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(Object descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getThumbPhotoId() {
        return thumbPhotoId;
    }

    public void setThumbPhotoId(String thumbPhotoId) {
        this.thumbPhotoId = thumbPhotoId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
