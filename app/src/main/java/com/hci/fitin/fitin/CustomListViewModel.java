package com.hci.fitin.fitin;

/**
 * Created by Vikas on 11/23/2015.
 */
public class CustomListViewModel {
    private String txt_CategoryName;
    private String txt_Percentage;
    private int img_CategoryResourceId;
    private int img_FavReourceId;
    private int img_CheckInResourceId;

    public CustomListViewModel(String category,String percentage, int categoryImageresourceId,int favImageResourceId,int checkInImageResourceId) {
        this.setTxt_CategoryName(category);
        this.setTxt_Percentage(percentage);
        this.setImg_CategoryResourceId(categoryImageresourceId);
        this.setImg_FavReourceId(favImageResourceId);
        this.setImg_CheckInResourceId(checkInImageResourceId);
    }


    public String getTxt_CategoryName() {
        return txt_CategoryName;
    }

    public void setTxt_CategoryName(String txt_CategoryName) {
        this.txt_CategoryName = txt_CategoryName;
    }

    public int getImg_CategoryResourceId() {
        return img_CategoryResourceId;
    }

    public void setImg_CategoryResourceId(int img_CategoryResourceId) {
        this.img_CategoryResourceId = img_CategoryResourceId;
    }

    public String getTxt_Percentage() {
        return txt_Percentage;
    }

    public void setTxt_Percentage(String txt_Percentage) {
        this.txt_Percentage = txt_Percentage;
    }

    public int getImg_CheckInResourceId() {
        return img_CheckInResourceId;
    }

    public void setImg_CheckInResourceId(int img_CheckInResourceId) {
        this.img_CheckInResourceId = img_CheckInResourceId;
    }

    public int getImg_FavReourceId() {
        return img_FavReourceId;
    }

    public void setImg_FavReourceId(int img_FavReourceId) {
        this.img_FavReourceId = img_FavReourceId;
    }
}
