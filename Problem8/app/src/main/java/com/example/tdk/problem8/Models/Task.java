package com.example.tdk.problem8.Models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by TDK on 3/21/2018.
 */

public class Task {
    private String title;
    private String desciption;
    private Date dateFinish;
    private Date hourFinish;

    public Task() {
        super();
    }

    public Task(String title, String desciption, Date dateFinish, Date hourFinish) {
        super();
        this.title = title;
        this.desciption = desciption;
        this.dateFinish = dateFinish;
        this.hourFinish = hourFinish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Date getHourFinish() {
        return hourFinish;
    }

    public void setHourFinish(Date hourFinish) {
        this.hourFinish = hourFinish;
    }

    /**
     * lấy định dạng ngày
     *
     * @param d
     * @return
     */
    public String getDateFormat(Date d) {
        SimpleDateFormat dft = new
                SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return dft.format(d);
    }

    /**
     * lấy định dạng giờ phút
     *
     * @param d
     * @return
     */
    public String getHourFormat(Date d) {
        SimpleDateFormat dft = new
                SimpleDateFormat("hh:mm a", Locale.getDefault());
        return dft.format(d);
    }

    @Override
    public String toString() {
        return this.title + "-" +
                getDateFormat(this.dateFinish) + "-" +
                getHourFormat(this.hourFinish);
    }
}
