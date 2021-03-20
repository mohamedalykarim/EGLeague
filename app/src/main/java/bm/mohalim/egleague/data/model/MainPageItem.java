package bm.mohalim.egleague.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MainPageItem implements Parcelable {
    String title;
    int image;
    String url;

    public MainPageItem() {
    }

    protected MainPageItem(Parcel in) {
        title = in.readString();
        image = in.readInt();
        url = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(image);
        dest.writeString(url);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MainPageItem> CREATOR = new Creator<MainPageItem>() {
        @Override
        public MainPageItem createFromParcel(Parcel in) {
            return new MainPageItem(in);
        }

        @Override
        public MainPageItem[] newArray(int size) {
            return new MainPageItem[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
