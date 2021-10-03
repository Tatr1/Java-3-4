package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cinema {
    private int indexId;
    private int id;
    private String style;
    private String name;
    private String picture;

}