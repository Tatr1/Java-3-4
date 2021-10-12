package ru.netology;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Cinema {
    private int indexId;
    private int id;
    private String style;
    private String name;
    private String picture;

    public Cinema(int indexId, int id, String style, String name, String picture) {
        this.indexId = indexId;
        this.id = id;
        this.style = style;
        this.name = name;
        this.picture = picture;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        if (indexId <= 0) {
            indexId = 10;
        }
//        if (indexId > 10) {
//            indexId = 10;
//        }
        this.indexId = indexId;
    }

    public int getId() {
        return id;
    }


    public String getStyle() {
        return style;
    }


    public String getName() {
        return name;
    }


    public String getPicture() {
        return picture;
    }

}