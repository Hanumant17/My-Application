package com.example.famousthings;

import android.os.Parcel;
import android.os.Parcelable;

public class Image implements Parcelable {
    private  int imageSrc;
    private  String imageTitle;
    private  String place;
    private  String famousFor;
    private  String imageDesc;

    public Image(int imageSrc, String imageTitle, String place, String famousFor, String imageDesc) {
        this.imageSrc = imageSrc;
        this.imageTitle = imageTitle;
        this.place = place;
        this.famousFor = famousFor;
        this.imageDesc = imageDesc;
    }


    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFamousFor() {
        return famousFor;
    }

    public void setFamousFor(String famousFor) {
        this.famousFor = famousFor;
    }


    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }


    protected Image(Parcel in) {
        imageSrc = in.readInt();
        imageTitle = in.readString();
        place = in.readString();
        famousFor = in.readString();
        imageDesc = in.readString();

    }
    public static final Creator<Image> CREATOR = new Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel in) {
            return new Image(in);
        }

        @Override
        public Image[] newArray(int size) {
            return new Image[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageSrc);
        dest.writeString(imageTitle);
        dest.writeString(place);
        dest.writeString(famousFor);
        dest.writeString(imageDesc);
    }
}
