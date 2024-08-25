package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.model.ImagesModel;
import ru.skypro.homework.service.ImageService;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] getImage(@PathVariable Integer id) {
        ImagesModel imagesModel = imageService.getImage(id);

        return imagesModel.getData();
    }

    @PostMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] addImage(@RequestBody MultipartFile file) {
        ImagesModel imagesModel = imageService.addImage(file);

        return imagesModel.getData();
    }

    @PatchMapping(value = "/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] updateImage(@RequestBody MultipartFile file, @PathVariable Integer id) {
        ImagesModel imagesModel = imageService.updateImage(id, file);

        return imagesModel.getData();
    }
}