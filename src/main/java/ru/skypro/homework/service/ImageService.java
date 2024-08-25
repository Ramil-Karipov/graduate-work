package ru.skypro.homework.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.model.ImagesModel;

public interface ImageService {

    ImagesModel addImage(MultipartFile file);

    ImagesModel getImage(Integer id);

    void removeImage(Integer id);

    ImagesModel updateImage(Integer id, MultipartFile file);
}
