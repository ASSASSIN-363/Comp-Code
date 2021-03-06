package com.mrwhitehat.compcode;

public class Api_custom {

    private String name;
    private String url;
    private String platform;
    private String start_time;
    private String start_date;
    private String end_time;
    private String end_date;
    private String uid;

    public Api_custom(){

    }

    public Api_custom(String name, String url, String platform, String start_time, String start_date, String end_time, String end_date, String uid) {

        this.name = name;
        this.url = url;
        this.platform = platform;
        this.start_time = start_time;
        this.start_date = start_date;
        this.end_time = end_time;
        this.end_date = end_date;
        this.uid = uid;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Api_custom{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", platform='" + platform + '\'' +
                ", start_time='" + start_time + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_time='" + end_time + '\'' +
                ", end_date='" + end_date + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
