package ru.skypro.homework.dto;

import lombok.Data;
import ru.skypro.homework.model.AdModel;

import java.util.List;

@Data
public class AdsDTO {
    private int count;
    private List<AdModel> results;
}

