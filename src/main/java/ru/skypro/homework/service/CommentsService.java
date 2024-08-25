package ru.skypro.homework.service;

import ru.skypro.homework.dto.CommentDTO;

import java.util.List;

public interface CommentsService {

    List<CommentDTO> getAdsComments(String adPk);

    CommentDTO addAdsComments(String adPk, CommentDTO adsCommentDto);

    void deleteAdsComment(String adPk, Integer id);

    CommentDTO getAdsComment(String adPk, Integer id);

    CommentDTO updateAdsComment(String adPk, Integer id, CommentDTO adsCommentDto);

}

