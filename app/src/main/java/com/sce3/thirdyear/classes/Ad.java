package com.sce3.thirdyear.classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by win7 on 25/05/2015.
 */
public class Ad implements Serializable {
    private static final long serialVersionUID = -7060210544600464481L;
    Apartment apartment;
    ArrayList<String> imgSrcs;
    public Ad(Apartment apartment, ArrayList<String> imgSrcs) {
        this.apartment = apartment;
        this.imgSrcs = imgSrcs;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public ArrayList<String> getImgSrcs() {
        return imgSrcs;
    }

    public void setImgSrcs(ArrayList<String> imgSrcs) {
        this.imgSrcs = imgSrcs;
    }



}
