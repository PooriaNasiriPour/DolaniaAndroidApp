package egs.dolania.models.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hosein on 6/7/16.
 */
public class hotelMain {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("HotelTypeId")
    @Expose
    private int hotelTypeId;
    @SerializedName("SupplierId")
    @Expose
    private int supplierId;
    @SerializedName("ClassId")
    @Expose
    private int classId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ShortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Condition")
    @Expose
    private String condition;
    @SerializedName("Slug")
    @Expose
    private String slug;
    @SerializedName("ZipCode")
    @Expose
    private String zipCode;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("LocationId")
    @Expose
    private int locationId;
    @SerializedName("Capacity")
    @Expose
    private int capacity;
    @SerializedName("StarCount")
    @Expose
    private int starCount;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("ThemeId")
    @Expose
    private int themeId;
    @SerializedName("FreeWifi")
    @Expose
    private Boolean freeWifi;
    @SerializedName("Gym")
    @Expose
    private Boolean gym;
    @SerializedName("Meeting")
    @Expose
    private Boolean meeting;
    @SerializedName("Parking")
    @Expose
    private Boolean parking;
    @SerializedName("Pool")
    @Expose
    private Boolean pool;
    @SerializedName("Restaurant")
    @Expose
    private Boolean restaurant;
    @SerializedName("SmokingArea")
    @Expose
    private Boolean smokingArea;
    @SerializedName("GuestPlace")
    @Expose
    private Boolean guestPlace;
    @SerializedName("ChildCare")
    @Expose
    private Boolean childCare;
    @SerializedName("Breakfast")
    @Expose
    private Boolean breakfast;
    @SerializedName("PayType")
    @Expose
    private int payType;
    @SerializedName("Rating")
    @Expose
    private int rating;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("ViewCount")
    @Expose
    private int viewCount;
    @SerializedName("BookedCount")
    @Expose
    private int bookedCount;
    @SerializedName("RemainCount")
    @Expose
    private int remainCount;
    @SerializedName("InsertDateTime")
    @Expose
    private String insertDateTime;
    @SerializedName("UpdateDateTime")
    @Expose
    private String updateDateTime;
    @SerializedName("DeleteDateTime")
    @Expose
    private String deleteDateTime;
    @SerializedName("NameEn")
    @Expose
    private String nameEn;
    @SerializedName("ShortDescriptionEn")
    @Expose
    private String shortDescriptionEn;
    @SerializedName("DescriptionEn")
    @Expose
    private String descriptionEn;
    @SerializedName("ConditionEn")
    @Expose
    private String conditionEn;
    @SerializedName("Supplier")
    @Expose
    private String supplier;
    @SerializedName("FavoriteCount")
    @Expose
    private int favoriteCount;
    @SerializedName("RoomCount")
    @Expose
    private int roomCount;
    @SerializedName("Location")
    @Expose
    private HotelLocation Location;

    @SerializedName("Photos")
    @Expose
    private List<Hotelphotos> Photos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotelTypeId() {
        return hotelTypeId;
    }

    public void setHotelTypeId(int hotelTypeId) {
        this.hotelTypeId = hotelTypeId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public Boolean getFreeWifi() {
        return freeWifi;
    }

    public void setFreeWifi(Boolean freeWifi) {
        this.freeWifi = freeWifi;
    }

    public Boolean getGym() {
        return gym;
    }

    public void setGym(Boolean gym) {
        this.gym = gym;
    }

    public Boolean getMeeting() {
        return meeting;
    }

    public void setMeeting(Boolean meeting) {
        this.meeting = meeting;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getPool() {
        return pool;
    }

    public void setPool(Boolean pool) {
        this.pool = pool;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }

    public Boolean getSmokingArea() {
        return smokingArea;
    }

    public void setSmokingArea(Boolean smokingArea) {
        this.smokingArea = smokingArea;
    }

    public Boolean getGuestPlace() {
        return guestPlace;
    }

    public void setGuestPlace(Boolean guestPlace) {
        this.guestPlace = guestPlace;
    }

    public Boolean getChildCare() {
        return childCare;
    }

    public void setChildCare(Boolean childCare) {
        this.childCare = childCare;
    }

    public Boolean getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getBookedCount() {
        return bookedCount;
    }

    public void setBookedCount(int bookedCount) {
        this.bookedCount = bookedCount;
    }

    public int getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(int remainCount) {
        this.remainCount = remainCount;
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

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getShortDescriptionEn() {
        return shortDescriptionEn;
    }

    public void setShortDescriptionEn(String shortDescriptionEn) {
        this.shortDescriptionEn = shortDescriptionEn;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getConditionEn() {
        return conditionEn;
    }

    public void setConditionEn(String conditionEn) {
        this.conditionEn = conditionEn;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public HotelLocation getLocation() {
        return Location;
    }

    public void setLocation(HotelLocation location) {
        Location = location;
    }

    public List<Hotelphotos> getPhotos() {
        return Photos;
    }

    public void setPhotos(List<Hotelphotos> photos) {
        Photos = photos;
    }
}
