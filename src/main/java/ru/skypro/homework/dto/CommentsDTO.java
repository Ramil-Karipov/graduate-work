package ru.skypro.homework.dto;

import lombok.Data;
import ru.skypro.homework.model.CommentModel;

import java.util.List;

@Data
public class CommentsDTO {

    private int count;
    private List<CommentModel> results;
}