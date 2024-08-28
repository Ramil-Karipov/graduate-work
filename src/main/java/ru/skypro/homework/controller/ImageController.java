package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.models.entity.Images;
import ru.skypro.homework.service.ImageService;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] getImage(@PathVariable Integer id) {
        Images images = imageService.getImage(id);

        return images.getData();
    }

    @PreAuthorize("!hasRole('ROLE_ANONYMOUS')")
    @PostMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] addImage(@RequestBody MultipartFile file) {
        Images images = imageService.addImage(file);

        return images.getData();
    }

    @PreAuthorize("!hasRole('ROLE_ANONYMOUS')")
    @PatchMapping(value = "/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] updateImage(@RequestBody MultipartFile file, @PathVariable Integer id) {
        Images images = imageService.updateImage(id, file);

        return images.getData();
    }
}
